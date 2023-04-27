package Logica;

import java.util.ArrayList;

public class MateriaPrima {
	private String nombre;
	private String procedencia;
	private double precio;
	private int stockDisponible;
	private int codigoMp;
	ArrayList<MateriaPrima> nombreYPrecioMateriaPrima;
	
	MateriaPrima(){
		
	}

	public MateriaPrima(String nombre, String procedencia, double precio, int stockDisponible, int codigoMp,
			ArrayList<MateriaPrima> nombreYPrecioMateriaPrima) {
		
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.precio = precio;
		this.stockDisponible = stockDisponible;
		this.codigoMp = codigoMp;
		this.nombreYPrecioMateriaPrima = nombreYPrecioMateriaPrima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStockDisponible() {
		return stockDisponible;
	}

	public void setStockDisponible(int stockDisponible) {
		this.stockDisponible = stockDisponible;
	}

	public int getCodigoMp() {
		return codigoMp;
	}

	public void setCodigoMp(int codigoMp) {
		this.codigoMp = codigoMp;
	}

	public ArrayList<MateriaPrima> getNombreYPrecioMateriaPrima() {
		return nombreYPrecioMateriaPrima;
	}

	public void setNombreYPrecioMateriaPrima(ArrayList<MateriaPrima> nombreYPrecioMateriaPrima) {
		this.nombreYPrecioMateriaPrima = nombreYPrecioMateriaPrima;
	}
	
	
	
	

}
