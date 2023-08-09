package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Operario;

import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaAlmacen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAlmacen frame = new VentanaAlmacen();
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
	public VentanaAlmacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 256);
		setTitle("Almacen");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Operario o = new Operario("", "", "", "", 0, "","","",0,0);
		JTextPane txtpnSeleccioneUnRol = new JTextPane();
		txtpnSeleccioneUnRol.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSeleccioneUnRol.setBackground(Color.LIGHT_GRAY);
		txtpnSeleccioneUnRol.setText("Seleccione un rol");
		txtpnSeleccioneUnRol.setBounds(155, 42, 128, 36);
		contentPane.add(txtpnSeleccioneUnRol);
		
		JButton btnNewButton = new JButton("Almacenista");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaAlmacenista va = new ventanaAlmacenista();
				va.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(44, 112, 145, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Operario");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//o.iniciarSesion();
				ventanaOperario vo=new ventanaOperario();
				vo.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(251, 112, 148, 36);
		contentPane.add(btnNewButton_1);;
		
	}
}
