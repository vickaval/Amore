package amore;

import java.util.ArrayList;

public class Almacenista extends Usuario {
	

	ArrayList<Producto>productos;
	ArrayList<Almacenista>almacenistas;

	//clase hecha por Sebastian
		
	

	public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
				String usuario, String contrasena, double sueldo) {
			super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
			this.almacenistas = new ArrayList<>();
			this.productos = new ArrayList<>();
		}
	
	
    /*
	public Almacenista(){;

	}
	*/


	public boolean iniciarSesion(String usuario, String contrasena) {
	    // Verificar si el usuario y la contrase a son v lidos
	    if (usuario.equals(getUsuario()) &&contrasena.equals(getContraseña())) {
	        System.out.println("Inicio de sesion exitoso.");
	        return true;
	    } else {
	        System.out.println("Inicio de sesi n fallido. Por favor verifique su usuario, contrase a y permiso.");
	        return false;
	    }
	}



	public void visualizarStockProductos (Producto p){
	    boolean tieneStock= productos.contains(p);//chequear
	    if(tieneStock){
	        System.out.println(p.getNombre());
	        System.out.println(p.getIdProducto());
	        System.out.println(p.getStockDisponible());
	    }else{
	        System.out.println("No hay stock");
	    }
	}
	
	

	public ArrayList<Producto> getProductos() {
	    return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
	    this.productos = productos;
	}

	public void agregarProducto (Producto p){
	    productos.add(p);//chequear
	}

	public void eliminarProducto(Producto p){
	    productos.remove(p);
	}


	public ArrayList<Almacenista> getAlmacenistas() {
		return almacenistas;
	}
	public void setAlmacenistas(ArrayList<Almacenista> almacenistas) {
		this.almacenistas = almacenistas;
	}


		

	

}
