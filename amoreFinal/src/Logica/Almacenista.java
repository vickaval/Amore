package Logica;

import java.util.ArrayList;

public class Almacenista extends Usuario {

		private String nombreArea;
		private int aniosAntiguedad;
		private double sueldo;
		private int idDepo;
		/*
		ArrayList<Producto> productos;
		ArrayList<Almacenista> almacenistas;
		*/


		private ArrayList<Producto> paraEntregar;
		private ArrayList<Pedido> preparados;
		

		// clase hecha por Sebastian

		public Almacenista(String nombre, String apellido, String id, String usuario, int telefono, String contraseña,
				String nombreArea, int aniosAntiguedad, double sueldo, int idDepo)  {
			super(nombre, apellido, id, usuario, telefono, contraseña);
			this.nombreArea = nombreArea;
			this.aniosAntiguedad = aniosAntiguedad;
			this.sueldo = sueldo;
			this.idDepo = idDepo;

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
		
		
		public int getIdDepo() {
			return idDepo;
		}
		public void setIdDepo(int idDepo) {
			this.idDepo = idDepo;
		}
		
		
		public ArrayList<Producto> getParaEntregar() {
			return paraEntregar;
		}

		public void setParaEntregar(ArrayList<Producto> paraEntregar) {
			this.paraEntregar = paraEntregar;
		}
		



		//metodos
		public boolean agregarAlmacenista() {    
			String sql ="INSERT INTO `almacenista`(`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `contraseña`, `sueldo`,`usuario`, `idDepo`) VALUES (?,?,?,?,?,?,?,?, ?,?) ";
			
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
				stmt.setLong(10, this.getIdDepo());
				stmt.executeUpdate();
				conexion.close();
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
		
		
		//sebas
		public ArrayList<Producto> prepararPedido(Deposito depo,Pedido p) {
			//ArrayList<Producto> pedidoRearmado = new ArrayList<>();
			p.setProductos(paraEntregar = depo.buscarProductos(p.productos));
			//System.out.println(p.toString());
			//System.out.println(paraEntregar);
			this.preparados.add(p);
			EnviarPedido(); // ESTE LO PUSE ACA PARA COMPROBAR QUE LA LISTA DE PREPARADOS CONTIENE ELEMENTOS
			//System.out.println(p.getProductos());
			return paraEntregar;
			//return pedidoRearmado = depo.buscarProductos(p.productos);
			
		}

		public void EnviarPedido() {
			JOptionPane.showMessageDialog(null, this.preparados.toString());
			
			//p.setIdPedido(this.pedido.getCliente().getId());
				
		}


		
		
		/*
		public void estadisticas (){
			int cont = 0;
		
			for (int i=1; i<= this.paraEntregar.size(); i++){
				if(paraEntregar.equals(getParaEntregar())) {
					cont = cont + 1;
				}		
			}
			if(cont >= 100) {
				JOptionPane.showMessageDialog(null, "Producto vendido mas de 100 veces " + getParaEntregar() );
				System.out.println("Producto vendido mas de 100 veces " + getParaEntregar());
			} else {
				JOptionPane.showMessageDialog(null, "El producto fue vendido menos de 100 veces " + getParaEntregar() );
				System.out.println("El producto fue vendido menos de 100 veces " + getParaEntregar());
			}
						
		}		

		public void visualizarStockProductos(Producto p) {
			boolean tieneStock = productos.contains(p);// chequear
			if (tieneStock) {
				System.out.println(p.getNombre());
				System.out.println(p.getIdProducto());
				System.out.println(p.getStockDisponible());
			} else {
				System.out.println("No hay stock");
			}
		}
		
		*/


}
