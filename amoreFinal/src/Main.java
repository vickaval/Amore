//package UI;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Datos.Administrador;
import Logica.Almacenista;
import Logica.Cliente;
import Logica.Deposito;
import Logica.MateriaPrima;
import Logica.Operario;
import Logica.Pastas;
import Logica.Pedido;
import Logica.Produccion;
import Logica.Producto;
import Logica.Proveedor;
import Logica.Queso;
import Logica.Salsa;
import Logica.Vendedor;




public class Main {
	public static void main(String[] args) {
		
	
		
	    /*SEBAS
	        //creo el deposito y un almacenista
	  		Deposito depo = new Deposito(1,"Depo");
	  		
	  		//ESTO ES PARA METODO PREPARARPEDIDO()
	  		ArrayList<Producto> productosDelPedido = new ArrayList<>();
	  		
	  		Pastas spaghetti2 = new Pastas(7, "Spaghetti", 2.50, 10, 1, 1, "Pasta");
	  		Salsa salsaTomate2 = new Salsa(4, "Salsa de Tomate", 1.50, 16, 1, 2, "Salsa");
	  	   	Queso quesoParmesano = new Queso(1, "Queso Parmesano",3.50, 10, 1, 1, "Queso");
	  		Queso quesoCheddar = new Queso(2, "Queso Cheddar", 4.50, 8, 1, 2, "Queso");
	  		Queso quesoMozzarella = new Queso(3, "Queso Mozzarella", 2.50, 12, 1, 2, "Queso");
	  		Salsa salsaTomate = new Salsa(4, "Salsa de Tomate",  1.50, 15, 1, 1, "Salsa");
	  		Salsa salsaAlfredo = new Salsa(5, "Salsa Alfredo", 2.50, 12, 1, 3, "Salsa");
	  		Salsa salsaBoloniesa = new Salsa(6, "Salsa Bolo�esa", 3.50, 10,1 ,3, "Salsa");
	  		Pastas spaghetti = new Pastas(7, "Spaghetti",  2.50, 20, 1 ,2, "Pasta");
	  		Pastas fettuccine = new Pastas(8, "Fettuccine",  3.00, 18, 1 , 1, "Pasta");
	  		Pastas mostachol = new Pastas(9, "Mostachol",  2.00, 22, 1, 3, "Pasta");
	  		
	  		productosDelPedido.add(spaghetti2);
	  		productosDelPedido.add(salsaTomate2);
	  		
	  		
	  		Pedido p = new Pedido(1, 54.50, 159, null ,1, 1,"efectivo", productosDelPedido);
	  		
	  		Almacenista al = new Almacenista("Juan", "Perez","1","almacenista", 123456789,"jperez", "repositor", 5 , 50000.0, 1);
	  		//al.setPedido(p);  //SETEO EL PEDIDO DE LA CLASE ALMACENISTA PARA QUE NO QUEDE EN NULL Y NO TENER QUE INICIALIZARLO CUANDO CREO 
	  		//AL ALMACENISTA 
	  		
	  		
	  		//agrego almacenista al depo
	  		depo.agregarAlmacenistas(al);
	  		
	  		Produccion prod = new Produccion(1, null);
	  		
	  		
	  		MateriaPrima materia1 = new MateriaPrima(1001, "Tomate", "España", 1.50, 500, 1);
	  		MateriaPrima materia2 = new MateriaPrima(1002, "Cebolla", "Mexico", 0.75, 300, 1);
	  		MateriaPrima materia3 = new MateriaPrima(1003, "Ajo", "China", 2.20, 200, 1);
	  		MateriaPrima materia4 = new MateriaPrima(1004, "Aceite de oliva", "Italia", 4.50, 100, 1);
	  		MateriaPrima materia5 = new MateriaPrima(1005, "Sal", "Francia", 0.30, 1000, 1);
	  		
	  		prod.agregarMateriasPrimas(materia1);
	  		prod.agregarMateriasPrimas(materia2);
	  		prod.agregarMateriasPrimas(materia3);
	  		prod.agregarMateriasPrimas(materia4);
	  		prod.agregarMateriasPrimas(materia5);
	  		
	   
	  		
	  		depo.agregarProducto(quesoParmesano);
	  		depo.agregarProducto(quesoCheddar);
	  		depo.agregarProducto(quesoMozzarella);
	  		depo.agregarProducto(salsaTomate);
	  		depo.agregarProducto(salsaAlfredo);
	  		depo.agregarProducto(salsaBoloniesa);
	  		depo.agregarProducto(spaghetti);
	  		depo.agregarProducto(fettuccine);
	  		depo.agregarProducto(mostachol);
		
		*/
	
		
		String []is= {"Almacen", "Login Admin"};
        int ini = JOptionPane.showOptionDialog(null, "Bienvenido a Amore Pastas", "LOGIN",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, is, is[0]);
        
        /*SEBAS
        if(ini == 0) {
        	depo.loginAlmacenista();
        	
        	int eleccion;
        	do {
	    		Object[] opciones = {"Visualizar stock de materias primas", "Visualizar stock de productos", "Preparar pedidos", "Enviar pedidos", "Salir del programa"};
	    	    eleccion = JOptionPane.showOptionDialog(null, "�Que accion desea realizar?", "Menu principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
	    	    switch (eleccion) {
	    	        case 0:	    	        		
	    	    		 ArrayList<MateriaPrima> materias = prod.getListaMPs();
	    	             String mensaje = "Listado de Materias Primas: \n\n";
	    	             for (MateriaPrima mp : materias) {
	    	             	mensaje += "Codigo: " + mp.getIdMp() + " - " + "Nombre: " + mp.getNombre() +  " - " + "Stock: " + mp.getStockDisponible() + "\n";
	    	             }
	    	             JOptionPane.showMessageDialog(null, mensaje);
	    	            break;
	    	        case 1:    	    		
	    	    		 ArrayList<Producto> productos = depo.getProductos();
	    	             String mensaje1 = "Listado de Productos: \n\n";
	    	             for (Producto produ : productos) {
	    	             	mensaje1 += "Codigo: " + produ.getIdProducto() + " - " + "Nombre: " + produ.getNombre() +  " - " 
	    	             + " tipo: " + produ.getTipo() + " - " + "Stock: " + produ.getCantidad() + "\n";
	    	             }
	    	             JOptionPane.showMessageDialog(null, mensaje1);
	    	            break;
	    	        case 2:
	    	        	al.prepararPedido(depo,p);
	    	        	JOptionPane.showMessageDialog(null, "Se preparo el pedido ");
	    	            break;
	    	        case 3:
	    	        	al.EnviarPedido();
	    	        	JOptionPane.showMessageDialog(null, "Se envia el pedido ");
	    	        	//System.out.println(p.getProductos());
	    	            break;
	    	        case 4:
	    	        	JOptionPane.showMessageDialog(null, "Fin de sesion ");
	    	            break;
	    	        default:
	    	            JOptionPane.showMessageDialog(null, "Opcion no valida.");
	    	            break;
	    	    }
	    	 	}while (eleccion !=4);
	    	
        	 	
        	
        	
        	
		} 
        
        */
        if(ini == 1) {
			Administrador controlador = new Administrador("", "", "", "", 0, "");			
		
			controlador.loginAdministrador();

		
		String []opciones = {"Ver usuario","Agregar usuario", "Editar usuario", "Eliminar usuario", "Agregar proveedor", "Ver proveedores", "Proveedores deudores", "Descuento", "Salir"};		
		String opcion;
		do {
			
	
		opcion = (String)JOptionPane.showInputDialog(null,"Elija accion a realizar","ABM de usuarios",JOptionPane.DEFAULT_OPTION,null, opciones,opciones);
		
		switch (opcion) {
		//VER USUARIOS
		case "Ver usuario":
	
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
								
				
			    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre");		 
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido ");	      	        	       
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono"));   	          
		        //String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña");
		        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente")); 
		        String razonSocial = (String)JOptionPane.showInputDialog(null, "Ingrese razonSocial de cliente");
		        String condicionIva = (String)JOptionPane.showInputDialog(null, "Ingrese condicionIva del cliente");

		        
		       if (controlador.verificar(nombre, apellido, contraseña)) {	
		 
		        Cliente nuevoCl = new Cliente(nombre, apellido, "0", "cliente", telefono, contraseña, cuit,razonSocial, condicionIva);	
		        
 
				if (nuevoCl.agregarCliente()) {				
					JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				} 
				
				
				  }
		    	
		    	
				
		       
			
				
				break;
			case "Operario":		
			
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
		       
		        }
		       
				Operario nuevoOp = new Operario(nombreO, apellidoO, "0","operario", telefonoO, contraseñaO, turno, nombreAreaO, aniosAntiguedadO, sueldoO);
		        if (nuevoOp.agregarOperario()) {					
					JOptionPane.showMessageDialog(null, "El operario se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");

				}
				break;
				
			case "Vendedor":			
				
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
				}
					
				String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo nombre");		 
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo apellido ");	      	        	       
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo número de teléfono"));   	          
		        //String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese nuevo tipo de usuario");
		        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese nueva contraseña");
		        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo cuit del cliente")); 
		        String razonSocial = (String)JOptionPane.showInputDialog(null, "Ingrese nueva razon Social de cliente");
		        String condicionIva = (String)JOptionPane.showInputDialog(null, "Ingrese nueva condicion Iva del cliente");

		       
		        if (controlador.verificar(nombre, apellido, contraseña)) {
		         } 	
		        
		        int flag = 0 ;				
				do {      
		    	if(String.valueOf(telefono).length() ==  10) {
		    	telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 10 caracteres \n Ingrese telefono: "));		    	
		    	
		        if(String.valueOf(cuit).length() !=  5) {
		  		cuit = Integer.parseInt(JOptionPane.showInputDialog("Error el cuit debe tener 5 caracteres \n Ingrese cuit: "));	
		  		}
		        }
	            }while(flag==0);
				
				controlador.setTelefono(telefono);
				
		        Cliente nuevoCl = new Cliente(nombre, apellido, "0", "cliente", telefono, contraseña, cuit,razonSocial, condicionIva);	
		        
				if (nuevoCl.editarCliente(id)) {				
					JOptionPane.showMessageDialog(null, "El cliente se edito correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				} 
				break;
				
					
			case "Operario":				
				String idO = JOptionPane.showInputDialog(null, "Ingrese id");
				Integer.parseInt(idO);
				
				if(controlador.verificarId(idO)) {
				}
				
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
		    	   
		       }
		       if(turno.equalsIgnoreCase("mañana") || turno.equalsIgnoreCase("tarde") || turno.equalsIgnoreCase("noche")) {
		        	
		       } else {
		        	 turno = JOptionPane.showInputDialog("Error el turno debe ser mañana, tarde o noche \n Ingrese turno: "); 
		        	
		        }
		       
		       int flag1 = 0 ;				
				do {      
		    	if(String.valueOf(telefonoO).length() ==  10) {
		    	telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 10 caracteres \n Ingrese telefono: "));		    	
		        }
	            }while(flag1==0);
				controlador.setTelefono(telefonoO);
		        
				Operario nuevoOp = new Operario(nombreO, apellidoO, "0","operario", telefonoO, contraseñaO, turno, nombreAreaO, aniosAntiguedadO, sueldoO);
		        
				if (nuevoOp.editarOperario(idO)) {					
					JOptionPane.showMessageDialog(null, "El operario se edito correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				}		
				break;	
				
			case "Vendedor":
				String idV = (String)JOptionPane.showInputDialog(null, "Ingrese id");
				if(controlador.verificarId(idV)) {
				}
			
				
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
		        
		        int flag2 = 0 ;				
		    				do {      
		    		    	if(String.valueOf(telefonoV).length() ==  10) {
		    		    	telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 10 caracteres \n Ingrese telefono: "));		    	
		    		        }
		    	            }while(flag2==0);
		    				controlador.setTelefono(telefonoV);
		    				
		        Vendedor nuevoVe = new Vendedor(nombreV, apellidoV, "0", "vendedor", telefonoV, contraseñaV, nombreAreaV, aniosAntiguedadV, sueldoV);
		        
		        if (nuevoVe.editarVendedor(idV)) {					
					JOptionPane.showMessageDialog(null, "El vendedor se edito correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				}			
				break;

			case "Almacenista":
				String idA = (String)JOptionPane.showInputDialog(null, "Ingrese id");
				if(controlador.verificarId(idA)) {
				}
				
				
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
		        
		        int flag3 = 0 ;				
				do {      
		    	if(String.valueOf(telefonoA).length() ==  10) {
		    	telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 10 caracteres \n Ingrese telefono: "));		    	
		        }
	            }while(flag3==0);
				controlador.setTelefono(telefonoA);
				
		        Almacenista nuevoAl = new Almacenista(nombreA, apellidoA, "0", "almacenista", telefonoA, contraseñaA, nombreAreaA, aniosAntiguedadA, sueldoA, idDepo);
		        
		        if (nuevoAl.editarAlmacenista(idA)) {					
					JOptionPane.showMessageDialog(null, "El almacenista se edito correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");
				}				
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
			JOptionPane.showMessageDialog(null, "Saliendo del sistema Amore Pastas \n¡Gracias por elegirnos!");
			break;
			

		default:
			break;
		}
		
		
		
		}while(!opcion.equals("Salir"));
	}

	}

}
