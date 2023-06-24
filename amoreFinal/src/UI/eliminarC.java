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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class eliminarC extends JFrame{
private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarC frame = new eliminarC();
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
	public eliminarC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa el nombre de la categoria a eliminar: ");
		lblNewLabel.setBounds(22, 43, 313, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 89, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Conexion con =  new Conexion();;
		Connection conexion = con.conectar();
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=textField.getText();
				String sql = "DELETE FROM `categoriaproducto` WHERE nombre= ?";
				  try {
				   PreparedStatement stmt = conexion.prepareStatement(sql);   
				   stmt.setString(1, nombre);
				   stmt.executeUpdate();
				   stmt.close();
				   JOptionPane.showMessageDialog(null, nombre+" correctamente eliminado");
				   //return true;
				  } catch (Exception e2) {
				   System.out.println("Hubo un error " + e2.getMessage());
				   //return false;
				  }
			}
		});
		btnNewButton.setBounds(259, 166, 89, 23);
		contentPane.add(btnNewButton);
	}
}
