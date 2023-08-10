package UI;

import Datos.Conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class prepararPedidos extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JLabel lblMensaje;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    prepararPedidos frame = new prepararPedidos();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public prepararPedidos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pedido");
        model.addColumn("Descuento");
        model.addColumn("Cantidad");
        model.addColumn("Nombre Producto");
        model.addColumn("Cantidad Producto");
        model.addColumn("ID Producto");

        // Obtener los datos de la base de datos y agregarlos al modelo de la tabla
        try {
            Conexion con = new Conexion();
            Connection conexion = con.conectar();
            String sql = "SELECT p.idPedido, p.descuento, pp.cantidad, pr.nombre AS nombreProducto, pr.cantidad AS cantidadProducto, pr.idProducto\n"
                    + "FROM pedido p \n"
                    + "INNER JOIN pedido_producto pp\n"
                    + "ON p.idPedido = pp.idPedido\n"
                    + "INNER JOIN producto pr\n"
                    + "ON pp.idProducto = pr.idProducto\n"
                    + "WHERE p.estado = 1";

            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();

            StringBuilder mensaje = new StringBuilder();
            boolean hayPedidosPendientes = false;

            while (result.next()) {
                int idPedido = result.getInt("idPedido");
                double descuento = result.getDouble("descuento");
                int cantidadPedido = result.getInt("cantidad");
                int cantidadProducto = result.getInt("cantidadProducto");
                int idProducto = result.getInt("idProducto");

                if (cantidadPedido <= cantidadProducto) {
                    // La cantidad del producto es suficiente, realizar el descuento
                    int nuevaCantidadProducto = cantidadProducto - cantidadPedido;

                    // Actualizar la tabla producto con la nueva cantidad
                    String updateSql = "UPDATE producto SET cantidad = ? WHERE idProducto = ?";
                    PreparedStatement updateStmt = conexion.prepareStatement(updateSql);
                    updateStmt.setInt(1, nuevaCantidadProducto);
                    updateStmt.setInt(2, idProducto);
                    updateStmt.executeUpdate();

                    // Cambio el estado del pedido para indicar que ya se preparó
                    String updateEstadoSql = "UPDATE Pedido SET estado = 0 WHERE idPedido = ?";
                    PreparedStatement updateEstadoStmt = conexion.prepareStatement(updateEstadoSql);
                    updateEstadoStmt.setInt(1, idPedido);
                    updateEstadoStmt.executeUpdate();

                    model.addRow(new Object[] { idPedido, descuento, cantidadPedido, result.getString("nombreProducto"), cantidadProducto, idProducto });
                    hayPedidosPendientes = true;
                } else {
                    // La cantidad del producto es insuficiente
                    mensaje.append(" \n No hay suficiente cantidad del producto ").append(result.getString("nombreProducto")).append(" para el pedido Nro: ").append(idPedido).append("\n");
                }
            }

            // Mostrar el mensaje en un JLabel
            lblMensaje = new JLabel();
            lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(lblMensaje, BorderLayout.NORTH);

            // Mostrar el mensaje de advertencia si corresponde
            if (mensaje.length() > 0) {
                lblMensaje.setText(mensaje.toString());
            } else if (hayPedidosPendientes) {
                lblMensaje.setText("Descuento de productos realizado correctamente.");
            } else {
                lblMensaje.setText("No hay pedidos pendientes.");
            }

            // Crear la tabla y agregarla a un JScrollPane
            table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            contentPane.add(scrollPane, BorderLayout.CENTER);

            // Crear el botón para volver atrás
            JButton btnBack = new JButton("Volver");
            btnBack.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Cerrar la ventana actual
                    dispose();
                }
            });
            contentPane.add(btnBack, BorderLayout.SOUTH);

            result.close();
            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
