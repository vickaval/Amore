package amore;

import javax.swing.JOptionPane;

public class Administrador extends Usuario{
	
	
	public Administrador(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		
	}

	
	//metodos
	public String producMasVendido() {
		return null;
		
	}
	
	public boolean aniadirEmpleado(Empleado e) {
		//tipo de usuario
		String []usuario = {"Administrador","Operario","Almacenista", "Vendedor"};
        int usu = JOptionPane.showOptionDialog(null, "Elija tipo de usuario", "Añadir empleado",JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);
        
		  String nombre = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del empleado: ");
		  Empleado.this.setNombre(nombre);
		  String apellido = (String)JOptionPane.showInputDialog(null, "Ingrese apellido del empleado: ");
		  Empleado.this.setApellido(apellido);
		  String nombreArea = (String)JOptionPane.showInputDialog(null, "Ingrese nombre del Area del empleado: ");
		  Empleado.this.setNombreArea(nombreArea);
		  int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese telefono del empleado: "));
		  Empleado.this.setTelefono(telefono);
		  
		  
		  //si es operario, se agrega turno
		  if (usu == 1) {
			  String turno = (String)JOptionPane.showInputDialog(null, "Ingrese turno del operario: ");
			  Operario.this.setTurno(turno);
		  } else {
		  
		  return true;
		  System.out.println("El empleado " + nombre + apellido + " ha sido añadido");
		  }
		  
	
		
	}
	
	//sirve o no?
	public boolean editarEmpleado (Empleado e) {
		
	}
	
	public boolean eliminarEmpleado(Empleado e){
		// Definir una ArrayList de empleados en el main 
		//ArrayList<String> empleados = new ArrayList<String>();
			   empleados.remove(empleados.size()-1);			 
			   System.out.println("Se ha eliminado el empleado");  
			   System.out.println("Hay " + empleados.size() + " empleados en la lista");	
			   
			   
	}
	
	
	
    public boolean aplicarDescuento(Cliente c) {
    	// Clientes grandes: 10% si compra 100 o + 
    	double descuento;
    	double venta = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la cantidad de la venta: "));
    	System.out.println("La venta es de: "+ venta);

    	if(venta >= 100){
    	descuento = (venta * 10) / 100;
    	} else{
    	descuento = 0;
    	}

    	System.out.println ("El descuento es de: " + descuento);
    	venta = venta - descuento;
    	System.out.println ("El monto total de la venta es de: " + venta);
		
	}
	
	public String estadisticas (Local lo){
		
	}
	
	
	public void visualizarStock() {
		System.out.print("Stock: " + ArrayList<Producto>.getProductos());
	}
	
	
	
}
