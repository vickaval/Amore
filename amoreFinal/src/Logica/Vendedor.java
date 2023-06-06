package Logica;

	import java.sql.Connection;
    import java.sql.PreparedStatement;
	
	import Datos.Usuario;
	import Datos.Conexion;

	public class Vendedor extends Usuario {


		private String nombreArea;
		private int aniosAntiguedad;
		private double sueldo;
		
		 
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








		Conexion con =  new Conexion();;
		
		Connection conexion = con.conectar();
		
		PreparedStatement stmt;


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
				conexion.close();
				return true;
				
			} catch (Exception e) {
				System.out.println("Hubo un error"+e.getMessage());
				return false;
			}
		}
	
		
	


		
	



}
