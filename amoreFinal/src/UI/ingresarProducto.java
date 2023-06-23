package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

import Datos.Conexion;

public class ingresarProducto extends JFrame{
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
					ingresarProducto frame = new ingresarProducto();
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
	public ingresarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del producto:");
		lblNewLabel.setBounds(35, 42, 128, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrecioDelProducto = new JLabel("Precio del producto:");
		lblPrecioDelProducto.setBounds(35, 78, 128, 14);
		contentPane.add(lblPrecioDelProducto);
		
		JLabel lblCantidadDelProducto = new JLabel("Cantidad del producto:");
		lblCantidadDelProducto.setBounds(35, 109, 128, 14);
		contentPane.add(lblCantidadDelProducto);
		
		JLabel lblIdDelDeposito = new JLabel("Id del deposito:");
		lblIdDelDeposito.setBounds(35, 142, 128, 14);
		contentPane.add(lblIdDelDeposito);
		
		JLabel lblIdDeLa = new JLabel("Id de la produccion:");
		lblIdDeLa.setBounds(35, 179, 128, 14);
		contentPane.add(lblIdDeLa);
		
		JLabel lblIdDeLa_1 = new JLabel("Id de la categoria:");
		lblIdDeLa_1.setBounds(35, 215, 128, 14);
		contentPane.add(lblIdDeLa_1);
		
		textField = new JTextField();
		textField.setBounds(189, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(10);
		textField_1.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_1.setBounds(189, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(10);
		textField_2.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});
		textField_2.setBounds(189, 106, 86, 20);
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
		textField_3.setBounds(189, 139, 86, 20);
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
		textField_4.setBounds(189, 176, 86, 20);
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
		textField_5.setBounds(189, 212, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		Conexion con =  new Conexion();
		
   		Connection conexion = con.conectar();
   		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre= textField.getText();
				String precio=textField_1.getText();
				String cantidad=textField_2.getText();
				String idDepo=textField_3.getText();
				String idProduccion=textField_4.getText();
				String idCate=textField_5.getText();
				
				//int id2=Integer.parseInt(id);
				double precio2=Double.parseDouble(precio);
				int stock2=Integer.parseInt(cantidad);
				int idDepo2=Integer.parseInt(idDepo);
				int idP2=Integer.parseInt(idProduccion);
				int idC2=Integer.parseInt(idCate);
				
				 String sql ="INSERT INTO `producto`( `nombre`, `precio`, `cantidad`, `idDepo`, `idProduccion`, `idCategoria`) VALUES (?,?,?,?,?,?) ";
				    	try {
				    		PreparedStatement stmt = conexion.prepareStatement(sql);
				    		stmt.setString(1, nombre);
							stmt.setDouble(2, precio2);
							stmt.setDouble(3, stock2);
							stmt.setInt(4, idDepo2);
							stmt.setInt(5, idP2);
							stmt.setInt(6, idC2);
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
		
		btnNewButton.setBounds(317, 273, 89, 23);
		contentPane.add(btnNewButton);
	}

    
}
