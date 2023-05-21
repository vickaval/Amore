package Logica;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Produccion extends Operario{
	
	int idProduccion;
	Date fechaProduccion;
	Producto prodElaborados;
	int totalProducido;
	ArrayList <Operario> operarios;
	ArrayList <MateriaPrima> materiasPrimas;
	ArrayList<Produccion> produccion;
	
	
	
	
	public Produccion(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contraseña, double sueldo, String turno, ArrayList<MateriaPrima> mps, 
			int idProduccion, Date fechaProduccion, Producto prodElaborados, int totalProducido,
			ArrayList<Operario> operarios, ArrayList<MateriaPrima> materiasPrimas) {
		super(nombre,  apellido,  id,  nombreArea,  aniosAntiguedad,  telefono,
				 usuario,  contraseña,  sueldo,  turno, mps);
		this.idProduccion = idProduccion;
		this.fechaProduccion = fechaProduccion;
		this.prodElaborados = prodElaborados;
		this.totalProducido = totalProducido;
		this.operarios = operarios;
		this.materiasPrimas = materiasPrimas;
		this.produccion = new ArrayList<>();
	}
	
	
	
	//getters y setters
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



	public Producto getProdElaborados() {
		return prodElaborados;
	}



	public void setProdElaborados(Producto prodElaborados) {
		this.prodElaborados = prodElaborados;
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



	public ArrayList<MateriaPrima> getMateriasPrimas() {
		return materiasPrimas;
	}



	public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}
	
	
	
	public ArrayList<Produccion> getProduccion() {
		return produccion;
	}
	public void setProduccion(ArrayList<Produccion> produccion) {
		this.produccion = produccion;
	}



	//metodos
	public boolean producir (Producto p) {
		int cantProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad a producir: "));
		if(materiasPrimas.size() <= cantProd ) {
			JOptionPane.showMessageDialog(null, "Cantidad aceptable. Inicia la produccion");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Cantidad denegada. Faltante de materia prima");
			return false;
		}
	}
	
	
	
	public String infoProduccion(Produccion pr) { 
		//chequear
				boolean chequear = produccion.contains(pr);
				if(chequear) {
					for (int i = 0; i < produccion.size(); i++) {
						System.out.println(i);
						}
				}else{
					JOptionPane.showMessageDialog(null, "No existe esta produccion");
					System.out.println("No existe esta produccion");
				}
		return "Produccion [idProduccion=" + idProduccion + ", fechaProduccion=" + fechaProduccion + ", prodElaborados=" + prodElaborados + ", totalProducido=" + totalProducido
				+ ", Operario=" + operarios + ", Materias Primas=" + materiasPrimas  + "]";
	}
		
	
	
	public void agregarProduccion (Produccion pr) {
		//chequeear
		produccion.add(pr);
	}
	
	
	

	


}
