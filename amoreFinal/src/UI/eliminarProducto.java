package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class eliminarProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarProducto frame = new eliminarProducto();
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
	public eliminarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa el id del producto a eliminar: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 28, 260, 30);
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
		textField.setBounds(157, 69, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Conexion con =  new Conexion();
   		Connection conexion = con.conectar();
   		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement stmt;
				String id=textField.getText();
				int id2=Integer.parseInt(id);
				String sql="DELETE FROM `producto` WHERE idProducto= ?";
			     try {
			      stmt = conexion.prepareStatement(sql);
			      stmt.setInt(1, id2);
			      stmt.executeUpdate();
			      stmt.close();
			      JOptionPane.showMessageDialog(null, " eliminado correctamente");
			      //return true;
			     }catch (Exception e2) {
			      System.out.println("Hubo un error"+e2.getMessage());
			 //  return false;
			  }
			}
		});
		btnNewButton.setBounds(251, 147, 89, 23);
		contentPane.add(btnNewButton);
	}
}

