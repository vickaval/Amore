package UI;

import javax.swing.*;

import Datos.Administrador;
import Datos.Conexion;
import Logica.Proveedor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class metodosAdministrador extends JFrame {
    private JComboBox<String>[] comboBoxes;
    
Conexion con =  new Conexion();;
	
	Connection conexion = con.conectar();

	Administrador controlador = new Administrador("", "", "", "", 0, ""); 
	
    public metodosAdministrador() {
        setTitle("Funcionalidades Administrador");
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
        comboBox.addItem("Ver usuario");
        comboBox.addItem("Agregar usuario");
        comboBox.addItem("Editar usuario");
        comboBox.addItem("Eliminar usuario");
        comboBox.addItem("Agregar proveedor");
        comboBox.addItem("Ver proveedores");
        comboBox.addItem("Proveedores deudores");
        comboBox.addItem("Descuento");
        comboBox.addItem("Salir");

        
   	
        JButton btnNewButton = new JButton("Confirmar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	int opcion=comboBox.getSelectedIndex();
        	switch(opcion) {
        	//VER USUARIO
        	case 0:        		
        		String []rl = {"Cliente","Operario","Vendedor", "Almacenista"};
    			String r;   			
    			r = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Ver usuario",JOptionPane.DEFAULT_OPTION,null, rl,rl);    			
    			switch(r) {
    			case "Cliente": 				
    				controlador.verCliente();	
    				break;			
    			case"Operario":	
    				controlador.verOperario();	
    				break;			
    			case "Vendedor":
    				controlador.verVendedor();	
    				break;	
    			case "Almacenista":
    				controlador.verAlmacenista();
    				break;
    			default:
    				break;
    			}	
        		break;        		
        	case 1:
        		JOptionPane.showMessageDialog(btnNewButton, "Opcion AGREGAR usuario");
        		break;
        	case 2:
        		JOptionPane.showMessageDialog(btnNewButton, "Opcion EDITAR usuario");
        		break;
        	//ELIMINAR USUARIO
        	case 3:       		
    			String []roles2 = {"Cliente","Operario","Vendedor", "Almacenista"};
    			String rol2;
    			rol2 = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Eliminar usuario",JOptionPane.DEFAULT_OPTION,null, roles2,roles2);
    			switch(rol2) {	
    			case "Cliente":			
    				int idC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del cliente: "));
    				if (controlador.eliminarCliente(idC)) {
    					JOptionPane.showMessageDialog(null, "Se elimino con exito a cliente id: " + idC );
    				}else {
    					JOptionPane.showMessageDialog(null, "No se encontro el id del cliente, o no se pudo borrar");
    				}
    			break;
    			
    			case "Operario":
    				int idO = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del operario: "));
    				if (controlador.eliminarOperario(idO)) {
    					JOptionPane.showMessageDialog(null, "Se elimino con exito a operario id: " + idO );
    				}else {
    					JOptionPane.showMessageDialog(null, "No se encontro el id del operario, o no se pudo borrar");			
    				}
    			break;
    			
    			case "Vendedor":
    				int idV = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del vendedor: "));
    				if (controlador.eliminarVendedor(idV)) {
    					JOptionPane.showMessageDialog(null, "Se elimino con exito a vendedor id: " + idV );
    				}else {
    					JOptionPane.showMessageDialog(null, "No se encontro el id del vendedor, o no se pudo borrar");
    				}				
    			break;
    			
    			case "Almacenista":
    				int idA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del vendedor: "));
    				if (controlador.eliminarAlmacenista(idA)) {
    					JOptionPane.showMessageDialog(null, "Se elimino con exito a almacenista id: " + idA );
    				}else {
    					JOptionPane.showMessageDialog(null, "No se encontro el id del almacenista, o no se pudo borrar");
    				}
    			break;
    			default:				
    			break;    			
    			}
    			break; 
    		//AGREGAR PROVEEDOR
        	case 4:
        		agregarProveedor ap = new agregarProveedor();            	
            	ap.setVisible(true);
            	/*
            	String nombreP = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");	
    			int cuitP = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuit"));
    			String materialesQueProvee = (String)JOptionPane.showInputDialog(null, "Ingrese material que provee");
    			double montoComprado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese monto comprado"));
    			double deuda = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese deuda si existe"));
    			
    			Proveedor nuevoPr = new Proveedor(nombreP, materialesQueProvee, cuitP,  montoComprado, deuda);
    			 if (nuevoPr.agregarProveedor()) {					
    					JOptionPane.showMessageDialog(null, "El proveedor se guardo correctamente");
    				}else {
    					JOptionPane.showMessageDialog(null, " Hubo un error");
    				}
    			*/
        		break;
        	//VER PROVEEDORES
        	case 5:
        		controlador.verProveedor();	
        		break;
        	//PROVEEDORES DEUDORES    
        	case 6:
        		controlador.deudaConProveedores();
        		break;
        	//DESCUENTO
        	case 7:
        		controlador.aplicarDescuento();
        		break;  
        	//SALIR
        	case 8:
        		JOptionPane.showMessageDialog(null, "Saliendo del sistema Amore Pastas \n¡Gracias por elegirnos!");
        		break;
        	default:
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


