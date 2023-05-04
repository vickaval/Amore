package logica;

import java.sql.Date;
import java.util.ArrayList;

public class Produccion {
	
	private int idProduccion;
	private Date fechaProduccion;
	private Producto productoAElaborar;
	private int totalProducido;
	private ArrayList<Operario> operarios;
	private ArrayList<MateriaPrima> matePrimaUsada;
	private ArrayList<Produccion> datosProduccion;
	
	public Produccion(int idProduccion, Date fechaProduccion, Producto productoAElaborar, int totalProducido,
			ArrayList<Operario> operarios, ArrayList<MateriaPrima> matePrimaUsada,
			ArrayList<Produccion> datosProduccion) {
		
		this.idProduccion = idProduccion;
		this.fechaProduccion = fechaProduccion;
		this.productoAElaborar = productoAElaborar;
		this.totalProducido = totalProducido;
		this.operarios = operarios;
		this.matePrimaUsada = matePrimaUsada;
		this.datosProduccion = datosProduccion;
	}

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

	public Producto getProductoAElaborar() {
		return productoAElaborar;
	}

	public void setProductoAElaborar(Producto productoAElaborar) {
		this.productoAElaborar = productoAElaborar;
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

	public ArrayList<MateriaPrima> getMatePrimaUsada() {
		return matePrimaUsada;
	}

	public void setMatePrimaUsada(ArrayList<MateriaPrima> matePrimaUsada) {
		this.matePrimaUsada = matePrimaUsada;
	}

	public ArrayList<Produccion> getDatosProduccion() {
		return datosProduccion;
	}

	public void setDatosProduccion(ArrayList<Produccion> datosProduccion) {
		this.datosProduccion = datosProduccion;
	}

	public void agregarOperario(Operario op) {
		//chequear
		operarios.add(op);
	}
	
	public void agregarMateriaPrima (MateriaPrima mp) {
		//chequeear
		matePrimaUsada.add(mp);
	}
	
	public void producir (Producto p) {
		//chequear
		System.out.println("Se empieza a producir el producto "+p.getNombre());
	}
	
	public void agregarProduccion (Produccion pr) {
		//chequeear
		datosProduccion.add(pr);
	}
	
	public void infoProduccion (Produccion pr) {
		//chequear
		boolean chequear=datosProduccion.contains(pr);
		if(chequear) {
			for (int i = 0; i < datosProduccion.size(); i++) {
				System.out.println(i);
				}
		}else{
			System.out.println("No existe esta produccion");
		}
	}
	
	
	
	
	
	
	

}
