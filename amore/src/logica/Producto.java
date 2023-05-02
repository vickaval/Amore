package logica;

public abstract class Producto {
	private int idProducto;
	private String nombre;
	private String tipo;
	private double precio;
	private int stockDisponible;
	
	public Producto(int idProducto, String nombre, String tipo, double precio, int stockDisponible) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.stockDisponible = stockDisponible;
	}
	
	public Producto() {
	
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

	public int getStockDisponible() {
		return stockDisponible;
	}

	public void setStockDisponible(int stockDisponible) {
		this.stockDisponible = stockDisponible;
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
				+ ", stockDisponible=" + stockDisponible + "]";
	}
	
	
	

}
