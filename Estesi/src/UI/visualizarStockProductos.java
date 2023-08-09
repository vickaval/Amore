package UI;
import Datos.Conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class visualizarStockProductos extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    visualizarStockProductos frame = new visualizarStockProductos(false);
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
    public visualizarStockProductos(boolean esCliente) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        DefaultTableModel model = new DefaultTableModel();
        if(esCliente) {
        	
        	// Crear el modelo de la tabla
            model.addColumn("Nombre");
            model.addColumn("Precio");
            model.addColumn("Stock");
            model.addColumn("Categoria");

            // Obtener los datos de la base de datos y agregarlos al modelo de la tabla
            try {
                Conexion con = new Conexion();
                Connection conexion = con.conectar();
                String query = "SELECT * FROM producto p join categoriaproducto cp on cp.idCategoria = p.idCategoria";
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    String nombre = rs.getString("p.nombre");
                    double precio = rs.getDouble("p.precio");
                    int stock = rs.getInt("p.cantidad");
                    String categoria = rs.getString("cp.nombre");

                    model.addRow(new Object[] { nombre, precio, stock, categoria });
                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
        	
        	// Crear el modelo de la tabla
            model.addColumn("ID Producto");
            model.addColumn("Nombre");
            model.addColumn("Precio");
            model.addColumn("Cantidad");
            model.addColumn("ID Depo");
            model.addColumn("ID Produccion");
            model.addColumn("ID Categoria");

            // Obtener los datos de la base de datos y agregarlos al modelo de la tabla
            try {
                Conexion con = new Conexion();
                Connection conexion = con.conectar();
                String query = "SELECT * FROM producto";
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    int idProducto = rs.getInt("idProducto");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int cantidad = rs.getInt("cantidad");
                    int idDepo = rs.getInt("idDepo");
                    int idProduccion = rs.getInt("idProduccion");
                    int idCategoria = rs.getInt("idCategoria");

                    model.addRow(new Object[] { idProducto, nombre, precio, cantidad, idDepo, idProduccion, idCategoria });
                }

                rs.close();
                stmt.close();
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Crear la tabla y agregarla a un JScrollPane
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Crear el bot�n para volver atr�s
        JButton btnBack = new JButton("Volver");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual
                dispose();
            }
        });
        contentPane.add(btnBack, BorderLayout.SOUTH);
    }
}


