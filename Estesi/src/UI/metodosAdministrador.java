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
    				//controlador.verCliente();	
    				visualizarCliente vc=new visualizarCliente();
            		vc.setVisible(true);
    				break;			
    			case"Operario":	
    				//controlador.verOperario();
    				visualizarOperario vo=new visualizarOperario();
            		vo.setVisible(true);
    				break;			
    			case "Vendedor":
    				//controlador.verVendedor();	
    				visualizarVendedor vv=new visualizarVendedor();
            		vv.setVisible(true);
    				break;	
    			case "Almacenista":
    				visualizarAlmacenista va=new visualizarAlmacenista();
            		va.setVisible(true);
    				break;
    			default:
    				break;
    			}	
        		break;    
        		//AGREGAR USUARIO
        	case 1:
        	String []role = {"Cliente","Operario","Vendedor", "Almacenista"};
			String rol;			
			rol = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Agregar usuario",JOptionPane.DEFAULT_OPTION,null, role,role);		
			switch(rol) {
			case "Cliente":
        		ingresarCliente ic=new ingresarCliente();
        		ic.setVisible(true);
        		break;
			case "Operario":
				ingresarOperario io=new ingresarOperario();
        		io.setVisible(true);
				break;
			case "Vendedor":
				ingresarVendedor iv=new ingresarVendedor();
        		iv.setVisible(true);
				break;
			case "Almacenista":
				ingresarAlmacenista ia=new ingresarAlmacenista();
        		ia.setVisible(true);
				break;
			}    		
        		break;
        		//EDITAR USUARIO
        	case 2:
        		String []roles5 = {"Cliente","Operario","Vendedor", "Almacenista"};
    			String rol5;
    			rol5 = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Editar usuario",JOptionPane.DEFAULT_OPTION,null, roles5,roles5);
    			switch(rol5) {   			
    			case "Cliente":	
    				editarCliente ec=new editarCliente();
            		ec.setVisible(true);
    				break;
    			case "Operario":
    				
    				break;
    			case "Almacenista":
    				
    				break;
    				
    			case "Vendedor":
    				break;
    			}
        		break;
        	//ELIMINAR USUARIO
        	case 3:       		
    			String []roles2 = {"Cliente","Operario","Vendedor", "Almacenista"};
    			String rol2;
    			rol2 = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Eliminar usuario",JOptionPane.DEFAULT_OPTION,null, roles2,roles2);
    			switch(rol2) {	
    			case "Cliente":			
    				eliminarCliente elc=new eliminarCliente();
            		elc.setVisible(true);
    			break;    			
    			case "Operario":
    				eliminarOperario elo=new eliminarOperario();
            		elo.setVisible(true);
    			break;
    			
    			case "Vendedor":
    				eliminarVendedor elv=new eliminarVendedor();
            		elv.setVisible(true);			
    			break;
    			
    			case "Almacenista":
    				eliminarAlmacenista ela=new eliminarAlmacenista();
            		ela.setVisible(true);
    			break;
    			default:				
    			break;    			
    			}
    			break; 
    		//AGREGAR PROVEEDOR
        	case 4:
        		ingresarProveedor ip=new ingresarProveedor();
        		ip.setVisible(true);	
        		break;
        	//VER PROVEEDORES
        	case 5:	
        		visualizarProveedores vp=new visualizarProveedores();
        		vp.setVisible(true);
        		break;
        	//PROVEEDORES DEUDORES    
        	case 6:
        		//controlador.deudaConProveedores();
        		deudaProveedores dp=new deudaProveedores();
        		dp.setVisible(true);
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
        lblNewLabel.setBounds(95, 51, 263, 26);
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


