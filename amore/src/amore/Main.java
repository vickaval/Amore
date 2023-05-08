package amore;


import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
				
		Administrador administrador2 = new Administrador("Bruce", "Batman", "10", "documentacion", 6, 46468546, "administrador", "batiman", 255500);		
		Almacenista almacenista2 = new Almacenista("Victor", "Villani", "6", "repositor", 2, 768468468, "almacenista", "vivi", 102500);
		Operario operario2 = new Operario("Martin", "Martinez", "4", "produccion", 6, 54654654, "operario", "marmar", 115500, "Mañana");

		
	    //String nombre, String materialesQueProvee, int cuit, double montoComprado, deuda
        Proveedor proveedor2 = new Proveedor("Manolo", "Harina", 1233, 25000, 14000);
        
     
        
		 
		String []op= {"Iniciar Sesion" , "Salir"};
        int menu = JOptionPane.showOptionDialog(null, "                MENU" , "Amore Pastas",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
        
        if(menu == 1) {
        	JOptionPane.showMessageDialog(null, "Ya salio del sistema de Amore Pastas. \nGracias por elegirnos!");
        } else if(menu == 0) {
        		/*
        	administrador2.iniciarSesion(); 
        
        	cliente2.iniciarSesion();
        	operario2.iniciarSesion();
        	almacenista2.iniciarSesion();  
        	vendedor2.iniciarSesion();
        	*/
        
        
			 
        
        
   
        
        
        if (administrador2.iniciarSesion()) {
        	     
        
        String []opciones= {"Info usuario", "Añadir" ,"Eliminar","Editar", "Descuento", "Info proveedores", "Proveedores deudores", "Estadisticas"};
        int opc = JOptionPane.showOptionDialog(null, "Elija tipo de operacion", "ABM usuarios",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if(opc == 0) {
        	//MOSTRAR INFORMACION DE USUARIO
		     administrador2.informacionUsuario();	
		     
		     String []info= {"Cliente" ,"Operario","Almacenista", "Vendedor"};
		        int inf = JOptionPane.showOptionDialog(null, "Elija tipo de usuario", "INFORMACION",JOptionPane.DEFAULT_OPTION,
		                JOptionPane.QUESTION_MESSAGE, null, info, info[0]);
		        if(inf == 0) {
		        	administrador2.mostrarClientes();
		        } else if(inf == 1) {
		        	administrador2.mostrarOperarios();
                } else if(inf == 2) {
		        	administrador2.mostrarAlmacenistas();
		        } else if(inf == 3) {
		        	administrador2.mostrarVendedores();
		        }
	     
        } else if(opc == 1) {
        	 
		       //AÑADIR
		       String []añadir= {"Cliente" ,"Operario","Almacenista", "Vendedor"};
		        int ana = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a añadir", "Añadir usuario",JOptionPane.DEFAULT_OPTION,
		                JOptionPane.QUESTION_MESSAGE, null, añadir, añadir[0]);
		        
		       if (ana == 0) { 
		       //AÑADIR CLIENTE (forma especial)
		       administrador2.aniadirCliente();
		       //AÑADIR EMPLEADOS VENDEDOR 
		       } else if (ana == 1) {  
		       //AÑADIR OPERARIO (forma especial)
		       administrador2.aniadirOperario();
		       } else if (ana == 2) {
		        //AÑADIR ALMACENISTA 
		       administrador2.aniadirAlmacenista();
		       } else if (ana == 3) {
		    	//AÑADIR VENDEDOR
		       administrador2.aniadirVendedor();
		       }
		      
        } else if(opc == 2) {
        	            
			   //ELIMINAR USUARIO
		       //tipo de usuario
				String []usuario2 = {"Cliente","Vendedor", "Almacenista", "Operario"};
		        int usu2 = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a editar", "Editar usuario",JOptionPane.DEFAULT_OPTION,
		                JOptionPane.QUESTION_MESSAGE, null, usuario2, usuario2[0]);
		        
		       
		        //ELIMINAR CLIENTE
		        if (usu2 == 0) {
		        	administrador2.eliminarCliente(2);
		        	
		        //ELIMINAR VENDEDOR
		        } else if (usu2 == 1) {
		        	administrador2.eliminarVendedor(8);
		        //ELIMINAR ALMACENISTA
		        } else if (usu2 == 2) {
		        	administrador2.eliminarAlmacenista(6);
		        //ELIMINAR OPERARIO
		        }  else if (usu2 == 3) {
		        	administrador2.eliminarOperario(4);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Error.No se ha encontrado el id del usuario");
		        }
		        
        } else if(opc == 3) {
        	
		       //EDITAR USUARIO
				//tipo de usuario
					String []usuario = {"Cliente","Vendedor", "Almacenista", "Operario"};
			        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a editar", "Editar usuario",JOptionPane.DEFAULT_OPTION,
			                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);
 
			        //EDITAR CLIENTE
			        if (usu == 0) {
			        	administrador2.editarCliente(2);
			        //EDITAR VENDEDOR
			        } else if (usu == 1) {
			        	administrador2.editarVendedor(8);
			        //EDITAR ALMACENISTA
			        } else if (usu == 2) {
			        	administrador2.editarAlmacenista(6);
			        }  else if (usu == 3) {
			        	administrador2.editarOperario(4);
			        } else {
			        	JOptionPane.showMessageDialog(null, "Error.No se ha encontrado el id del usuario");
			        }
			        
			       
        } else if(opc == 4) {
		        
		        //APLICAR DESCUENTO
		        administrador2.aplicarDescuento(2000);
		        
        } else if(opc == 5) {
        	
        	//PROVEDORES
        	    proveedor2.informacionProveedores();
        	    
        } else if(opc == 6) {
        	
        	    proveedor2.deudaConProveedores(proveedor2);
		        proveedor2.proveedoresQueDeben(proveedor2);
		        
        } else if(opc == 7) {
        	
        	   //MOSTRAR VENDIDO MAS DE 100 VECES O NO
		       almacenista2.estadisticas();
		       
        } 
        
        
        } else {
        	JOptionPane.showMessageDialog(null, "Lo sentimos.\nSolo el administrador tiene acceso al ABM de usuarios");
        }
        
        }
		        
		        
		       
		 	}

}       
		
