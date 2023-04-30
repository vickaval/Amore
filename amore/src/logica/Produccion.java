package logica;

import java.sql.Date;
import java.util.ArrayList;

public class Produccion {
	
	private int idProduccion;
	private Date fechaProduccion;
	private Categoria categoriaProducida;
	private int totalProducido;
	private ArrayList<Operario> operarios;
	
	
	
	public int getIdProduccion() {
		return idProduccion;
	}

	public void setIdProduccion(int idProduccion) {
		this.idProduccion = idProduccion;
	}

	public Date getFechaProduccion() {
		return fechaProduccion;
	}

	public void setFechaProduccion(Date fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}

	public Categoria getCategoriaProducida() {
		return categoriaProducida;
	}

	public void setCategoriaProducida(Categoria categoriaProducida) {
		this.categoriaProducida = categoriaProducida;
	}

	public int getTotalProducido() {
		return totalProducido;
	}

	public void setTotalProducido(int totalProducido) {
		this.totalProducido = totalProducido;
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
	

}
