package amore;

public class Vendedor extends Usuario {
	


	public Vendedor(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		
	}
	
	//metodos
	public double calcularGanacias(Produccion p) {
		
	}
	
	public double calcularPerdidas(Produccion p) {
		
	}
	
	public void visualizarStock() {
		System.out.print("Stock: " + ArrayList<Producto>.getProductos());
	}

}
