package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Datos.Conexion;

public class MateriaPrima  {
	
		private int idMp;
		private String nombre;
		private String procedencia;
		private double precio;
		private int stockDisponible;
		private int idDepo;
			
		MateriaPrima(){
			
		}

		public MateriaPrima(int idMp, String nombre, String procedencia, double precio, int stockDisponible, int idDepo) {
			super();
			this.idMp = idMp;
			this.nombre = nombre;
			this.procedencia = procedencia;
			this.precio = precio;
			this.stockDisponible = stockDisponible;
			this.idDepo = idDepo;
		}


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getProcedencia() {
			return procedencia;
		}

		public void setProcedencia(String procedencia) {
			this.procedencia = procedencia;
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

		public int getIdMp() {
			return idMp;
		}

		public void setIdMp(int idMp) {
			this.idMp = idMp;
		}

		public int getIdDepo() {
			return idDepo;
		}

		public void setIdDepo(int idDepo) {
			this.idDepo = idDepo;
		}

		
		
		
        Conexion con =  new Conexion();
		
		Connection conexion = con.conectar();
		
		PreparedStatement stmt;
		
		public boolean agregarMateriaPrima() {
			String sql ="INSERT INTO `materiaprima`(`idMp`, `nombre`, `procedencia`, `precio`, `stockDisponible`, `idDepo`) VALUES (?,?,?,?,?,?) ";
			
			try {
				stmt = conexion.prepareStatement(sql);
				stmt.setInt(1, this.getIdMp());
				stmt.setString(2, this.getNombre());
				stmt.setString(3, this.getProcedencia());
				stmt.setDouble(4, this.getPrecio());
				stmt.setInt(5, this.getStockDisponible());
				stmt.setInt(6, this.getIdDepo());
				stmt.executeUpdate();
				conexion.close();
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
		
		public void visualizarStockMateriaPrima (){
			try {     	
		           String sql ="SELECT * FROM `materiaprima`";
				   stmt = conexion.prepareStatement(sql);
				   ResultSet result = stmt.executeQuery();
		                
		            while (result.next()) {
		                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA materia prima:\n" + "\nID: " + result.getInt("idMp") + " \nNOMBRE: " + result.getString("nombre") + " \nPROCEDENCIA: " + result.getString("procedencia")+ " \nPRECIO: " + result.getDouble("precio") + " \nstockDisponible: " + result.getString("stockDisponible") + " \nidDepo: " + result.getString("idDepo") + "\n"); 
		                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA materia prima:\n");
		                System.out.println("\nID: " + result.getInt("idMp") + " \nNOMBRE: " + result.getString("nombre") + " \nPROCEDENCIA: " + result.getString("procedencia")+ " \nPRECIO: " + result.getDouble("precio") + " \nstockDisponible: " + result.getString("stockDisponible") + " \nidDepo: " + result.getString("idDepo") + "\n");
		  
		            } 
		            conexion.close();        
		        } catch (SQLException ex) {
		        	System.out.println("Error en la conexion");
		        }  
		}
		
		
		

		public void buscarMateriaPrima(int idMp){
				boolean buscar=mps.contains(mp);
				
				if(buscar){
					System.out.println(mp.toString());
				}
		}


	

}
