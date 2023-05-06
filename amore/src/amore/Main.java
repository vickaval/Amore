package amore;


import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
			 
		
		      //INICIAR SESION UN CLIENTE
		      //String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, 
		     // double sueldo, int cuit, String razonSocial, String condicionIva
			  
		     //Usuario cliente1 = new Cliente("Martina", "Asad", "1", null , 3,  45678955, "cliente", "martina1990", 0, 0, null, null);
			 //  cliente1.iniciarSesion(cliente1);       
			   Cliente cliente2 = new Cliente("Victoria", "Valerio", "2", null, 2, 54654654, "cliente", "vickaval", 0, 1234, "Sociedad por Acciones", "muerte al iva");
			   cliente2.iniciarSesion(cliente2);
			         			        
					       	
			   //INICIAR SESION OPERARIO
			  // Usuario operario1 = new Operario("Andrea", "Andreani", "3", "amazar", 10, 5465465, "operario", "andand", 203500, "Tarde", null);  
			  // operario1.iniciarSesion(operario1);      			    
			   Operario operario2 = new Operario("Martin", "Martinez", "4", "produccion", 6, 54654654, "operario", "marmar", 115500, "Mañana", null);
			  operario2.iniciarSesion(operario2);
			   
			   
			   
			  
			
			   //INICIAR SESION ALMACENISTA
			  // Usuario almacenista1 = new Cliente("Lucas", "Lopez", "5", "acomodador" , 3,  5465465, "almacenista", "lulo", 100500, 0, null, null);
			  // almacenista1.iniciarSesion(almacenista1);   
		       Almacenista almacenista2 = new Almacenista("Victor", "Villani", "6", "repositor", 2, 768468468, "almacenista", "vivi", 102500);
		       almacenista2.iniciarSesion(almacenista2);
		       
		       
		       //INICIAR SESION VENDEDOR
		       //Usuario vendedor1 = new Cliente("Mateo", "Manolo", "7", "ventas" , 4,  5465465, "vendedor", "mama", 250500, 0, null, null);
		       //vendedor1.iniciarSesion(vendedor1);		       
		       Vendedor vendedor2 = new Vendedor("Sasuke", "Uchiha", "8", "ventas", 6, 768468468, "vendedor", "sauc", 250500);
		      vendedor2.iniciarSesion(vendedor2);
		       
		     
		       
		       //INICIAR SESION ADMINISTRADOR
		     //INICIAR SESION VENDEDOR
		      // Usuario administrador1 = new Cliente("Antonio", "Banderas", "9", "finanzas" , 8,  8446846, "administrador", "antban", 300500, 0, null, null);
		       //administrador1.iniciarSesion(administrador1);
		       Administrador administrador2 = new Administrador("Bruce", "Batman", "10", "documentacion", 6, 46468546, "administrador", "batiman", 255500);
		       administrador2.iniciarSesion(administrador2);
		       
		       
		       
		       //AÑADIR EMPLEADOS VENDEDOR Y ALMACENISTA (forma standard)
		       administrador2.aniadirEmpleado(vendedor2, almacenista2);
		      
		       
		       
		       //AÑADIR CLIENTE (forma especial)
		       administrador2.aniadirCliente(cliente2);
		       
		       //AÑADIR OPERARIO (forma especial)
		       administrador2.aniadirOperario(operario2);
		       
		       
		       
		       
		       
		       
		       //MALLLLLLLL
		       //EDITAR USUARIO
		       //administrador2.editarUsuario( vendedor2, cliente2, operario2, almacenista2 );
		      // administrador2.editarUsuario(vendedor2, null, null, null);
		       
		       
		       
		       
		       
		       //EDITAR USUARIO
				//tipo de usuario
					String []usuario = {"Cliente","Vendedor", "Almacenista", "Operario"};
			        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a editar", "Editar usuario",JOptionPane.DEFAULT_OPTION,
			                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);
 
			        //EDITAR CLIENTE
			        if (usu == 0) {
			        	administrador2.editarCliente("2", null);
			        //EDITAR VENDEDOR
			        } else if (usu == 1) {
			        	administrador2.editarVendedor("8", null);
			        //EDITAR ALMACENISTA
			        } else if (usu == 2) {
			        	administrador2.editarAlmacenista("6", null);
			        }  else if (usu == 3) {
			        	administrador2.editarOperario("4", null);
			        } else {
			        	JOptionPane.showMessageDialog(null, "Error.No se ha encontrado el id del usuario");
			        }
			        
			        
			        
			   //ELIMINAR EMPLEADO
		       //tipo de usuario
				String []usuario2 = {"Cliente","Vendedor", "Almacenista", "Operario"};
		        int usu2 = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a editar", "Editar usuario",JOptionPane.DEFAULT_OPTION,
		                JOptionPane.QUESTION_MESSAGE, null, usuario2, usuario2[0]);
		        //ELIMINAR CLIENTE
		        if (usu2 == 0) {
		        	administrador2.eliminarCliente("2", null);
		        //ELIMINAR VENDEDOR
		        } else if (usu2 == 1) {
		        	administrador2.eliminarVendedor("8", null);
		        //ELIMINAR ALMACENISTA
		        } else if (usu2 == 2) {
		        	administrador2.eliminarAlmacenista("6", null);
		        //ELIMINAR OPERARIO
		        }  else if (usu2 == 3) {
		        	administrador2.eliminarOperario("4", null);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Error.No se ha encontrado el id del usuario");
		        }
		        
		        
		        
		        //APLICAR DESCUENTO
		        administrador2.aplicarDescuento(2000);
		        
		        
		        //VISUALIZAR SSTOCK MATERIA PRIMA
		        administrador2.visualizarStockMateriaPrima2("Harina", null);
		        
		        
		        //PROVEDORES
		        //String nombre, String materialesQueProvee, int cuit, double montoComprado, deuda
		        Proveedor proveedor2 = new Proveedor("Manolo", "Harina", 1233, 25000, 14000);
		        proveedor2.deudaConProveedores(proveedor2);
     
		        proveedor2.informacionProveedores();
		        
		        proveedor2.proveedoresQueDeben(proveedor2);
		        
		        
			        
			        	
			        
			        
		       
		       
		       
		       
		       
		       
		       
		       
			   
			   
			   
			   

			 

	}

}
