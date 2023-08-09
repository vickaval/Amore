package UI;


import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class editarCliente extends JFrame{
    private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	Conexion con =  new Conexion();;
	Connection conexion = con.conectar();
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editarCliente frame = new editarCliente();
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
	public editarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 493);
		setTitle("Editar Cliente");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id del cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 33, 318, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField(10);
		textField.setBounds(190, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 79, 224, 22);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 82, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				String nombre=textField_1.getText();
				String apellido=textField_2.getText();
				String telefono=textField_3.getText();
				String contraseña=textField_4.getText();
				String cuit=textField_5.getText();
				String razonSocial=textField_6.getText();
				String condicionIva=textField_7.getText();
			
				int id2=Integer.parseInt(id);
				int telefono2=Integer.parseInt(telefono);
				int cuit2 = Integer.parseInt(cuit);
				
				
				
				String sql = "UPDATE `cliente` SET `nombre`= ?, `apellido`= ?, `telefono`= ?, `contraseña`= ?, `cuit`= ?, `razonSocial`= ?, `condicionIva`= ?"
						+ "WHERE id= ?";;
				 try {
					   PreparedStatement stmt = conexion.prepareStatement(sql);   
					   stmt.setInt(1, id2);
					   stmt.setString(2, nombre);
					   stmt.setString(3, apellido);
					   stmt.setInt(4, telefono2);
					   stmt.setString(5, contraseña);
					   stmt.setInt(6, cuit2);
					   stmt.setString(7, razonSocial);
					   stmt.setString(8, condicionIva);
					   stmt.executeUpdate();
					   stmt.close();
					   JOptionPane.showMessageDialog(null, nombre+" editado correctamente");
					   //return true;
					  } catch (Exception e2) {
					   System.out.println("Hubo un error " + e2.getMessage());
					   //return false;
					  }
			}
		});
		btnNewButton.setBounds(98, 393, 121, 29);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 126, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2= new JLabel("Nuevo apellido:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(25, 123, 224, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Nuevo cuit:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(25, 170, 224, 22);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Nuevo telefono:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(25, 211, 224, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nuevo contraseña:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(25, 256, 224, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6= new JLabel("Nuevo razon social:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(25, 298, 224, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7= new JLabel("Nuevo condicion iva:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(25, 342, 224, 22);
		contentPane.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 173, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(190, 214, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(190, 259, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(190, 301, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(190, 345, 86, 20);
		contentPane.add(textField_7);
	}
}