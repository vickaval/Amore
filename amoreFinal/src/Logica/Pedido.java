package Logica;

import java.sql.Date;

public class Pedido {
	
	int idPedido;
	double descuento;
	double total;
	Date fecha;
	int idCliente;
	int idVendedor;
	int estado;	
	String formaPago;
	
	
	
	public Pedido(int idPedido, double descuento, double total, Date fecha, int idCliente, int idVendedor, int estado, String formaPago) {
		this.idPedido = idPedido;
		this.descuento = descuento;
		this.total = total;
		this.fecha = fecha;
		this.idCliente = idCliente;
		this.idVendedor = idVendedor;
		this.estado = estado;
		this.formaPago = formaPago;
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

	public int getCliente() {
		return idCliente;
	}
	public void setCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", descuento=" + descuento + ", total=" + total + ", fecha=" + fecha
				+ ", idCliente=" + idCliente + ", idVendedor=" + idVendedor + ", estado=" + estado + ", formaPago="
				+ formaPago + "]";
	}




	
	


}
