package UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Datos.Conexion;

public class ventanaVendedor extends JFrame {

	 private JTextField textField1;
	    private JTextField textField2;

	    Conexion con = new Conexion();
	    Connection conexion = con.conectar();

	    public ventanaVendedor() {
	        setTitle("Inicio de sesion");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 168);
	        setLocationRelativeTo(null);

	        // Create the text fields
	        textField1 = new JTextField(15);
	        textField1.setBounds(123, 22, 126, 20);
	        textField2 = new JTextField(15);
	        textField2.setBounds(123, 53, 126, 20);

	        // Create the sign up button
	        JButton signUpButton = new JButton("Iniciar sesion");
	        signUpButton.setBounds(123, 88, 126, 23);
	        signUpButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String text1 = textField1.getText();
	                String text2 = textField2.getText();
	                // saveTextToFile(text1, text2);
	                // JOptionPane.showMessageDialog(VentanaOperario.this, "Text saved to file!");
	                boolean validarContrasena = false;

	                // String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
	                // String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");

	                String sql = "SELECT * FROM `vendedor` WHERE nombre = ? AND contraseña = ?";

	                try {
	                    PreparedStatement stmt = conexion.prepareStatement(sql);
	                    stmt.setString(1, text1);
	                    stmt.setString(2, text2);
	                    ResultSet resultSet = stmt.executeQuery();

	                    if (resultSet.next()) {
	                        // JOptionPane.showMessageDialog(null, "Se inició correctamente la sesión");
	                        metodosVendedor mv = new metodosVendedor();
	                        // visualizarMateriaPrima vmp=new visualizarMateriaPrima();
	                        mv.setVisible(true);
	                        validarContrasena = true;
	                        resultSet.close();
	                        stmt.close();
	                        dispose(); // Cerrar la ventana actual después de iniciar sesión correctamente
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
	                    }
	                } catch (Exception e2) {
	                    JOptionPane.showMessageDialog(null, "Hubo un error: " + e2.getMessage());
	                }

	                // return validarContrasena;

	            }
	        });

	        // Create a panel to hold the components
	        JPanel panel = new JPanel();
	        panel.setLayout(null);
	        JLabel lblNombre = new JLabel("Nombre");
	        lblNombre.setBounds(20, 23, 64, 14);
	        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        panel.add(lblNombre);
	        panel.add(textField1);
	        JLabel lblContrasea = new JLabel("Contrasena");
	        lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblContrasea.setBounds(20, 54, 103, 14);
	        panel.add(lblContrasea);
	        panel.add(textField2);
	        panel.add(signUpButton);

	        // Add the panel to the frame
	        getContentPane().add(panel);

	        // Display the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new ventanaVendedor();
	            }
	        });
	    }
	}

