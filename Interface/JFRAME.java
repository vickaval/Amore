package Interface;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JOptionPane;
import Datos.Administrador;
import Logica.*;
import javax.swing.JScrollPane;


public class JFRAME extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFRAME frame = new JFRAME();
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
	public JFRAME() {
		
		Administrador controlador = new Administrador("", "", "", "", 0, "");
		Cliente c=new Cliente("", "", "", "", 0, "", 0, "", "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Amore Pasta");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JButton btnNewButton_2 = new JButton("Almacen");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAlmacen va=new VentanaAlmacen();
				va.setVisible(true);
				
				//o.iniciarSesion();
			}
		});
		btnNewButton_2.setBounds(10, 66, 99, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.setBounds(288, 66, 105, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.iniciarSesion();
				//VentanaCliente vc=new VentanaCliente();
				//vc.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Login Administrador");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.loginAdministrador();
				//VentanaAdministrador va=new VentanaAdministrador();
				//va.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(119, 66, 160, 52);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 88, 10, 10);
		contentPane.add(panel);
	}
}

