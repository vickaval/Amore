package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class metodosOperario extends JFrame {
    private JComboBox<String>[] comboBoxes;

    public metodosOperario() {
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
        comboBox.addItem("Ingresar materia prima");
        comboBox.addItem("Eliminar materia prima");
        comboBox.addItem("Visualizar info materia prima");
        comboBox.addItem("Ingresar producto");
        comboBox.addItem("Eliminar producto");
        comboBox.addItem("Visualizar info producto");
        comboBox.addItem("Ingresar categoria");
        comboBox.addItem("Eliminar categoria");
        comboBox.addItem("Editar categoria");
        
        JButton btnNewButton = new JButton("Confirmar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	int opcion=comboBox.getSelectedIndex();
        	switch(opcion) {
        	case 0:
        		ingresarMateriaPrima imp=new ingresarMateriaPrima();
        		imp.setVisible(true);
        		break;
        	case 1:
        		eliminarMateriaPrima emp=new eliminarMateriaPrima();
        		emp.setVisible(true);
        		break;
        	case 2:
        		visualizarInfoMP vim=new visualizarInfoMP();//no se visualiza bien
        		vim.setVisible(true);
        		break;
        	case 3:
        		ingresarProducto ip=new ingresarProducto();
        		ip.setVisible(true);
        		break;
        	case 4:
        		
        	
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

