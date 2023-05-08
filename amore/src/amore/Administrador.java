package amore;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Administrador extends Usuario{
	
	  ArrayList<Usuario> empleados;

	  
	  private ArrayList<Vendedor> vendedores;
	  private ArrayList<Operario> operarios;
	  private ArrayList<Almacenista> almacenistas;
	  private ArrayList<Cliente> clientes;
		
			
	  
	public Administrador(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		this.empleados = new ArrayList<>();
	}

	
	
	
	   //registro cliente
			public void aniadirCliente() {
				JOptionPane.showMessageDialog(null, "Registro de cliente");
				
				    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
				    //clientes.setNombre(nombre);
			        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del cliente");
			        //clientes.setApellido(apellido);
			        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del cliente");
			        //clientes.setId(id);
			        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del cliente"));   
			        //clientes.setTelefono(telefono);
			        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente"));   
			       // clientes.setCuit(cuit);
			        String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
			        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña del cliente");
			        String razonSocial = (String)JOptionPane.showInputDialog(null, "Ingrese razonSocial de cliente");
			        String condicionIva = (String)JOptionPane.showInputDialog(null, "Ingrese condicionIva del cliente");
			     
			        
			        Cliente nuevoCliente = new Cliente(nombre, apellido, id, null, 0, telefono, usuario, contraseña, 0, cuit, razonSocial, condicionIva);
			       clientes.add(nuevoCliente);

			       
			        JOptionPane.showMessageDialog(null, "Cliente registrado");
		    
		   
		    } 
			
			//registro operario
			public void aniadirOperario() {
				JOptionPane.showMessageDialog(null, "Registro de operario");
				
				    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del operario");
				   // operarios.setNombre(nombre);
			        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del operario");
			       // operarios.setApellido(apellido);
			        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del operario");
			       // operarios.setId(id);
			        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del operario");
			        //operarios.setNombreArea(nombreArea);
			        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
			        //operarios.setAniosAntiguedad(aniosAntiguedad);
			        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del operario"));   
			        //operarios.setTelefono(telefono);
			        String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
			        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña del operario");
			        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo del operario"));
			        
			        
			        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
					//operarios.setTurno(turno);
			       
					 Operario nuevoOperario = new Operario(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo, turno);
				        operarios.add(nuevoOperario);
				        
				        
			        JOptionPane.showMessageDialog(null, "Operario registrado");
		    
		   
		    }

	
	
	//registro almacenista
	public void aniadirAlmacenista() {
		    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del almacenista");
		    //this.almacenistas.add(nombre);
	        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del almacenista");
	       // almacenistas.setApellido(apellido);
	        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del almacenista");
	        //almacenistas.setId(id);
	        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del almacenista");
	        //almacenistas.setNombreArea(nombreArea);
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
	       // almacenistas.setAniosAntiguedad(aniosAntiguedad);
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del almacenista"));   
	      //  almacenistas.setTelefono(telefono);
	        String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
	        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña del almacenista");
	        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo del almacenista"));
	        
	        Almacenista nuevoAlmacenista = new Almacenista(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
	        almacenistas.add(nuevoAlmacenista);
	       
	        JOptionPane.showMessageDialog(null, "Almacenista ha sido registrado");
	}
	        
	
	
	     //registro vendedor 
	     public void aniadirVendedor() {
	    	    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del vendedor");
			   // vendedores.setNombre(nombre);
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del vendedor");
		        //vendedores.setApellido(apellido);
		        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del vendedor");
		       // vendedores.setId(id);
		        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del vendedor");
		        //vendedores.setNombreArea(nombreArea);
		        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		       // vendedores.setAniosAntiguedad(aniosAntiguedad);
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del vendedor"));   
		       // vendedores.setTelefono(telefono);
		        String usuario = (String)JOptionPane.showInputDialog(null, "Ingrese tipo de usuario");
		        String contraseña = (String)JOptionPane.showInputDialog(null, "Ingrese contraseña del vendedor");
		        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese sueldo del vendedor"));
		        
		        
		        Vendedor nuevoVendedor = new Vendedor(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, nombreArea, nombreArea, sueldo);
		        vendedores.add(nuevoVendedor);
		        
		        JOptionPane.showMessageDialog(null, "Vendedor ha sido registrado");	
	  }
	
	
	
	//-------------------------------------------------------
	//EDITAR CLIENTE
	public void editarCliente(int idSearch) {
		
		idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
		  
		for (int i = 0; i< clientes.size() ; i++) {
        	  while(clientes.get(i).getId().equals(idSearch)) {   	
        		JOptionPane.showMessageDialog(null, "Editar cliente");
				
			    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
			    clientes.get(i).setNombre(nombre);			  
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del cliente");
		        clientes.get(i).setApellido(apellido);
		        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del cliente");
		        clientes.get(i).setId(id);
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del cliente"));   
		        clientes.get(i).setTelefono(telefono);
		        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente"));   
		        clientes.get(i).setCuit(cuit);

		      	}		
		        JOptionPane.showMessageDialog(null, "El cliente: " + clientes.get(i).getId() + "ha sido editado");
		        System.out.println("Cliente editado exitosamente");	          	  
      	}
	}
	
	
	
	//EDITAR VENDEDOR
		public void editarVendedor(int idSearch) {
			
			idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
			
			  for (int i = 0; i< vendedores.size(); i++) {
	        	  while(vendedores.get(i).getId().equals(idSearch)) {       		       	
	                //if (empleados[i].id == idSearch) {

	        		String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del vendedor");
	        		vendedores.get(i).setNombre(nombre);
	            	//empleados[i].nombre = "NUEVONOMBRE";
	      		     String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del vendedor");
	      		    vendedores.get(i).setApellido(apellido);
	            	//empleados[i].apellido = "NUEVOAPELLIDO";
	  	            String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del vendedor");
	  	           vendedores.get(i).setNombreArea(nombreArea);
	            	//empleados[i].nombreArea = "NUEVO NOMBRE AREA";
	            	int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
	               vendedores.get(i).setAniosAntiguedad(aniosAntiguedad);
	            	//empleados[i].aniosAntiguedad = 20;
	  	            int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del vendedor"));   
	  	           vendedores.get(i).setTelefono(telefono);
	            	//empleados[i].telefono = 546545465;
	       
	         }   
			JOptionPane.showMessageDialog(null, "El vendedor: " + vendedores.get(i).getId() + "ha sido editado");
			System.out.println("Vendedor editado exitosamente");
			}        
		}
	
		
		
		
		//EDITAR ALMACENISTA
			public void editarAlmacenista(int idSearch) {
					
					idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
					
					for (int i = 0; i< almacenistas.size(); i++) {
		             	  while(almacenistas.get(i).getId().equals(idSearch)) {       		       	
		                     //if (empleados[i].id == idSearch) {

		             		String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del almacenista");
		             		almacenistas.get(i).setNombre(nombre);
		                 	//empleados[i].nombre = "NUEVONOMBRE";
		           		     String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del almacenista");
		           		    almacenistas.get(i).setApellido(apellido);
		                 	//empleados[i].apellido = "NUEVOAPELLIDO";
		       	            String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del almacenista");
		       	            almacenistas.get(i).setNombreArea(nombreArea);
		                 	//empleados[i].nombreArea = "NUEVO NOMBRE AREA";
		                 	int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		                 	almacenistas.get(i).setAniosAntiguedad(aniosAntiguedad);
		                 	//empleados[i].aniosAntiguedad = 20;
		       	            int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del almacenista"));   
		       	            almacenistas.get(i).setTelefono(telefono);
		                 	//empleados[i].telefono = 546545465;
		            
		              }   
		     		JOptionPane.showMessageDialog(null, "El almacenista: " + almacenistas.get(i).getId() + "ha sido editado");
		     		System.out.println("Almacenistas editado exitosamente");
			        
		            }
				}
	
			
			//EDITAR OPERARIO
			public void editarOperario(int idSearch) {
					
					idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
					
					for (int i = 0; i<operarios.size(); i++) {
		             	  while(operarios.get(i).getId().equals(idSearch)) {  
		             		  JOptionPane.showMessageDialog(null, "Editar operario");
		             	  
				
			    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del operario");
			    operarios.get(i).setNombre(nombre);
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del operario");
		        operarios.get(i).setApellido(apellido);
		        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del operario");
		        operarios.get(i).setId(id);
		        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del operario");
		        operarios.get(i).setNombreArea(nombreArea);
		        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		        operarios.get(i).setAniosAntiguedad(aniosAntiguedad);
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del operario"));   
		        operarios.get(i).setTelefono(telefono);
		        
		        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
				operarios.get(i).setTurno(turno);
		             	  }
			        JOptionPane.showMessageDialog(null, "El operario: " + operarios.get(i).getId() + "ha sido editado");
			        System.out.println("Operario editado exitosamente");
			        
		        	   }
			}
			
			
			//--------------------------------------------------------------
	
	
	

	
	//ELIMINAR CLIENTE
	public void eliminarCliente(int idSearch){
			
			idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
			clientes.remove(idSearch);
			
			for (int i = 0; i< clientes.size(); i++) {
             	  while(clientes.get(i).getId().equals(idSearch)) {  
             		 JOptionPane.showMessageDialog(null, "Eliminar cliente");             		 
             		 clientes.remove(i);
             		
		 clientes.remove(clientes.size()-1);			 
		   JOptionPane.showMessageDialog(null, "Hay " + clientes.size() + " clientes en la lista");
		   System.out.println("Hay " + clientes.size() + " clientes en la lista");
		  System.out.println( "Cliente eliminado");	
             	  }
			}		   
     }
	
	
	
	//ELIMINAR VENDEDOR
	public void eliminarVendedor(int idSearch){
			
			idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
			vendedores.remove(idSearch);
			
			for (int i = 0; i< vendedores.size(); i++) {
             	  while(vendedores.get(i).getId().equals(idSearch)) {  
             		 JOptionPane.showMessageDialog(null, "Eliminar vendedor");             		 
             		vendedores.remove(i);
             		
             		vendedores.remove(vendedores.size()-1);			 
		   JOptionPane.showMessageDialog(null, "Hay " + vendedores.size() + " vendedores en la lista");
		   System.out.println("Hay " + vendedores.size() + " vendedores en la lista");
		  System.out.println( "Vendedor eliminado");	
             	  }
			}	   
     }
	
	
	
	//ELIMINAR ALMACENISTA
	public void eliminarAlmacenista(int idSearch){
			
			idSearch = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
			almacenistas.remove(idSearch);
			
			this.almacenistas.remove(idSearch);
			
			for (int i = 0; i< almacenistas.size(); i++) {
             	  while(almacenistas.get(i).getId().equals(idSearch)) {  
             		 JOptionPane.showMessageDialog(null, "Eliminar almacenita");             		 
             		almacenistas.remove(i);
             		
             		almacenistas.remove(almacenistas.size()-1);			 
		   JOptionPane.showMessageDialog(null, "Hay " + almacenistas.size() + " almacenitas en la lista");
		   System.out.println("Hay " + almacenistas.size() + " almacenitas en la lista");
		  System.out.println( "Almacenita eliminado");	
             	  }
			}	   
     }
	
	
	
	//ELIMINAR OPERARIO
	public void eliminarOperario(int idSearch1){
			
			
			 idSearch1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del usuario a modificar"));
			operarios.remove(idSearch1);
				
				
			for (int i = 0; i< operarios.size(); i++) {
             	  while(operarios.get(i).getId().equals(idSearch1)) {  
             		 JOptionPane.showMessageDialog(null, "Eliminar operario");             		 
             		operarios.remove(i);
             		
             		operarios.remove(operarios.size()-1);			 
		   JOptionPane.showMessageDialog(null, "Hay " + operarios.size() + " operario en la lista");
		   System.out.println("Hay " + operarios.size() + " operario en la lista");
		  System.out.println( "Operario eliminado");
		  
             	  }
			}

             	  
			
     }
	
	
	
	/*
    public double aplicarDescuento(Pedido pedidos) {
    	// Clientes grandes: 10% si compra 100 o + 
    	double descuento;
    	System.out.println("La venta es de: "+ pedidos.getTotal());
    	double venta = pedidos.getTotal();

    	if(venta >= 100){
    	descuento = (venta * 10) / 100;
    	} else {
    	descuento = 0;
    	}

    	System.out.println ("El descuento es de: " + descuento);
    	venta = venta - descuento;
    	System.out.println ("El monto total de la venta es de: " + venta);
    	
    	
		return venta;
		
	}
	*/
	
	   public double aplicarDescuento(double monto) {
	    	// Clientes grandes: 10% si compra $10000 o + 		
		    monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto del cliente"));   
	       
	    	double descuento;
	    	
	    	if(monto >= 10000){
	    	descuento = (monto * 10) / 100;
	    	} else {
	    	descuento = 0;
	    	}

	    	
	    	JOptionPane.showMessageDialog(null, "El descuento es de: " + descuento);
	    	
	    	double venta = monto - descuento;
	    	JOptionPane.showMessageDialog(null,"El monto total de la venta es de: " + venta);
	    	
	    	System.out.println (" ");
	    	System.out.println ("FACTURA");
	    	System.out.println ("monto: " + monto);
	    	System.out.println ("descuento: " + descuento);
	    	System.out.println ("total: " + venta);
			return venta;
			
		}
    
	   
	   
	   public void mostrarAlmacenistas() {
		 //MOSTRAR ALMACENISTAS
		    almacenistas = new ArrayList<Almacenista>();
	        System.out.println("");
	        JOptionPane.showMessageDialog(null, "ALMACENISTAS: \n " + almacenistas.toString() + "\n");
		    System.out.println("ALMACENISTAS: \n " + almacenistas.toString() + "\n");
	   }
    
	   
	   public void mostrarVendedores() {
		   vendedores = new ArrayList<Vendedor>();
		    Vendedor vendedor2 = new Vendedor("Sasuke", "Uchiha", "8", "ventas", 6, 768468468, "vendedor", "sauc", 250500);
		    Vendedor vendedor3 = new Vendedor("Lola", "Lilas", "16", "ventas", 8, 484846984, "vendedor", "loli", 250500);
		    vendedores.add(vendedor3);
		    vendedores.add(vendedor2);
		        System.out.println("");
		        JOptionPane.showMessageDialog(null, "VENDEDORES: \n " + vendedores.toString() + "\n");
			    System.out.println("VENDEDORES: \n " + vendedores.toString() + "\n");
			    
		   }
    
	   public void mostrarClientes() {
		   
		   clientes = new ArrayList<Cliente>();
		   Cliente cliente2 = new Cliente("Victoria", "Valerio", "2", "na", 2, 54654654, "cliente", "vickaval", 0, 1234, "Sociedad por Acciones", "muerte al iva");
		   clientes.add(cliente2);
		        System.out.println("");
		        JOptionPane.showMessageDialog(null, "CLIENTES: \n " + clientes.toString() + "\n");
			    System.out.println("CLIENTES: \n " + clientes.toString() + "\n");
		   }
	   
	   public void mostrarOperarios() {
		   operarios = new ArrayList<Operario>();
		     Operario operario2 = new Operario("Martin", "Martinez", "4", "produccion", 6, 54654654, "operario", "marmar", 115500, "Mañana");
		     operarios.add(operario2);
		        System.out.println("");
		        JOptionPane.showMessageDialog(null, "OPERARIOS: \n " + operarios.toString() + "\n");
			    System.out.println("OPERARIOS: \n " + operarios.toString() + "\n");
			    
			    
			
		   }
    
    
	}
