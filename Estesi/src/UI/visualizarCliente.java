package UI;
import Datos.Conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

public class visualizarCliente extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	visualizarCliente frame = new visualizarCliente();
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
    public visualizarCliente() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Telefono");
        model.addColumn("Cuit");
        model.addColumn("Contrase�a");
        model.addColumn("Razon Social");
        model.addColumn("Condicion Iva");

        // Obtener los datos de la base de datos y agregarlos al modelo de la tabla
        try {
        	Conexion con =  new Conexion();
       		Connection conexion = con.conectar();
            String query = "SELECT * FROM cliente";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int telefono = rs.getInt("telefono");
                int cuit = rs.getInt("cuit");
                String contrase�a = rs.getString("contrase�a");
                String razonSocial = rs.getString("razonSocial");
                String condicionIva = rs.getString("condicionIva");

                model.addRow(new Object[] { id, nombre, apellido, telefono, cuit, contrase�a, razonSocial, condicionIva });
            }

            rs.close();
            stmt.close();
            //conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
