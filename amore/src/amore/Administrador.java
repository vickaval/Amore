package amore;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Administrador extends Usuario{
	
	  ArrayList<Usuario> empleados;

	  
	public Administrador(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		this.empleados = new ArrayList<>();
	}

	
	
	//metodos
	public String producMasVendido() {
		return null;
		
	}
	
	
	
	public boolean aniadirEmpleado(Usuario empleados, Operario operarios) {
		//tipo de usuario
		String []usuario = {"Administrador","Operario","Almacenista", "Vendedor"};
        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario", "Añadir empleado",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);

		  
		    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del empleado");
		    empleados.setNombre(nombre);
	        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del empleado");
	        empleados.setApellido(apellido);
	        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del empleado");
	        empleados.setId(id);
	        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del empleado");
	        empleados.setNombre(nombreArea);
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
	        empleados.setAniosAntiguedad(aniosAntiguedad);
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del empleado"));   
	        empleados.setTelefono(telefono);
	       
	        JOptionPane.showMessageDialog(null, "Empleado " + getNombre() + getApellido() + " ha sido registrado");
	
		  //si es operario, se agrega turno
		  if (usu == 1) {
				JOptionPane.showMessageDialog(null, "Registro de operario en metodo registro operario");	
		  }
		  
		JOptionPane.showMessageDialog(null, "El empleado no ha podido ser registrado");
		return false; 		
	}
	
	
	
	
	
	
	//editar usuario (empleado, cliente o operario)
	public String editarUsuario (Usuario empleados, Cliente clientes, Operario operarios) {
		 
		//tipo de usuario
			String []usuario = {"Cliente","Empleado","Operario"};
	        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario a editar", "Editar usuario",JOptionPane.DEFAULT_OPTION,
	                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);
		 
	        String idSearch = (String)JOptionPane.showInputDialog("Digite el id del empleado a modificar");
	        
	        //EDITAR CLIENTE
	        if (usu == 0) {
	        	for (int i = 0; i<clientes.length; i++) {
	          	  while(clientes.getId().equals(idSearch)) {   	
	          		JOptionPane.showMessageDialog(null, "Editar cliente");
					
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

			      	}		
			        JOptionPane.showMessageDialog(null, "El empleado: " + clientes[i] + "has sido editado");
					return "Cliente editado exitosamente";	          	  
	        	}
	        	
	        	//EDITAR EMPLEADO
	        } else if (usu == 1) {
           for (int i = 0; i<empleados.length; i++) {
        	  while(empleados.getId().equals(idSearch)) {       		       	
                //if (empleados[i].id == idSearch) {

        		String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del empleado");
      		    empleados.setNombre(nombre);
            	//empleados[i].nombre = "NUEVONOMBRE";
      		     String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del empleado");
  	            empleados.setApellido(apellido);
            	//empleados[i].apellido = "NUEVOAPELLIDO";
  	            String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del empleado");
  	            empleados.setNombre(nombreArea);
            	//empleados[i].nombreArea = "NUEVO NOMBRE AREA";
            	int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
  	            empleados.setAniosAntiguedad(aniosAntiguedad);
            	//empleados[i].aniosAntiguedad = 20;
  	            int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del empleado"));   
  	            empleados.setTelefono(telefono);
            	//empleados[i].telefono = 546545465;
       
         }   
		JOptionPane.showMessageDialog(null, "El empleado: " + empleados[i] + "has sido editado");
		return "Empleado editado exitosamente";
		}        
         //EDITAR OPERARIO
           } else if (usu == 3) {
        	   for (int i = 0; i<operarios.length; i++) {
             	  while(operarios.getId().equals(idSearch)) {  
             		  JOptionPane.showMessageDialog(null, "Editar operario");
             	  
		
	    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del operario");
	    operarios.setNombre(nombre);
        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del operario");
        operarios.setApellido(apellido);
        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del operario");
        operarios.setId(id);
        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del operario");
        operarios.setNombre(nombreArea);
        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
        operarios.setAniosAntiguedad(aniosAntiguedad);
        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del operario"));   
        operarios.setTelefono(telefono);
        
        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
		operarios.setTurno(turno);
             	  }
	        JOptionPane.showMessageDialog(null, "El empleado: " + operarios[i] + "has sido editado");
			return "Empleado editado exitosamente";
	        
           }
          
        	   
        	   
	    }

	
	
	
	
	
	public boolean eliminarEmpleado(Usuario empleados){
			   empleados.remove(empleados.size()-1);			 
			   System.out.println("Se ha eliminado el empleado");  
			   System.out.println("Hay " + empleados.size() + " empleados en la lista");	
			   
			   
	}
	
	
	
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
	
    
    
    
    
    
	public String estadisticas (Producto productos){
		
		
		return null;
		
	}
	
	
	
	
	   //registro cliente
			public void registroCliente(Cliente clientes) {
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


			       
			        JOptionPane.showMessageDialog(null, "Operario " + getNombre() + getApellido() + " registrado");
		    
		   
		    } 
			
			//registro operario
			public void registroOperario(Operario operarios) {
				JOptionPane.showMessageDialog(null, "Registro de operario");
				
				    String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del operario");
				    operarios.setNombre(nombre);
			        String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del operario");
			        operarios.setApellido(apellido);
			        String id = (String)JOptionPane.showInputDialog(null, "Ingrese id del operario");
			        operarios.setId(id);
			        String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese el nombre del área del operario");
			        operarios.setNombre(nombreArea);
			        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antigüedad"));
			        operarios.setAniosAntiguedad(aniosAntiguedad);
			        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de teléfono del operario"));   
			        operarios.setTelefono(telefono);
			        
			        String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
					operarios.setTurno(turno);
			       
			        JOptionPane.showMessageDialog(null, "Operario " + getNombre() + getApellido() + " registrado");
		    
		   
		    } 
	
	

	
	
}
