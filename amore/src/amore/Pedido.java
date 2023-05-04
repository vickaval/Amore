package amore;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Pedido extends Vendedor{

	int idPedido;;
	double descuento;
	double total;
	Date fecha;
	ArrayList <Producto> productos;
	Cliente cliente;

	ArrayList <Pedido> pedidos;
	
	
	
	public enum formaPago
	{
	    EFECTVO, TRANSFERENCIA
	}


	
	public Pedido(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			 String contraseña, double sueldo, int idPedido, Usuario usuario2, double descuento,
			double total, Date fecha, ArrayList<Producto> productos, Cliente cliente) {
		
		super(nombre, apellido, id, null, telefono, aniosAntiguedad, null, null, sueldo);
		
		this.idPedido = idPedido;
		this.descuento = descuento;
		this.total = total;
		this.fecha = fecha;
		this.cliente = cliente;
		this.productos = new ArrayList<>();
		this.pedidos = new ArrayList<>();

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

	

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}



	//metodos
	public String agregarPedido (Pedido pedidos) {

		  total = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el total: "));
		  pedidos.setTotal(total);
		  
		  int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuit del cliente: "));
		  Pedido.this.setCliente(cuit);
		  
		  java.util.Date hora = new Date();
		  Pedido.this.setFecha(hora);
		  
		  
		//tipo de forma de pago
			String []formaDePago = {"Efectivo","Transferencia"};
	        int fp = JOptionPane.showOptionDialog(null, "Elija forma de pago", "Forma de pago",JOptionPane.DEFAULT_OPTION,
	                JOptionPane.QUESTION_MESSAGE, null, formaDePago, formaDePago[0]);
	        
	        //si es en efectivo, se envia factura, si es transferencia, un comprobante
			  if (fp == 0) {
				  System.out.print("Emitiendo factura");
				  JOptionPane.showMessageDialog(null, formaDePago + "Factura");
			  } else if(fp == 1) {
			      System.out.print("Enviando comprobante");
			      JOptionPane.showMessageDialog(null, formaDePago + "Comprobante");
			  }
	}
	
	
	public String editarPedido (Pedido p) {
		
	}
	
	public String eliminarPedido (Pedido p) {
		// Definir una ArrayList de pedidos en el main 
				//ArrayList<String> pedidos = new ArrayList<String>();
					   pedidos.remove(pedidos.size()-1);			 
					   System.out.println("Se ha eliminado el pedido");  
					   System.out.println("Hay " + pedidos.size() + " pedidos en la lista");
					   
					   
					return "Pedido eliminado";	
	}
	
	
	
	



	
	
	

}
