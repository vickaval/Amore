package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class metodosAlmacenista extends JFrame {
    private JComboBox<String>[] comboBoxes;

    public metodosAlmacenista() {
        setTitle("Funcionalidades Almacenista");
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
        comboBox.setBounds(95, 112, 198, 26);
        panel.add(comboBox);
        comboBox.addItem("Visualizar stock de Materia Prima");
        comboBox.addItem("Visualizar stock de Productos");
        comboBox.addItem("Ver pedidos pendientes");
        comboBox.addItem("Preparar Pedidos");
      
        
        JButton btnNewButton = new JButton("Confirmar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	int opcion=comboBox.getSelectedIndex();
        	switch(opcion) {
        	case 0:
        		visualizarStockMP vsmp=new visualizarStockMP();
        		vsmp.setVisible(true);
        		break;
        	case 1:
        		visualizarStockProductos vsp=new visualizarStockProductos(false);
        		vsp.setVisible(true);
        		break;
        	case 2:
        		visualizarStockMP vim=new visualizarStockMP();//no se visualiza bien
        		vim.setVisible(true);
        		break;
        	case 3:
        		ingresarProducto ip=new ingresarProducto();
        		ip.setVisible(true);
        		break;
        	}       	
        	}
        });
        btnNewButton.setBounds(95, 174, 198, 26);
        panel.add(btnNewButton);
        
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




