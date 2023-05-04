package logica;

public class Almacenista extends Usuario {
<<<<<<< Updated upstream

	ArrayList<Producto>productos;
=======
//clase hecha por Sebastian
	
>>>>>>> Stashed changes

public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
	}

public Almacenista(){;

}


public boolean iniciarSesion(String usuario, String contrasena) {
    // Verificar si el usuario y la contrase a son v lidos
    if (usuario.equals(getUsuario()) &&contrasena.equals(getContrasena())) {
        System.out.println("Inicio de sesion exitoso.");
        return true;
    } else {
        System.out.println("Inicio de sesi n fallido. Por favor verifique su usuario, contrase a y permiso.");
        return false;
    }
}

public void visualizarStockMateriaPrima(MateriaPrima mp){
    boolean tieneStock=mps.contains(mp);//chequear
		if(tieneStock){
			System.out.println(mp.getNombre());
			System.out.println(mp.getStockDisponible());
		}else{
			System.out.println("No hay stock");
		}
}

public void visualizarStockProductos (Producto p){
    boolean tieneStock=mps.contains(mp);//chequear
    if(tieneStock){
        System.out.println(mp.getNombre());
        System.out.println(mp.getIdProducto());
        System.out.println(mp.getStockDisponible());
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


	

}
