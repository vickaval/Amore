package Interface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class metodosAdministrador extends JFrame {
	public metodosAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Funcionalidades Administrador");
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton);
	}
    private JComboBox<String>[] comboBoxes;
    private final JLabel lblNewLabel = new JLabel("Seleccione una accion:");

    public void visualizar() {
        setTitle("Opciones");
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
        

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(81, 79, 198, 26);
        panel.add(comboBox);
        comboBox.addItem("Ver usuario");
        comboBox.addItem("Agregar usuario");
        comboBox.addItem("Editar usuario");
        comboBox.addItem("Eliminar usuario");
        comboBox.addItem("Agregar proveedor");
        comboBox.addItem("Ver proveedores");
        comboBox.addItem("Proveedores deudores");
        comboBox.addItem("Descuento");
        comboBox.addItem("Salir");

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new metodosAdministrador();
            }
        });
    }
}
