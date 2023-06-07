package UI;

import javax.swing.JOptionPane;

import Datos.Administrador;
import Logica.Almacenista;
import Logica.Cliente;
import Logica.Operario;
import Logica.Proveedor;
import Logica.Vendedor;

import Logica.Validaciones;


//falta borrar en la base de datos las fk de almacenista-deposito y proveedor-administrador
//falta completar iniciar sesion y registrarse, que el abm vaya directo cuando se inicia administrador
//mensajes guardados con string

public class Main {
	public static void main(String[] args) {
		
		//Administrador administrador = new Administrador("Bruce", "Batman", "10", "administrador", 46468546, "batiman");
		
		
		
	    Administrador controlador = new Administrador("", "", "", "", 0, "");
		
		
		
		//Proveedor proveedor = new Proveedor("", "", 0, 0, 0);
		//Persona controlador = new Persona("","","");
		
		
		/*
		String []is= {"Registrarse" , "Iniciar Sesion"};
        int ini = JOptionPane.showOptionDialog(null, "Bienvenido a Amore Pastas", "LOGIN",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, is, is[0]);
		
		if(ini == 1) {
			
		}
		*/
		
		
		
		//FALTA VALIDACIONES CUIT DE AGREGAR PROVEEDOR, TELEFONO, CUIT CLIENTE, EDITAR USUARIOS, ESTADISTICAS
		
		
		
		String []opciones = {"Ver usuario","Agregar usuario", "Editar usuario", "Eliminar usuario", "Agregar proveedor", "Ver proveedores", "Proveedores deudores", "Descuento", "Salir"};		
		String opcion;
		do {
			
	
		opcion = (String)JOptionPane.showInputDialog(null,"Elija accion a realizar","ABM de usuarios",JOptionPane.DEFAULT_OPTION,null, opciones,opciones);
		
		switch (opcion) {
		//VER USUARIOS
		case "Ver usuario":
			//JOptionPane.showMessageDialog(null, controlador.Mostrar());
			
			
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
			
		//AGREGAR USUARIO
		case "Agregar usuario":
			String []roles = {"Cliente","Operario","Vendedor", "Almacenista"};
			String rol;
			
			rol = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Agregar usuario",JOptionPane.DEFAULT_OPTION,null, roles,roles);
			
			switch(rol) {
			case "Cliente":
								
				//String id = (String)JOptionPane.showInputDialog(null, "Ingrese id");
			    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");		 
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido ");	      	        	       
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono"));   	          
		        //String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña");
		        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente")); 
		        String razonSocial = (String)JOptionPane.showInputDialog(null, "Ingrese razonSocial de cliente");
		        String condicionIva = (String)JOptionPane.showInputDialog(null, "Ingrese condicionIva del cliente");

		        
		       if (controlador.verificar(nombre, apellido, contraseña)) {	
		        	
		        int flag = 0 ;				
				do {      
		    	if(String.valueOf(telefono).length() !=  10) {
		    	telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 10 caracteres \n Ingrese telefono: "));		    	
		    	
		        if(String.valueOf(cuit).length() !=  5) {
		  		cuit = Integer.parseInt(JOptionPane.showInputDialog("Error el cuit debe tener 5 caracteres \n Ingrese cuit: "));	
		  		}
		        }
	            }while(flag==0);
				
				controlador.setTelefono(telefono);
				
		        Cliente nuevoCl = new Cliente(nombre, apellido, "0", "cliente", telefono, contraseña, cuit,razonSocial, condicionIva);	
		        
 
				if (nuevoCl.agregarCliente()) {				
					JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				} 
				
				
				  }
		    	
		    	
				
		       
			
				
				break;
			case "Operario":
				
				//String idO = (String)JOptionPane.showInputDialog(null, "Ingrese id");
			    String nombreO = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");		 
		        String apellidoO = (String)JOptionPane.showInputDialog(null, "Ingrese apellido ");	      	        	       
		        int telefonoO = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono"));   	          
		        //String usuarioO = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseñaO = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña");
		        String nombreAreaO = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área");	       
		        int aniosAntiguedadO = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));		        
		        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese el turno del operario");
		        double sueldoO = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo del operario"));
				
		       
		        
		        
		       if (controlador.verificar(nombreO, apellidoO, contraseñaO)) {
		       if(turno.equalsIgnoreCase("mañana") || turno.equalsIgnoreCase("tarde") || turno.equalsIgnoreCase("noche")) {
		        	
		       } else {
		        	 turno = JOptionPane.showInputDialog("Error el turno debe ser mañana, tarde o noche \n Ingrese turno: "); 
		        	
		        }
		        
				Operario nuevoOp = new Operario(nombreO, apellidoO, "0","operario", telefonoO, contraseñaO, turno, nombreAreaO, aniosAntiguedadO, sueldoO);
		        if (nuevoOp.agregarOperario()) {					
					JOptionPane.showMessageDialog(null, "El operario se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");

				}
		         
		        
			  }
		      
		        
			
				break;
				
			case "Vendedor":
				
				//String idV = (String)JOptionPane.showInputDialog(null, "Ingrese id");
			    String nombreV = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");		 
		        String apellidoV = (String)JOptionPane.showInputDialog(null, "Ingrese apellido ");	      	        	       
		        int telefonoV = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono"));   	          
		        //String usuarioV = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseñaV = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña");
		        String nombreAreaV = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área");	       
		        int aniosAntiguedadV = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		        double sueldoV = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo del vendedor"));
		        
		        if (controlador.verificar(nombreV, apellidoV, contraseñaV)) {
		        	
		        }
		        Vendedor nuevoVe = new Vendedor(nombreV, apellidoV, "0", "vendedor", telefonoV, contraseñaV, nombreAreaV, aniosAntiguedadV, sueldoV);
		        
		        if (nuevoVe.agregarVendedor()) {					
					JOptionPane.showMessageDialog(null, "El vendedor se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				}				
				break;
				
			case "Almacenista":
				
				//String idA = (String)JOptionPane.showInputDialog(null, "Ingrese id");
			    String nombreA = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");		 
		        String apellidoA = (String)JOptionPane.showInputDialog(null, "Ingrese apellido ");	      	        	       
		        int telefonoA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono"));   	          
		        //String usuarioA = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseñaA = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña");
		        String nombreAreaA = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área");	       
		        int aniosAntiguedadA = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		        double sueldoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo"));
		        int idDepo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese id de deposito"));
		       
		        	
		        if (controlador.verificar(nombreA, apellidoA, contraseñaA)) {
		        	
		        }
		        Almacenista nuevoAl = new Almacenista(nombreA, apellidoA, "0", "almacenista", telefonoA, contraseñaA, nombreAreaA, aniosAntiguedadA, sueldoA, idDepo);
		        
		        if (nuevoAl.agregarAlmacenista()) {					
					JOptionPane.showMessageDialog(null, "El almacenista se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				}				
				break;
				
			default:
				break;
			}
			
			
		
			break;
			
			//EDITAR USUARIO
		case "Editar usuario":
			String []roles5 = {"Cliente","Operario","Vendedor", "Almacenista"};
			String rol5;
			rol5 = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Editar usuario",JOptionPane.DEFAULT_OPTION,null, roles5,roles5);
			
			switch(rol5) {
			
			case "Cliente":	
				String id = JOptionPane.showInputDialog(null, "Ingrese id del cliente a editar");	
				
				if(controlador.verificarId(id)) {
				
					
				String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo nombre");		 
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo apellido ");	      	        	       
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo número de teléfono"));   	          
		        //String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo tipo de usuario");
		        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese nueva contraseña");
		        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo cuit del cliente")); 
		        String razonSocial = (String)JOptionPane.showInputDialog(null, "Ingrese nueva razon Social de cliente");
		        String condicionIva = (String)JOptionPane.showInputDialog(null, "Ingrese nueva condicion Iva del cliente");

		       
		        	if (controlador.verificar(nombre, apellido, contraseña)) {
		        		
		        	
		        
		       
		        	
		        	
		              
		 	
		        Cliente nuevoCl = new Cliente(nombre, apellido, "0", "cliente", telefono, contraseña, cuit,razonSocial, condicionIva);	
		        
				if (nuevoCl.editarCliente(id)) {				
					JOptionPane.showMessageDialog(null, "El cliente se edito correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				} 
		  		
				 } 
		       } 
			
		  		
				break;
				
			case "Operario":	
				
				break;	
				
			case "Vendedor":	
				
				break;

			case "Almacenista":	
				
				break;
				
			default:
				break;
			}
			
			break;
			
			
			
		
			
			//ELIMINAR USUARIO
		case "Eliminar usuario": 
			
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
			
		case "Agregar proveedor":
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
			break;
			
		
		case "Ver proveedores":			
			controlador.verProveedor();		
			break;
			
		case"Proveedores deudores":
			controlador.deudaConProveedores();
			//controlador.proveedoresDeuda();
			break;
			
		case "Descuento":		    
			controlador.aplicarDescuento();
			break;
			
		case "Salir":
			
			break;
			

		default:
			break;
		}
		
		
		
		}while(!opcion.equals("Salir"));
	}


}
