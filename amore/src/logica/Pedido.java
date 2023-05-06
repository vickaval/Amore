package logica;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Pedido {

	int idPedido;
	double descuento;
	double total;
	Date fecha;
	ArrayList <Producto> productos;
	Cliente cliente;

		
	public enum formaPago
	{
	    EFECTVO, TRANSFERENCIA
	}

	
	
	public Pedido(int idPedido, double descuento, double total, Date fecha, ArrayList<Producto> productos,
			Cliente cliente) {
		this.idPedido = idPedido;
		this.descuento = descuento;
		this.total = total;
		this.fecha = fecha;
		this.productos = productos;
		this.cliente = cliente;
	}
	
	public Pedido() {
		
	}
	
	//getters y setters
    public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}



	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}



	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descuento=" + descuento + ", total=" + total + ", fecha=" + fecha
				+ ", productos=" + productos + ", cliente=" + cliente + "]";
	}


	
	
}
