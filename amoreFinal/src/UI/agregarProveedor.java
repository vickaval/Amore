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
import Logica.Proveedor;

public class agregarProveedor extends JFrame {
	private JTextField textField1;
    private JTextField textField2;
    
   Conexion con =  new Conexion();;
	
	Connection conexion = con.conectar();
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblProvee;
	private JLabel lblMonto;
	private JLabel lblDeuda;



	public agregarProveedor() {

		setContentPane(contentPane);
		
		
		
		JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(40, 23, 64, 14);
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(lblNombre);
        panel.add(textField1);
        JLabel lblContrasea = new JLabel("Cuit:");
        lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContrasea.setBounds(40, 54, 103, 14);
        panel.add(lblContrasea);
        panel.add(textField2);
       

        // Add the panel to the frame
        getContentPane().add(panel);
        
        textField = new JTextField(15);
        textField.setBounds(189, 90, 126, 20);
        panel.add(textField);
        
        textField_1 = new JTextField(15);
        textField_1.setBounds(189, 121, 126, 20);
        panel.add(textField_1);
        
        textField_2 = new JTextField(15);
        textField_2.setBounds(189, 154, 126, 20);
        panel.add(textField_2);
        
        lblProvee = new JLabel("Material provee:");
        lblProvee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProvee.setBounds(41, 91, 103, 14);
        panel.add(lblProvee);
        
        lblMonto = new JLabel("Monto comprado:");
        lblMonto.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMonto.setBounds(40, 122, 139, 14);
        panel.add(lblMonto);
        
        lblDeuda = new JLabel("Deuda:");
        lblDeuda.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDeuda.setBounds(40, 155, 103, 14);
        panel.add(lblDeuda);

        // Display the frame
        setVisible(true);
        
        
		setTitle("Agregar Proveedor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(367, 295);
        setLocationRelativeTo(null);

        // Create the text fields
        textField1 = new JTextField(15);
        textField1.setBounds(189, 22, 126, 20);
        textField2 = new JTextField(15);
        textField2.setBounds(189, 53, 126, 20);

        // Create the sign up button
        JButton signUpButton = new JButton("Agregar");
        panel.add(signUpButton);
        signUpButton.setBounds(71, 201, 219, 33);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                

                String sql ="INSERT INTO `proveedor`(`nombre`, `materialesQueProvee`, `cuit`, `montoComprado`,`deuda`) VALUES (?,?,?,?,?) ";
                
                PreparedStatement stmt = null;
                ResultSet resultSet = null;
    			
    			try {
    				stmt = conexion.prepareStatement(sql);
    				
    				stmt.setString(1, lblNombre.getText());
    				stmt.setString(2, lblContrasea.getText());
    				stmt.setInt(3, lblProvee.getX());
    				stmt.setDouble(4, lblMonto.getAlignmentX());
    				stmt.setDouble(5, lblDeuda.getAlignmentX());		
    				stmt.executeUpdate();
    				conexion.close();
    				 resultSet.close();
                     stmt.close();
    				JOptionPane.showMessageDialog(null, "Se agrego al proveedor");    				
    			} catch (Exception ex) {
    				System.out.println("Hubo un error"+ex.getMessage());
    				
    			}
    			
   			 
            }
        });
	

	} 
	
