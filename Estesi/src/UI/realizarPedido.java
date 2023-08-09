package UI;

import Datos.Conexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class realizarPedido extends JFrame {
	private JComboBox<String> comboBoxProductos;
	private JTextArea textAreaPedido;
	private JComboBox<String> comboBoxClientes;
	private JButton btnAgregarProducto;
	private JButton btnFinalizarPedido;

	private Connection conexion;

	private int idPedido;
	private double totalPedido;
	private int idCliente;

	public realizarPedido(int idCliente) {

		this.idCliente = idCliente;
		setTitle("Realizar Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		// Crear la conexi�n a la base de datos
		Conexion con = new Conexion();
		conexion = con.conectar();

		// Crear el panel principal
		JPanel panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);

		// Crear el combo box de productos
		comboBoxProductos = new JComboBox<>();
		comboBoxProductos.setBounds(20, 20, 200, 25);
		panel.add(comboBoxProductos);

		// Crear el bot�n "Agregar Producto"
		btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.setBounds(240, 20, 130, 25);
		panel.add(btnAgregarProducto);

		// Crear el �rea de texto para mostrar el pedido
		textAreaPedido = new JTextArea();
		textAreaPedido.setBounds(20, 60, 350, 150);
		textAreaPedido.setEditable(false);
		panel.add(textAreaPedido);

		// Crear el bot�n "Finalizar Pedido"
		btnFinalizarPedido = new JButton("Finalizar Pedido");
		btnFinalizarPedido.setBounds(240, 220, 130, 25);
		panel.add(btnFinalizarPedido);

		// Obtener los productos disponibles de la base de datos y agregarlos al combo
		// box
		obtenerProductos();

		// Obtener los clientes disponibles de la base de datos y agregarlos al combo
		// box
		// obtenerClientes();

		// Configurar la acci�n del bot�n "Agregar Producto"
		btnAgregarProducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				agregarProducto();
			}
		});

		// Configurar la acci�n del bot�n "Finalizar Pedido"
		btnFinalizarPedido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				finalizarPedido();
			}
		});

		// Mostrar la ventana
		setVisible(true);
	}

	private void obtenerProductos() {
		try {
			String query = "SELECT nombre FROM producto";
			PreparedStatement stmt = conexion.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String nombreProducto = rs.getString("nombre");
				comboBoxProductos.addItem(nombreProducto);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	private void agregarProducto() {
		String productoSeleccionado = (String) comboBoxProductos.getSelectedItem();
		int cantidad = obtenerCantidad();

		if (cantidad > 0) {

			if (obtenerCantidadPorProducto(productoSeleccionado) < cantidad) {
				JOptionPane.showMessageDialog(null, "Stock insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {

				double precio = obtenerPrecioProducto(productoSeleccionado);
				double subtotal = precio * cantidad;
				String lineaPedido = productoSeleccionado + " (Cantidad: " + cantidad + ", Subtotal: $" + subtotal
						+ ")";
				textAreaPedido.append(lineaPedido + "\n");

				totalPedido += subtotal; // Actualizar el total del pedido
			}
		} else {
			JOptionPane.showMessageDialog(null, "La cantidad ingresada es inv�lida.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private int obtenerCantidadPorProducto(String nombreProducto) {

		try {
			String query = "SELECT cantidad FROM producto WHERE nombre = '" + nombreProducto + "'";
			PreparedStatement stmt = conexion.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int cantidad = rs.getInt("cantidad");
				return cantidad;
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	private int obtenerCantidad() {
		String cantidadTexto = JOptionPane.showInputDialog(null, "Ingrese la cantidad:");
		int cantidad = 0;

		try {
			cantidad = Integer.parseInt(cantidadTexto);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return cantidad;
	}

	private double obtenerPrecioProducto(String nombreProducto) {
		double precio = 0.0;

		try {
			String query = "SELECT precio FROM producto WHERE nombre = ?";
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, nombreProducto);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				precio = rs.getDouble("precio");
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return precio;
	}

	private void finalizarPedido() {
		guardarPedido(); // Guardar el totalFinal en lugar del totalPedido
		guardarFormaPago();
		guardarProductosPedido();
		JOptionPane.showMessageDialog(null, "Pedido registrado correctamente.", "Pedido Finalizado",
				JOptionPane.INFORMATION_MESSAGE);
		dispose();
	}

	private void guardarPedido() {
		try {
			String insertQuery = "INSERT INTO pedido (total, descuento, formaPago, idCliente, estado, idVendedor) VALUES (?, ?, ?, ?, 1, 0)";
			PreparedStatement stmt = conexion.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setDouble(1, totalPedido);
			stmt.setInt(2, 0);
			stmt.setString(3, "");
			stmt.setInt(4, idCliente);
			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				idPedido = rs.getInt(1);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void guardarFormaPago() {
		String formaPago = obtenerFormaPago();

		try {
			String insertQuery = "UPDATE pedido SET formaPago = ? WHERE idPedido = ?";
			PreparedStatement stmt = conexion.prepareStatement(insertQuery);
			stmt.setString(1, formaPago);
			stmt.setInt(2, idPedido);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String obtenerFormaPago() {
		String formaPago = null;

		Object[] opciones = { "Efectivo", "Cr�dito", "D�bito" };
		int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la forma de pago:", "Forma de Pago",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		if (seleccion != JOptionPane.CLOSED_OPTION) {
			formaPago = opciones[seleccion].toString();
		}

		return formaPago;
	}

	private void guardarProductosPedido() {
		String pedido = textAreaPedido.getText();
		String[] lineasPedido = pedido.split("\n");

		for (String linea : lineasPedido) {
			String nombreProducto = obtenerNombreProducto(linea);
			int cantidad = obtenerCantidadProducto(linea);
			int idProducto = obtenerIdProducto(nombreProducto);
			guardarPedidoProducto(idPedido, idProducto, cantidad); // Pasar la cantidad al m�todo
		}
	}

	private String obtenerNombreProducto(String lineaPedido) {
		String nombreProducto = "";

		int indiceParentesis = lineaPedido.indexOf("(");
		if (indiceParentesis != -1) {
			nombreProducto = lineaPedido.substring(0, indiceParentesis).trim();
		}

		return nombreProducto;
	}

	private int obtenerCantidadProducto(String lineaPedido) {
		int cantidad = 0;
		int indiceInicio = lineaPedido.indexOf("Cantidad: ");
		int indiceFin = lineaPedido.indexOf(", Subtotal:");

		if (indiceInicio != -1 && indiceFin != -1) {
			String cantidadTexto = lineaPedido.substring(indiceInicio + 10, indiceFin).trim();
			cantidad = Integer.parseInt(cantidadTexto);
		}

		return cantidad;
	}

	private int obtenerIdProducto(String nombreProducto) {
		int idProducto = -1;

		try {
			String query = "SELECT idProducto FROM producto WHERE nombre = ?";
			PreparedStatement stmt = conexion.prepareStatement(query);
			stmt.setString(1, nombreProducto);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				idProducto = rs.getInt("idProducto");
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return idProducto;
	}

	private void guardarPedidoProducto(int idPedido, int idProducto, int cantidad) {
		try {
			String insertQuery = "INSERT INTO pedido_producto (idPedido, idProducto, cantidad) VALUES (?, ?, ?)";
			PreparedStatement stmt = conexion.prepareStatement(insertQuery);
			stmt.setInt(1, idPedido);
			stmt.setInt(2, idProducto);
			stmt.setInt(3, cantidad);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void descontarProductos(int idProducto, int cantidad) {
		try {
			String actualizar="UPDATE INTO producto (idProducto, cantidad) VALUES (?, ?)";
			PreparedStatement stmt = conexion.prepareStatement(actualizar);//chequear de aca hasta 333
			stmt.setInt(1, idPedido);
			stmt.setInt(2, idProducto);
			stmt.setInt(3, cantidad);
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new realizarPedido(0);
			}
		});
	}
}
