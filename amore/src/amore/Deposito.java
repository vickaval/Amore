package Logica;

import java.util.ArrayList;

public class Deposito {
	private String nombre;
	ArrayList<Producto>productos;
	Almacenista empleado;
	
	Deposito(){
		
	}

	public Deposito(String nombre, ArrayList<Producto> productos, Almacenista empleado) {
		super();
		this.nombre = nombre;
		this.productos = productos;
		this.empleado = empleado;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Almacenista getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Almacenista empleado) {
		this.empleado = empleado;
	}
	
	
	
	

}
