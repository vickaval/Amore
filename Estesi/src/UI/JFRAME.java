package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
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
import java.awt.Label;


public class JFRAME extends JFrame {
	

	private JLabel imageLabel;

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
		setTitle("Amore Pastas");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
        ImageIcon imageIcon = new ImageIcon("img/amore2.png");
  
        

        // Create the image label
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(10, 10, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        contentPane.add(imageLabel);
		
		
		
		JButton btnNewButton_2 = new JButton("Almacen");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAlmacen va=new VentanaAlmacen();
				va.setVisible(true);
				
				//o.iniciarSesion();
			}
		});
		btnNewButton_2.setBounds(229, 67, 160, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.setBounds(48, 139, 160, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//c.iniciarSesion();
				ventanaCliente vc=new ventanaCliente();
				vc.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Login Administrador");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//controlador.loginAdministrador();
				ventanaAdministrador va=new ventanaAdministrador();
				va.setVisible(true);

			}
		});
		
	
		btnNewButton_1.setBounds(48, 66, 160, 52);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 88, 10, 10);
		contentPane.add(panel);
		
		JButton btnNewButton_2_1 = new JButton("Vendedor");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaVendedor va=new ventanaVendedor();
				va.setVisible(true);
			}
		});
		btnNewButton_2_1.setBounds(229, 140, 160, 50);
		contentPane.add(btnNewButton_2_1);
	}
}

