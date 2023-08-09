package UI;
//package UI;

import javax.swing.*;

import Datos.Conexion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ventanaOperario extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    
Conexion con =  new Conexion();;
	
	Connection conexion = con.conectar();
	

    public ventanaOperario() {
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
                //JOptionPane.showMessageDialog(VentanaOperario.this, "Text saved to file!");
                boolean validarContrasena = false;
                do {
                // String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
                // String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");

                    String sql = "SELECT * FROM `operario` WHERE nombre = ? AND contraseña = ?";
                    
                    PreparedStatement stmt = null;
                    ResultSet resultSet = null;

                    try {
                        stmt = conexion.prepareStatement(sql);
                        stmt.setString(1, text1);
                        stmt.setString(2, text2);
                        resultSet = stmt.executeQuery();
                        if (resultSet.next()) {
                            //JOptionPane.showMessageDialog(null, "Se inició correctamente la sesión");
                        	metodosOperario mo = new metodosOperario();
                        	//visualizarMateriaPrima vmp=new visualizarMateriaPrima();
                        	mo.setVisible(true);
                            validarContrasena = true;
                            resultSet.close();
                            stmt.close();
                        } else {
                            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
                            break;
                        }
                    } catch (Exception e2) {
                        JOptionPane.showMessageDialog(null, "Hubo un error: " + e2.getMessage());
                   }           
                } while (!validarContrasena);

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
        JLabel lblContrasea = new JLabel("Contrasna");
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
                new ventanaOperario();
            }
        });
    }
}