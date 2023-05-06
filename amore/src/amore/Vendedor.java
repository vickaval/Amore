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
	public double calcularGanacias(ArrayList<Pedido> pedidos) {
	         double ventas2 = 0;
	         
	         System.out.println("Número de pedidos " + pedidos.size());

	             for(int i=1;i<= pedidos.size() ;i++) {
	                  System.out.print("Monto pedido "+ pedidos.get(i).getTotal());	                  
	                  ventas2 = pedidos.get(i).getTotal();
	                  ventas2 += pedidos.get(i).getTotal();	 
	             }
	             
	             double ganancia = ventas2 / pedidos.size();
	         System.out.println("El promedio de ventas es " + ganancia);
	         JOptionPane.showMessageDialog(null, "El promedio de ventas es " + ganancia);
	         
		return ganancia;
		
		
		/*
		Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
            }
            */
        
		
	}
	
	
	
	public double calcularPerdidas(MateriaPrima materiasPrimas, ArrayList<Pedido> pedidos) {
		double monto = 0;
		for(int i=1; i<= materiasPrimas.length() ;i++) {
			 monto = materiasPrimas.getPrecio();
			 monto += materiasPrimas.getPrecio();	
		}
		
		double perdida = monto /  pedidos.size();
		System.out.println("El promedio de perdida es " + perdida);
        JOptionPane.showMessageDialog(null, "El promedio de ventas es " + perdida);
		

		return perdida;
		
	}
	
	
	
	/*
	public void visualizarStock() {
		System.out.print("Stock: " + getProductos());
	}
	*/
	
	
	
	//metodo de martina
	public void visualizarStockProductos(Producto pr){
		//boolean tieneStock=getNombre().contains(pr);//chequear
		boolean tieneStock = getNombre().contains(pr);
			if(tieneStock){
				System.out.println(pr.getNombre());
				System.out.println(pr.getStockDisponible());
				JOptionPane.showMessageDialog(null,"Producto: " + pr.getNombre() + " tiene en stock " + pr.getStockDisponible() );
			}else{
				JOptionPane.showMessageDialog(null,"Sin stock disponible");
				System.out.println("No hay stock");
			}
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
