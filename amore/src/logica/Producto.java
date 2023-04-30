package logica;

public class Producto {
	private int idProducto;
	private String nombre;
	private String marca;
	private String precio;
	private int stockDisponible;
	
	public Producto(int idProducto, String nombre, String marca, String precio, int stockDisponible) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.marca = marca;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getStockDisponible() {
		return stockDisponible;
	}

	public void setStockDisponible(int stockDisponible) {
		this.stockDisponible = stockDisponible;
	}
	
	

}
