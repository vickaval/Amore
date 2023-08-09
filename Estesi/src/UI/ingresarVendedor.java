package UI;
import Logica.MateriaPrima;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Conexion;

import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;


public class ingresarVendedor extends JFrame{
    private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
					ingresarVendedor frame = new ingresarVendedor();
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
	public ingresarVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 390);
		setTitle("Ingresar Vendedor");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(10);		
		textField.setBounds(190, 43, 134, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 74, 134, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 105, 134, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(10);
		textField_3.setBounds(190, 136, 134, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(10);
		textField_4.setBounds(190, 167, 134, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(10);
		textField_5.setBounds(190, 198, 134, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
		
		textField_6 = new JTextField(10);
		textField_6.setBounds(190, 229, 134, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		
		
		
		
		 Conexion con =  new Conexion();
			
		
		 
   		Connection conexion = con.conectar();
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre= textField.getText();
				String apellido=textField_1.getText();
				String telefono=textField_2.getText();
				String contrase�a=textField_3.getText();
				String sueldo=textField_4.getText();
				String nombreArea=textField_5.getText();
				String aniosAntiguedad=textField_6.getText();
			
				
			
				int telefono2=Integer.parseInt(telefono);
				double sueldo2 = Double.parseDouble(sueldo);
			
				
				 String sql ="INSERT INTO `vendedor`( `nombre`,`apellido`, `telefono`, `contrase�a`, `sueldo`, `nombreArea`, `aniosAntiguedad`)"
					 		+ "VALUES(?,?,?,?,?,?,?)";
				    	try {
				    		PreparedStatement stmt = conexion.prepareStatement(sql);
				    		
							stmt.setString(1, nombre);
							stmt.setString(2, apellido);
							stmt.setInt(3, telefono2);
							stmt.setString(4, contrase�a);
							stmt.setDouble(5, sueldo2);
							stmt.setString(6, nombreArea);
							stmt.setString(7, aniosAntiguedad);
							stmt.executeUpdate();
							stmt.close();
							conexion.close();
							JOptionPane.showMessageDialog(null, nombre+" ingresada correctamente");
				    		//return true;
				    		
				    	} catch (Exception e2) {
				    		System.out.println("Hubo un error"+e2.getMessage());
				    	//	return false;
				    	}
			}
		});
		
		
		
		
		btnNewButton.setBounds(108, 281, 134, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ingresar nombre:");
		lblNewLabel.setBounds(48, 46, 180, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar apellido: ");
		lblNewLabel_1.setBounds(48, 77, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar telefono: ");
		lblNewLabel_2.setBounds(48, 108, 141, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingresar contrase�a:");
		lblNewLabel_3.setBounds(48, 142, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingresar sueldo:");
		lblNewLabel_4.setBounds(48, 173, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ingresar nombre area: ");
		lblNewLabel_5.setBounds(48, 201, 141, 14);
		contentPane.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("Ingresar anios antiguedad: ");
		lblNewLabel_6.setBounds(48, 232, 141, 14);
		contentPane.add(lblNewLabel_6);
		
		
	
	}
    
}
