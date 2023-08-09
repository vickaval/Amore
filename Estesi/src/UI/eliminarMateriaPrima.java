package UI;
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
public class eliminarMateriaPrima extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarMateriaPrima frame = new eliminarMateriaPrima();
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
	public eliminarMateriaPrima() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el nombre de la materia prima a eliminar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 306, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField(10);
		/*textField.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				 if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
	                    e.consume();
	                }
			}
		});*/
		textField.setBounds(87, 45, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		Conexion con =  new Conexion();
		
   		Connection conexion = con.conectar();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				
				String sql = "DELETE FROM `materiaprima` WHERE nombre = ?";
		        PreparedStatement stmt = null;

		        try {
		            stmt = conexion.prepareStatement(sql);
		            stmt.setString(1, id);
		            stmt.executeUpdate();
		            stmt.close();
		            JOptionPane.showMessageDialog(null," eliminada correctamente");
		            //return true;
		        } catch (Exception e2) {
		            System.out.println("Hubo un error: " + e2.getMessage());
		            //return false;
		        }
			}
		});
		btnNewButton.setBounds(262, 84, 99, 23);
		contentPane.add(btnNewButton);
	}
    
}
