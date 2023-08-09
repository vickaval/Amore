package UI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class metodosVendedor extends JFrame {
	private JComboBox<String>[] comboBoxes;

	public metodosVendedor() {
		setTitle("Funcionalidades Operario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		// Create the array of combo boxes
		//comboBoxes = new JComboBox[11];

		// Create a panel to hold the combo boxes
		JPanel panel = new JPanel();

		// Create and add the combo boxes to the panel

		// Add the panel to the frame
		getContentPane().add(panel);
		panel.setLayout(null);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(95, 112, 198, 26);
		panel.add(comboBox);
		comboBox.addItem("Tomar Pedido");
		comboBox.addItem("Ver pedidos pendientes");
		


		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = comboBox.getSelectedIndex();
				switch (opcion) {
				case 0:
					tomarPedido tp = new tomarPedido();
					tp.setVisible(true);
					break;

				case 1:
					visualizarPedidosPendientes vpp = new visualizarPedidosPendientes();
					vpp.setVisible(true);
					break;

				}
			}
		});
		btnNewButton.setBounds(95, 174, 198, 26);
		panel.add(btnNewButton);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(95, 212, 198, 26);
		panel.add(btnVolver);

		JLabel lblNewLabel = new JLabel("Seleccione la accion que desee realizar:");
		lblNewLabel.setBounds(95, 51, 226, 26);
		panel.add(lblNewLabel);

		// Display the frame
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new metodosOperario();
			}
		});
	}
}


