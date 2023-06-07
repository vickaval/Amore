package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

import Datos.Conexion;

	public class Proveedor {
	
		Conexion con =  new Conexion();;
		Connection conexion = con.conectar();
		PreparedStatement stmt;
		
		
		private String nombre;
		private int cuit;
		private String materialesQueProvee;
		private double montoComprado;
		private double deuda;
		
		//ArrayList<Proveedor> provedoresDeben;
		
		public Proveedor(String nombre, String materialesQueProvee, int cuit, double montoComprado, double deuda) {
			this.nombre = nombre;
	    	this.cuit = cuit;
			this.materialesQueProvee = materialesQueProvee;
			this.montoComprado = montoComprado;
			this.deuda = deuda;
		
		}
		
		
		
		//getters y setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCuit() {
			return cuit;
		}
		public void setCuit(int cuit) {
			this.cuit = cuit;
		}

		public String getMaterialesQueProvee() {
			return materialesQueProvee;
		}
		public void setMaterialesQueProvee(String materialesQueProvee) {
			this.materialesQueProvee = materialesQueProvee;
		}

		public double getMontoComprado() {
			return montoComprado;
		}
		public void setMontoComprado(double montoComprado) {
			this.montoComprado = montoComprado;
		}
		

		public double getDeuda() {
			return deuda;
		}
		public void setDeuda(double deuda) {
			this.deuda = deuda;
		}

	



		
		//metodos		
		public boolean agregarProveedor() {			
			String sql ="INSERT INTO `proveedor`(`nombre`, `materialesQueProvee`, `cuit`, `montoComprado`,`deuda`) VALUES (?,?,?,?,?) ";
			
			try {
				stmt = conexion.prepareStatement(sql);
				
				stmt.setString(1, this.getNombre());
				stmt.setString(2, this.getMaterialesQueProvee());
				stmt.setInt(3, this.getCuit());
				stmt.setDouble(4, this.getMontoComprado());
				stmt.setDouble(5, this.getDeuda());		
				stmt.executeUpdate();
				conexion.close();
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
		
		
		
		
		/*
		public void deudaConProveedores(Proveedor p) {
			JOptionPane.showMessageDialog(null,"Deuda de " + getDeuda());
			
			
		}
		*/
		
	
		
		
		/*
		public void proveedoresQueDeben(Proveedor p){
			if (getDeuda() != 0) {
				provedoresDeben.add(p);
				JOptionPane.showMessageDialog(null,"Exite una deuda de " + getDeuda() + " de " + p);
			}
			
		}
		*/
		
		
		

		//informacion completa
		public void informacionProveedores() {
			JOptionPane.showMessageDialog(null,"PROVEEDOR \nNombre: " +  getNombre() + "\nCuit: " + getCuit() + "\nProvee: " + getMaterialesQueProvee() + 
					"\nDeuda: " + getDeuda());
		}
		
		
		
		@Override
		public String toString() {
			return "Proveedor [nombre=" + nombre + ", cuit: " + cuit + ", materialesQueProvee=" + materialesQueProvee
					+ ", montoComprado=" + montoComprado + "]";
		}
		
		


}
