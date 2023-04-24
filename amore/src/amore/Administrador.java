package amore;

public class Administrador extends Usuario{
	
	
	public Administrador(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		
	}

	
	//metodos
	public boolean iniciarSesion(Administrador  ad) {
		return false;
		
	}
	
	public String producMasVendido() {
		return null;
		
	}
	
	public boolean aniadirEmpleado(Empleado e) {
		
	}
	
	public boolean editarEmpleado (Empleado e) {
		
	}
	
	public boolean eliminarEmpleado(Empleado e){
		
	}
	
	public boolean aplicarDescuento(Cliente c) {
		
	}
	
	public String estadisticas (Local lo){
		
	}
	
	
	
}
