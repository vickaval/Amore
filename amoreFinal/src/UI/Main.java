package UI;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import Datos.Administrador;
import JFrame.Admin;
import JFrame.Menu;
import Logica.Almacenista;
import Logica.Categoria;
import Logica.Cliente;
import Logica.MateriaPrima;
import Logica.Operario;
import Logica.Producto;
import Logica.Proveedor;
import Logica.Vendedor;




public class Main extends Menu{
	
	
	public void run() {
			try {
				Main frame = new Main();
				frame.setVisible(true);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Main frame = new Main();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		

		
		Administrador controlador = new Administrador("", "", "", "", 0, ""); 
	     

		String []is= {"Almacen", "Login Admin", "Cliente"};
        int ini = JOptionPane.showOptionDialog(null, "Bienvenido a Amore Pastas", "LOGIN",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, is, is[0]);
        
	
		if(ini==0) {
        	String []roles = {"Operario","Almacenista"};
			String opciones;
			Operario o = new Operario("", "", "", "", 0, "","","",0,0);
			MateriaPrima mp = new MateriaPrima(0,"","",0,0,0);
			Producto p =new Producto(0,"","",0,0,0,0,0, 0);
			Categoria c=new Categoria(0,"");
			opciones= (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Agregar usuario",JOptionPane.DEFAULT_OPTION,null, roles,roles);
			
			switch(opciones) {
			//OPERARIO
			   case "Operario":
			    if(o.iniciarSesion( )) {
			     String []ope= {"Ingresar materia prima", "Eliminar materia prima", "Visualizar info materia prima",
			       "Ingresar producto", "Eliminar producto", "Visualizar info productos", "Ingresar Categoria","Eliminar Categoria","Salir"}; 
			     String seleccion;
			     do {
			      seleccion= (String) JOptionPane.showInputDialog(null,"Seleccione una opcion","Panel Operario",JOptionPane.DEFAULT_OPTION,null, ope,ope);
			     
			      switch(seleccion) {
			      case "Ingresar materia prima":
			       
			      int idM=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de la materia prima a ingresar: "));
			         String nombreM=JOptionPane.showInputDialog(null, "ingrese el nombre de la materia prima: ");
			         String procedencia=JOptionPane.showInputDialog(null, "indique la procedencia: ");
			         double costo=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el costo unitario de la materia prima a ingresar: "));
			         int stock=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el stock disponible de la materia prima a ingresar: "));
			         if(stock<=100) {
			          do {
			          stock=Integer.parseInt(JOptionPane.showInputDialog(null, "el stock debe ser superior a 100. Ingresele nuevamente: "));
			          }while(stock<=100);
			         }
			         int idDepo=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del deposito donde va a estar la materia prima: "));
			         mp.setIdMp(idM);
			         mp.setNombre(nombreM);
			         mp.setProcedencia(procedencia);
			         mp.setPrecio(costo);
			         mp.setStockDisponible(stock);
			         mp.setIdDepo(idDepo);
			         mp.ingresarMateriaPrima();
			      break;
			      
			      case "Eliminar materia prima":
			       o.eliminarMateriaPrima();
			       break;
			      case "Visualizar info materia prima"://anda
			       mp.visualizarStockMateriaPrima();
			       break;
			      case "Ingresar producto":
			       
			          String nombreP=JOptionPane.showInputDialog(null, "ingrese el nombre del producto: ");
			          double precio=Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el precio final del producto ingresar: "));
			          int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el stock disponible del producto a ingresar: "));
			          int idDepo2=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del deposito donde va a estar el producto "));
			          int producc=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de producción donde va a estar el producto "));
			          int idCate=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de la categoria donde va a estar el producto "));
			          
			          p.setNombre(nombreP);
			          p.setPrecio(precio);
			          p.setCantidad(cantidad);
			          p.setIdDepo(idDepo2);
			          p.setIdProduccion(producc);
			          p.setIdCategoria(idCate);
			          
			       p.agregarProducto();//setea todo 0 menos id y idcategoria
			       
			       break;
			      case "Eliminar producto"://anda
			       p.eliminarProducto();
			       break;
			      case "Visualizar info productos"://anda
			       p.visualizarProductos();
			       break;
			      case "Ingresar Categoria"://anda
			       String nombreC=JOptionPane.showInputDialog(null, "ingrese el nombre de la categoria nueva: ");
			       c.setNombre(nombreC);
			       
			       c.agregarCategoria();
			       break;
			      case "Eliminar Categoria"://anda
			       c.eliminarCategoria();
			       break;
			      case "Salir":
			       JOptionPane.showMessageDialog(null, "Saliendo del sistema Amore Pastas \n¡Gracias por elegirnos!");
			       break;
			      default:
			       break;
			     }
			     }while(!seleccion.equals("Salir"));
			    }
			    break;
			
			    
			    
			 
			///ALMACENISTAA
			case "Almacenista":
				 int intentos = 0;
				    boolean ingresoExitoso = false;

				    do {
				        String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario");
				        if (usuario == null) {
				            JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado. Fin del programa.");
				            System.exit(0);
				        } else if (usuario.length() > 10) {
				            JOptionPane.showMessageDialog(null, "El usuario debe tener como máximo 10 caracteres");
				            intentos++;
				            continue;
				        }

				        String contrasenia = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
				        if (contrasenia == null) {
				            JOptionPane.showMessageDialog(null, "Inicio de sesión cancelado. Fin del programa.");
				            System.exit(0);
				        } else if (contrasenia.length() > 10) {
				            JOptionPane.showMessageDialog(null, "La contraseña debe tener como máximo 10 caracteres");
				            intentos++;
				            continue;
				        }

				        controlador.validarInicioSesionAlmacenista(usuario, contrasenia);
				        ingresoExitoso = true;
				        while(ingresoExitoso) {
				        	int ret= controlador.ofrecerOpcionesalmacenista();
				        	if(ret==1) {
				        		JOptionPane.showMessageDialog(null, "Sesion almacenista cerrada. Volvemos al menu principal.");
				        		break;
				        	}
				        }
				        
				    } while (!ingresoExitoso && intentos < 3);

				    if (!ingresoExitoso) {
				        JOptionPane.showMessageDialog(null, "Máximo número de intentos alcanzado. Cierre el programa.");
				        System.exit(0);
				    }
				    break;
			


        	
		
        
		
		
		
			}
		
		
			}else if(ini == 1) {
		
			
			
			controlador.loginAdministrador();
		

		String []opi = {"Ver usuario","Agregar usuario", "Editar usuario", "Eliminar usuario", "Agregar proveedor", "Ver proveedores", "Proveedores deudores", "Descuento", "Salir"};		
		String opcion;
		do {
			
	
		opcion = (String)JOptionPane.showInputDialog(null,"Elija accion a realizar","ABM de usuarios",JOptionPane.DEFAULT_OPTION,null, opi,opi);
		
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
			String []role = {"Cliente","Operario","Vendedor", "Almacenista"};
			String rol;
			
			rol = (String)JOptionPane.showInputDialog(null,"Tipo de usuario","Agregar usuario",JOptionPane.DEFAULT_OPTION,null, role,role);
			
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
		        /*	
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
				*/
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
		       
		        }
		       
				Operario nuevoOp = new Operario(nombreO, apellidoO, "0","operario", telefonoO, contraseñaO, turno, nombreAreaO, aniosAntiguedadO, sueldoO);
		        if (nuevoOp.agregarOperario()) {					
					JOptionPane.showMessageDialog(null, "El operario se guardo correctamente");
				}else {
					JOptionPane.showMessageDialog(null, " Hubo un error");

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
	

        
        
        
        
        
        //CLIENTE
	}else  if(ini == 2) {
        	Cliente cl=new Cliente("", "", "", "", 0, "", 0, "", "");
        	if(cl.iniciarSesion()) {
        		String []ope= {"Ver categorias de productos"};	
				String seleccion;
				seleccion= (String)JOptionPane.showInputDialog(null,"Cliente","Seleccione una opcion",JOptionPane.DEFAULT_OPTION,null, ope,ope);
				switch(seleccion) {
				case "Ver categorias de productos":
					cl.verCategorias();
					break;
				}
        	}
	
        	
        	
        	
        	
        	
	}



			
        
	
	
	}
	

}
