package amore;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Proveedor {
	
	private String nombre;
	private int cuit;
	private String materialesQueProvee;
	private double montoComprado;
	private double deuda;
	
	ArrayList<Proveedor> provedoresDeben;
	
	public Proveedor(String nombre, String materialesQueProvee, int cuit, double montoComprado, double deuda) {
		this.nombre = nombre;
    	this.cuit = cuit;
		this.materialesQueProvee = materialesQueProvee;
		this.montoComprado = montoComprado;
		this.deuda = deuda;
		this.provedoresDeben = new ArrayList<>();
	
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
	

	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	
	public ArrayList<Proveedor> getProvedoresDeben() {
		return provedoresDeben;
	}
	public void setProvedoresDeben(ArrayList<Proveedor> provedoresDeben) {
		this.provedoresDeben = provedoresDeben;
	}



	//metodos	
	public void deudaConProveedores(Proveedor p) {
		JOptionPane.showMessageDialog(null,"Deuda de " + getDeuda());
		
		
	}
	
	
	public void proveedoresQueDeben(Proveedor p){
		if (getDeuda() != 0) {
			provedoresDeben.add(p);
			JOptionPane.showMessageDialog(null,"Exite una deuda de " + getDeuda() + " de " + p);
		}
		
	}
	

	//informacion completa
	public void informacionProveedores() {
		JOptionPane.showMessageDialog(null,"PROVEEDOR \nNombre: " +  getNombre() + "\nCuit: " + getCuit() + "\nProvee: " + getMaterialesQueProvee() + 
				"\nDeuda: " + getDeuda());
	}
	
	
	
	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", cuit: " + cuit + ", materialesQueProvee=" + materialesQueProvee
				+ ", montoComprado=" + montoComprado + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
