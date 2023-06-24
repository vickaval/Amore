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
public class editarC extends JFrame{
    private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	Conexion con =  new Conexion();;
	Connection conexion = con.conectar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editarC frame = new editarC();
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
	public editarC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coloque el id de la categoria a editar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 29, 318, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField(10);
		textField.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField.setBounds(283, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Coloque el nuevo nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(25, 79, 224, 22);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 82, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				String nombre=textField_1.getText();
				
				int id2=Integer.parseInt(id);
				String sql = "UPDATE `categoriaproducto` SET `nombre`= ? WHERE idCategoria= ?";;
				 try {
					   PreparedStatement stmt = conexion.prepareStatement(sql);   
					   stmt.setString(1, nombre);
					   stmt.setInt(2, id2);
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
		btnNewButton.setBounds(283, 146, 89, 23);
		contentPane.add(btnNewButton);
	}


}
