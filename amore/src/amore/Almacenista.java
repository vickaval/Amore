package amore;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Almacenista extends Usuario {

	ArrayList<Producto> productos;
	ArrayList<Almacenista> almacenistas;

	private ArrayList<Producto> paraEntregar;
	private ArrayList<Pedido> preparados;

	// clase hecha por Sebastian

	public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
		this.almacenistas = new ArrayList<>();
		this.productos = new ArrayList<>();

		this.paraEntregar = new ArrayList<>();
		this.preparados = new ArrayList<>();
	}

	public void estadisticas (){
		int cont = 0;
	
		for (int i=1; i<= this.paraEntregar.size(); i++){
			if(paraEntregar.equals(getParaEntregar())) {
				cont = cont + 1;
			}		
		}
		if(cont >= 100) {
			JOptionPane.showMessageDialog(null, "Producto vendido mas de 100 veces " + getParaEntregar() );
			System.out.println("Producto vendido mas de 100 veces " + getParaEntregar());
		} else {
			JOptionPane.showMessageDialog(null, "El producto fue vendido menos de 100 veces " + getParaEntregar() );
			System.out.println("El producto fue vendido menos de 100 veces " + getParaEntregar());
		}
					
	}

	

	public void visualizarStockProductos(Producto p) {
		boolean tieneStock = productos.contains(p);// chequear
		if (tieneStock) {
			System.out.println(p.getNombre());
			System.out.println(p.getIdProducto());
			System.out.println(p.getStockDisponible());
		} else {
			System.out.println("No hay stock");
		}
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto p) {
		productos.add(p);// chequear
	}

	public void eliminarProducto(Producto p) {
		productos.remove(p);
	}

	public ArrayList<Almacenista> getAlmacenistas() {
		return almacenistas;
	}

	public void setAlmacenistas(ArrayList<Almacenista> almacenistas) {
		this.almacenistas = almacenistas;
	}

	public ArrayList<Producto> getParaEntregar() {
		return paraEntregar;
	}

	public void setParaEntregar(ArrayList<Producto> paraEntregar) {
		this.paraEntregar = paraEntregar;
	}

	public ArrayList<Pedido> getPreparados() {
		return preparados;
	}

	public void setPreparados(ArrayList<Pedido> preparados) {
		this.preparados = preparados;
	}

}
