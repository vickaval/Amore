package amore;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Administrador extends Usuario{
	
	  ArrayList<Usuario> empleados;

	  
	public Administrador(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		this.empleados = new ArrayList<>();
	}

	

	
	
	
	public void aniadirEmpleado(Vendedor vendedores, Almacenista almacenistas) {
		//tipo de usuario
		String []usuario = {"Almacenista", "Vendedor"};
        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario", "Añadir empleado",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);

		  if(usu  == 0) {
		    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del almacenista");
		    almacenistas.setNombre(nombre);
	        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del almacenista");
	        almacenistas.setApellido(apellido);
	        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del almacenista");
	        almacenistas.setId(id);
	        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del almacenista");
	        almacenistas.setNombreArea(nombreArea);
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
	        almacenistas.setAniosAntiguedad(aniosAntiguedad);
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del almacenista"));   
	        almacenistas.setTelefono(telefono);
	       
	        JOptionPane.showMessageDialog(null, "Almacenista " + almacenistas.getNombre() + " " + almacenistas.getApellido() + " ha sido registrado");
	        
	        
	     }else if(usu == 1) {
	    	    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del vendedor");
			    vendedores.setNombre(nombre);
		        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del vendedor");
		        vendedores.setApellido(apellido);
		        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del vendedor");
		        vendedores.setId(id);
		        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del vendedor");
		        vendedores.setNombreArea(nombreArea);
		        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
		        vendedores.setAniosAntiguedad(aniosAntiguedad);
		        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del vendedor"));   
		        vendedores.setTelefono(telefono);
		        
		        JOptionPane.showMessageDialog(null, "Vendedor " + vendedores.getNombre() + " " + vendedores.getApellido() + " ha sido registrado");
	     } else {
		 
		  
		JOptionPane.showMessageDialog(null, "El empleado no ha podido ser registrado");
			
	    }
	  }
	
	
	
	//-------------------------------------------------------
	//EDITAR CLIENTE
	public void editarCliente(String idSearch, ArrayList<Cliente> clientes) {
		
		idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
		  
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
		public void editarVendedor(String idSearch, ArrayList<Vendedor> vendedores) {
			
			idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
			
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
			public void editarAlmacenista(String idSearch, ArrayList<Almacenista> almacenistas) {
					
					idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
					
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
			public void editarOperario(String idSearch, ArrayList<Operario> operarios) {
					
					idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
					
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
	public void eliminarCliente(String idSearch, ArrayList<Cliente> clientes){
			
			idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
			
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
	public void eliminarVendedor(String idSearch, ArrayList<Vendedor> vendedores){
			
			idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
			
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
	public void eliminarAlmacenista(String idSearch, ArrayList<Almacenista> almacenitas){
			
			idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
			
			for (int i = 0; i< almacenitas.size(); i++) {
             	  while(almacenitas.get(i).getId().equals(idSearch)) {  
             		 JOptionPane.showMessageDialog(null, "Eliminar almacenita");             		 
             		almacenitas.remove(i);
             		
             		almacenitas.remove(almacenitas.size()-1);			 
		   JOptionPane.showMessageDialog(null, "Hay " + almacenitas.size() + " almacenitas en la lista");
		   System.out.println("Hay " + almacenitas.size() + " almacenitas en la lista");
		  System.out.println( "Almacenita eliminado");	
             	  }
			}	   
     }
	
	
	
	//ELIMINAR OPERARIO
	public void eliminarOperario(String idSearch, ArrayList<Operario> operarios){
			
			idSearch = (String)JOptionPane.showInputDialog("Digite el id del usuario a modificar");
			
			for (int i = 0; i< operarios.size(); i++) {
             	  while(operarios.get(i).getId().equals(idSearch)) {  
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
	    	// Clientes grandes: 10% si compra 100 o + 		
		    monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente"));   
	       
	    	double descuento;
	    	
	    	if(monto >= 100){
	    	descuento = (monto * 10) / 100;
	    	} else {
	    	descuento = 0;
	    	}

	    	System.out.println ("El descuento es de: " + descuento);
	    	double venta = monto - descuento;
	    	System.out.println ("El monto total de la venta es de: " + venta);
	    	
	    	
			return venta;
			
		}
    
    
    
    
    
	public String estadisticas (Producto productos){
		
		
		return null;
		
	}
	
	
	
	
	   //registro cliente
			public void aniadirCliente(Cliente clientes) {
				JOptionPane.showMessageDialog(null, "Registro de cliente");
				
				    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del cliente");
				    clientes.setNombre(nombre);
			        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del cliente");
			        clientes.setApellido(apellido);
			        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del cliente");
			        clientes.setId(id);
			        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del cliente"));   
			        clientes.setTelefono(telefono);
			        int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cuit del cliente"));   
			        clientes.setCuit(cuit);


			       
			        JOptionPane.showMessageDialog(null, "Cliente " + clientes.getNombre() +  " " + clientes.getApellido() + " registrado");
		    
		   
		    } 
			
			//registro operario
			public void aniadirOperario(Operario operarios) {
				JOptionPane.showMessageDialog(null, "Registro de operario");
				
				    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del operario");
				    operarios.setNombre(nombre);
			        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del operario");
			        operarios.setApellido(apellido);
			        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del operario");
			        operarios.setId(id);
			        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del operario");
			        operarios.setNombreArea(nombreArea);
			        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
			        operarios.setAniosAntiguedad(aniosAntiguedad);
			        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del operario"));   
			        operarios.setTelefono(telefono);
			        
			        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
					operarios.setTurno(turno);
			       
			        JOptionPane.showMessageDialog(null, "Operario " + operarios.getNombre() + " " + operarios.getApellido() + " registrado");
		    
		   
		    } 
			
				public void visualizarStockMateriaPrima2(String nombre, MateriaPrima mp){
			  nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre de materia prima");  
					if(nombre.equalsIgnoreCase(getNombre())){
						System.out.println(mp.getNombre());
						System.out.println(mp.getStockDisponible());
						JOptionPane.showMessageDialog(null,"Materia Prima: " + mp.getNombre() + " tiene en stock " + mp.getStockDisponible() );
					}else{
						JOptionPane.showMessageDialog(null,"Sin stock disponible");
						System.out.println("No hay stock");
					}
			}






	
	

	
	
}
