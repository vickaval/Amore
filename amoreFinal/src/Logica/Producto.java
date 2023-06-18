package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



import Datos.Conexion;



	public class Producto  {
		private int idProducto;
		private String nombre;
		private String tipo;
		private double precio;
		private int stockDisponible;
		
		private int idDepo;
		private int idProduccion;
		private int idCategoria;
		private int cantidad;	
			
		
	

		ArrayList<Producto> productos;
		
		public Producto(int idProducto, String nombre, String tipo, double precio, int stockDisponible, int idDepo,  int idProduccion, int idCategoria, int cantidad) {
			super();
			this.idProducto = idProducto;
			this.nombre = nombre;
			this.tipo = tipo;
			this.precio = precio;
			this.stockDisponible = stockDisponible;
			this.productos =  new ArrayList<>();
			this.idDepo = idDepo;
			this.idProduccion = idProduccion;
			this.idCategoria = idCategoria;
			this.cantidad = cantidad;
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
		
		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}
		
		

		public int getIdDepo() {
			return idDepo;
		}

		public void setIdDepo(int idDepo) {
			this.idDepo = idDepo;
		}

		public int getIdProduccion() {
			return idProduccion;
		}

		public void setIdProduccion(int idProduccion) {
			this.idProduccion = idProduccion;
		}

		public int getIdCategoria() {
			return idCategoria;
		}

		public void setIdCategoria(int idCategoria) {
			this.idCategoria = idCategoria;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}


		Conexion con =  new Conexion();
		
		Connection conexion = con.conectar();
		
		PreparedStatement stmt;
		

		public boolean agregarProducto() {
			String sql ="INSERT INTO `producto`( `nombre`, `precio`, `cantidad`, `idDepo`, `idProduccion`, `idCategoria`) VALUES (?,?,?,?,?,?) ";
			
			try {
				stmt = conexion.prepareStatement(sql);
				
				stmt.setString(1, this.getNombre());
				stmt.setDouble(2, this.getPrecio());
				stmt.setDouble(3, this.getCantidad());
				stmt.setInt(4, this.getIdDepo());
				stmt.setInt(5, this.getIdProduccion());
				stmt.setInt(6, this.getIdCategoria());
				stmt.executeUpdate();
				//conexion.close();
				JOptionPane.showMessageDialog(null, this.getNombre()+" agregado correctamente");
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
		
		

		public void visualizarProductos (){
			try {     	
		           String sql ="SELECT * FROM `producto`";
				   stmt = conexion.prepareStatement(sql);
				   ResultSet result = stmt.executeQuery();
		                
		            while (result.next()) {
		                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA producto:\n" + "\nID: " + result.getInt("idProducto") + " \nNOMBRE: " + result.getString("nombre") + " \nPRECIO: " + result.getString("precio")+ " \nstockDisponible: " + result.getString("cantidad") + " \nidDepo: " + result.getString("idDepo") + " \nidProduccion: " + result.getString("idProduccion") +"\n"); 
		                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA producto:\n");
		                System.out.println("\nID: " + result.getInt("idProducto") + " \nNOMBRE: " + result.getString("nombre") + " \nPRECIO: " + result.getDouble("precio")+  " \nstockDisponible: " + result.getString("cantidad") + " \nidDepo: " + result.getString("idDepo") + " \nidProduccion: " + result.getString("idProduccion")  + "\n"); 
		  
		            } 
		            conexion.close();        
		        } catch (SQLException ex) {
		        	System.out.println("Error en la conexion");
		        }  
		}
		
		public boolean eliminarProducto() {
		     int indice=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del producto a eliminar"));
		     String sql="DELETE FROM `producto` WHERE idProducto= ?";
		     try {
		      stmt = conexion.prepareStatement(sql);
		      stmt.setInt(1, indice);
		      stmt.executeUpdate();
		      stmt.close();
		      JOptionPane.showMessageDialog(null, this.getNombre()+" eliminado correctamente");
		      return true;
		     }catch (Exception e) {
		      System.out.println("Hubo un error"+e.getMessage());
		   return false;
		  }
		    }
		
		public void visualizarStockProducto (){
			try {     	
		           String sql ="SELECT * FROM `producto`";
				   stmt = conexion.prepareStatement(sql);
				   ResultSet result = stmt.executeQuery();
		                
		            while (result.next()) {
		                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA productos:\n" + "\nID: " + result.getInt("idProducto") + " \nNOMBRE: " + result.getString("nombre") + " \nid de la categoria: " + result.getString("idCategoria")+ " \nPRECIO: " + result.getDouble("precio") + " \nstockDisponible: " + result.getString("cantidad") + " \nidDepo: " + result.getString("idDepo") + "\n"); 
		                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA materia prima:\n");
		                System.out.println("\nID: " + result.getInt("idProducto") + " \nNOMBRE: " + result.getString("nombre") + " \nid de la categoria: " + result.getString("idCategoria")+ " \nPRECIO: " + result.getDouble("precio") + " \nstockDisponible: " + result.getString("cantidad") + " \nidDepo: " + result.getString("idDepo") + "\n");
		  
		            } 
		            conexion.close();   
		            //JOptionPane.showMessageDialog(null, "no hay nada");
		        } catch (SQLException ex) {
		        	System.out.println("Error en la conexion");
		        }  
		}

		@Override
		public String toString() {
			return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio="
					+ precio + ", idDepo=" + idDepo + ", idProduccion=" + idProduccion + ", categoria=" + idCategoria + "]";
		}
		
		
		

	

}
