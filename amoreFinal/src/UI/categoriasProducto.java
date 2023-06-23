package UI;

import javax.swing.*;

import Datos.Administrador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class categoriasProducto extends JFrame {
	
	Administrador controlador = new Administrador("", "", "", "", 0, ""); 
	
    private JComboBox<String>[] comboBoxes;

    public categoriasProducto() {
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
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(81, 79, 198, 26);
        panel.add(comboBox);
        comboBox.addItem("Pastas");
        comboBox.addItem("Salsas");
        comboBox.addItem("Quesos");

        
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	int opcion=comboBox.getSelectedIndex();
        	switch(opcion) {
        	case 0:
        		controlador.verProductos();
        		break;
        	case 1:
        		controlador.verSalsas();
        		break;
        	case 2:
        		controlador.verQuesos();
        		break;
        	}
        	}
        });
        btnNewButton.setBounds(256, 227, 118, 23);
        panel.add(btnNewButton);

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
