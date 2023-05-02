package logica;

import java.sql.Date;
import java.util.ArrayList;

public class Produccion {
	
	private int idProduccion;
	private ArrayList<Operario> operarios;
	private ArrayList<MateriaPrima> listaMPs;
	
	public Produccion(int idProduccion, ArrayList<Operario> operarios, ArrayList<MateriaPrima> listaMPs) {
		super();
		this.idProduccion = idProduccion;
		this.operarios = new ArrayList<>();
		this.listaMPs = new ArrayList<>();
	}

	public int getIdProduccion() {
		return idProduccion;
	}

	public void setIdProduccion(int idProduccion) {
		this.idProduccion = idProduccion;
	}

	public ArrayList<Operario> getOperarios() {
		return operarios;
	}

	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}

	public void ingresarOperario(Operario op) {
		this.operarios.add(op);
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
