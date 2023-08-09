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

public class visualizarStockMP extends JFrame {

    private JPanel contentPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    visualizarStockMP frame = new visualizarStockMP();
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
    public visualizarStockMP() {
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
        model.addColumn("Procedencia");
        model.addColumn("Precio");
        model.addColumn("Stock Disponible");
        model.addColumn("ID Depo");

        // Obtener los datos de la base de datos y agregarlos al modelo de la tabla
        try {
        	Conexion con =  new Conexion();
       		Connection conexion = con.conectar();
            String query = "SELECT * FROM materiaprima";
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String idMp = rs.getString("idMp");
                String nombre = rs.getString("nombre");
                String procedencia = rs.getString("procedencia");
                double precio = rs.getDouble("precio");
                int stockDisponible = rs.getInt("stockDisponible");
                String idDepo = rs.getString("idDepo");

                model.addRow(new Object[] { idMp, nombre, procedencia, precio, stockDisponible, idDepo });
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

        // Crear el botón para volver atrás
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