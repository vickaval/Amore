package amore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Vendedor extends Usuario {
	

	  ArrayList<Vendedor> vendedores;
	  ArrayList<Producto> productos;
	  
	public Vendedor(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		this.vendedores = new ArrayList<>();
		this.productos = new ArrayList<>();
	}
	
	

	//metodos
	public double calcularGanacias(Pedido pedidos) {
	         double ventas2 = 0;
	         
	         System.out.println("Número de pedidos " + ((List<Vendedor>) pedidos).size());

	             for(int i=1;i<= pedidos.lenght ;i++) {
	                  System.out.print("Monto pedido "+ pedidos.getTotal());
	                  ventas2 = pedidos.getTotal();
	                  ventas2 += pedidos.getTotal();	 
	             }
	             
	             double ganancia = ventas2 / ((List<Vendedor>) pedidos).size();
	         System.out.println("El promedio de ventas es " + ganancia);
	         JOptionPane.showMessageDialog(null, "El promedio de ventas es " + ganancia);
	         
		return ganancia;
		
	}
	
	
	
	public double calcularPerdidas(MateriaPrima materiasPrimas, Pedido pedidos) {
		double monto;
		for(int i=1; i<= materiasPrimas.lenght ;i++) {
			 monto = materiasPrimas.getPrecio();
			 monto += materiasPrimas.getPrecio();	
		}
		
		double perdida = monto / ((List<Vendedor>) pedidos).size();
		System.out.println("El promedio de perdida es " + perdida);
        JOptionPane.showMessageDialog(null, "El promedio de ventas es " + perdida);
		

		return perdida;
		
	}
	
	
	
	
	public void visualizarStock() {
		System.out.print("Stock: " + getProductos());
	}
	
	
	
	public void mostrarVendedores() {
	    StringBuilder sb = new StringBuilder();
	    for (Vendedor vendedor : vendedores) {
	        sb.append(vendedor.getUsuario()).append(" - ").append(vendedor.getNombreArea()).append("\n");
	    }
	    JOptionPane.showMessageDialog(null, sb.toString(), "Vendedores: ", JOptionPane.PLAIN_MESSAGE);
	}

	
	
	//getters y setters
	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

}

