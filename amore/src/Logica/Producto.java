package logica;

public abstract class Producto {
	private int idProducto;
	private String nombre;
	private String tipo;
	private int cantidad;
	private double precio;

	
	public Producto(int idProducto, String nombre, String tipo, double precio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;		
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public Producto() {
	
	}
	
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", Cantidad=" + cantidad + "]";
	}
	
	
	

}
