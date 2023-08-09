package Logica;

import Datos.Usuario;
import Datos.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Operario extends Usuario{

	private String turno;
	private String nombreArea;
	private int aniosAntiguedad;
	private double sueldo;
	
	
	public Operario(String nombre, String apellido, String id, String usuario, int telefono, String contraseña,
			String turno, String nombreArea, int aniosAntiguedad, double sueldo) {
		super(nombre, apellido, id, usuario, telefono, contraseña);
		this.turno = turno;
		this.nombreArea = nombreArea;
		this.aniosAntiguedad = aniosAntiguedad;
		this.sueldo = sueldo;
	}


	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
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
	 public boolean iniciarSesion() {
	    	boolean validarContrasena = false;
	        do {
	         String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
	         String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");

	            String sql = "SELECT * FROM `operario` WHERE nombre = ? AND contraseña = ?";
	            
	            PreparedStatement stmt = null;
	            ResultSet resultSet = null;

	            try {
	                stmt = conexion.prepareStatement(sql);
	                stmt.setString(1, nombre);
	                stmt.setString(2, contra);
	                resultSet = stmt.executeQuery();
	                if (resultSet.next()) {
	                    JOptionPane.showMessageDialog(null, "Se inició correctamente la sesión");
	                    validarContrasena = true;
	                    resultSet.close();
	                    stmt.close();
	                } else {
	                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
	                }
	            } catch (Exception e) {
	                JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
	           }           
	        } while (!validarContrasena);

	        return validarContrasena;
		      
			
	    }
	 
	 
    public boolean agregarOperario() {         	
		String sql ="INSERT INTO `operario`(`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `contraseña`, `sueldo`,`turno`, `usuario`) VALUES (?,?,?,?,?,?,?,?,?, ?) ";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setString(1, this.getId());
			stmt.setString(2, this.getNombre());
			stmt.setString(3, this.getApellido());
			stmt.setString(4, this.getNombreArea());
			stmt.setInt(5, this.getAniosAntiguedad());
			stmt.setInt(6, this.getTelefono());
			stmt.setString(7, this.getContraseña());					
			stmt.setDouble(8, this.getSueldo());
			stmt.setString(9, this.getTurno());		
			stmt.setString(10, this.getUsuario());	
			stmt.executeUpdate();
			conexion.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("Hubo un error"+e.getMessage());
			return false;
		}
		
	}
    

	//EDITAR OPERARIO
    public boolean editarOperario(String id) {   	
    	String sql ="UPDATE `operario` SET `nombre`=?,`apellido`=?,`usuario`=?, `telefono`=?,`contraseña`=?,`turno`=?, `nombreArea`=?,`aniosAntiguedad`=?,`sueldo`=?"
    			+ "WHERE id = ?";	
    	try {
    		stmt = conexion.prepareStatement(sql);
    		stmt.setString(1, this.getId());
			stmt.setString(2, this.getNombre());
			stmt.setString(3, this.getApellido());
			stmt.setString(4, this.getUsuario());
			stmt.setLong(5, this.getTelefono());
			stmt.setString(6, this.getContraseña());				
			stmt.setString(7, this.getTurno());
			stmt.setString(8, this.getNombreArea());
			stmt.setInt(9, this.getAniosAntiguedad());
			stmt.setDouble(10, this.getSueldo());
			stmt.executeUpdate();
			conexion.close();
    		return true;
    		
    	} catch (Exception e) {
    		System.out.println("Hubo un error"+e.getMessage());
    		return false;
    	}
    }
    
    
    public boolean eliminarMateriaPrima() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la materia prima a eliminar"));
        String sql = "DELETE FROM `materiaprima` WHERE idMp = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conexion.prepareStatement(sql);
            stmt.setInt(1, indice);
            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, this.getNombre()+" eliminada correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Hubo un error: " + e.getMessage());
            return false;
        }
    }
	




}
