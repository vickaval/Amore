package amore;

public class Proveedor {
	
	private String nombre;
	private int cuit;
	private String materialesQueProvee;
	private double montoComprado;
	
	public Proveedor(String nombre, String materialesQueProvee, int cuit, double montoComprado) {
		this.nombre = nombre;
    	this.cuit = cuit;
		this.materialesQueProvee = materialesQueProvee;
		this.montoComprado = montoComprado;
	
	}
	
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getMaterialesQueProvee() {
		return materialesQueProvee;
	}
	public void setMaterialesQueProvee(String materialesQueProvee) {
		this.materialesQueProvee = materialesQueProvee;
	}

	public double getMontoComprado() {
		return montoComprado;
	}
	public void setMontoComprado(double montoComprado) {
		this.montoComprado = montoComprado;
	}
	
	
	//metodos	
	public String deudaConProveedores(Proveedor p) {
		return "deuda";
		
	}
	
	
	public String proveedoresQueDeben(Proveedor p){
		return "deben";
		
	}
	

	//informacion completa
	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", cuit=" + cuit + ", materialesQueProvee=" + materialesQueProvee
				+ ", montoComprado=" + montoComprado + "]";
	}
	
	
	
	
	
	
	
	

}
