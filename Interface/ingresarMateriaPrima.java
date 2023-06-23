package Interface;

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

public class ingresarMateriaPrima extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ingresarMateriaPrima frame = new ingresarMateriaPrima();
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
	public ingresarMateriaPrima() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(10);
		textField.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField.setBounds(238, 22, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 64, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(238, 108, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(10);
		textField_3.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		
		textField_3.setBounds(238, 151, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(10);
		textField_4.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_4.setBounds(238, 193, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField(10);
		textField_5.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_5.setBounds(238, 230, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		 Conexion con =  new Conexion();
			
   		Connection conexion = con.conectar();
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id= textField.getText();
				String nombre=textField_1.getText();
				String procedencia=textField_2.getText();
				String precio=textField_3.getText();
				String stock=textField_4.getText();
				String idDepo=textField_5.getText();
				
				int id2=Integer.parseInt(id);
				double precio2=Double.parseDouble(precio);
				int stock2=Integer.parseInt(stock);
				int idDepo2=Integer.parseInt(idDepo);
				
				 String sql ="INSERT INTO `materiaprima`( `idMp`,`nombre`, `procedencia`, `precio`, `stockDisponible`, `idDepo`)"
					 		+ "VALUES(?,?,?,?,?,?)";
				    	try {
				    		PreparedStatement stmt = conexion.prepareStatement(sql);
				    		
							stmt.setInt(1, id2);
							stmt.setString(2, nombre);
							stmt.setString(3, procedencia);
							stmt.setDouble(4, precio2);
							stmt.setInt(5, stock2);
							stmt.setInt(6, idDepo2);
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
		btnNewButton.setBounds(332, 265, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Ingresar id de la materia prima:");
		lblNewLabel.setBounds(25, 25, 180, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar nombre: ");
		lblNewLabel_1.setBounds(25, 67, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar procedencia: ");
		lblNewLabel_2.setBounds(25, 111, 141, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingresar precio:");
		lblNewLabel_3.setBounds(25, 154, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ingresar stock:");
		lblNewLabel_4.setBounds(25, 196, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ingresar id del deposito: ");
		lblNewLabel_5.setBounds(25, 233, 141, 14);
		contentPane.add(lblNewLabel_5);
	}
}

