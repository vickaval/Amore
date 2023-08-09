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

public class eliminarOperario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarOperario frame = new eliminarOperario();
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
	public eliminarOperario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 177);
		setTitle("Eliminar Operario");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresa el id del operario: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 28, 260, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField(10);
		textField.setBounds(191, 35, 86, 20);
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
				String sql="DELETE FROM `operario` WHERE id= ?";
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
		btnNewButton.setBounds(164, 85, 113, 30);
		contentPane.add(btnNewButton);
	}
}

