package Logica;

import java.util.ArrayList;

public class Produccion {
	
private int idProduccion;
	
	private ArrayList<MateriaPrima> listaMPs;
	
	public Produccion(int idProduccion, ArrayList<MateriaPrima> listaMPs) {
		super();
		this.idProduccion = idProduccion;
		this.listaMPs = new ArrayList<>();
	}

	public int getIdProduccion() {
		return idProduccion;
	}

	public void setIdProduccion(int idProduccion) {
		this.idProduccion = idProduccion;
	}
	
	public void producir(Producto pr) {
		
	}

	public ArrayList<MateriaPrima> getListaMPs() {
		return listaMPs;
	}
	
	public void agregarMateriasPrimas(MateriaPrima mp) {
		this.listaMPs.add(mp);
	}
	


}
