package ejemplo;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;
	import javax.swing.JOptionPane;

	public class Vendedor extends Usuario {


		private String nombreArea;
		private int aniosAntiguedad;
		private double sueldo;
		
		  /*
		  ArrayList<Vendedor> vendedores;
		  ArrayList<Producto> productos;		  
		  ArrayList<Pedido> pedidos;
		  */
			public Vendedor(String nombre, String apellido, String id, String usuario, int telefono, String contraseña,
				String nombreArea, int aniosAntiguedad, double sueldo) {
			super(nombre, apellido, id, usuario, telefono, contraseña);
			this.nombreArea = nombreArea;
			this.aniosAntiguedad = aniosAntiguedad;
			this.sueldo = sueldo;
		}
		
		
		
	
		
		

		public String getNombreArea() {
			return nombreArea;
		}
	
		public void setNombreArea(String nombreArea) {
			this.nombreArea = nombreArea;
		}

		public int getAniosAntiguedad() {
			return aniosAntiguedad;
		}
		public void setAniosAntiguedad(int aniosAntiguedad) {
			this.aniosAntiguedad = aniosAntiguedad;
		}

		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}










		//metodos	
		public boolean agregarVendedor() {    
			String sql ="INSERT INTO `vendedor`(`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `contraseña`, `sueldo`,`usuario`) VALUES (?,?,?,?,?,?,?,?,?) ";
			
			try {
				stmt = conexion.prepareStatement(sql);
				stmt.setString(1, this.getId());
				stmt.setString(2, this.getNombre());
				stmt.setString(3, this.getApellido());
				stmt.setString(4, this.getNombreArea());
				stmt.setLong(5, this.getAniosAntiguedad());
				stmt.setLong(6, this.getTelefono());
				stmt.setString(7, this.getContraseña());					
				stmt.setDouble(8, this.getSueldo());	
				stmt.setString(9, this.getUsuario());
				stmt.executeUpdate();
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
	
		
		/*
		public double calcularGanacias() {
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
		*/


		
	



}
