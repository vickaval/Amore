package Logica;

import Datos.Usuario;
import Datos.Conexion;
import Logica.MateriaPrima;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Operario extends Usuario{

	private String turno;
	private String nombreArea;
	private int aniosAntiguedad;
	private double sueldo;
	
	
	Conexion con =  new Conexion();
		
	Connection conexion = con.conectar();
	
	PreparedStatement stmt;
	
	public Operario(String nombre, String apellido, int id, String usuario, int telefono, String contraseña,
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

	
	//metodos
    public boolean agregarOperario() {         	
		String sql ="INSERT INTO `operario`(`id`, `nombre`, `apellido`, `nombreArea`, `aniosAntiguedad`, `telefono`, `usuario`,`contraseña`, `sueldo`,`turno`) VALUES (?,?,?,?,?,?,?,?,?,?) ";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setInt(1, this.getId());
			stmt.setString(2, this.getNombre());
			stmt.setString(3, this.getApellido());
			stmt.setString(4, this.getNombreArea());
			stmt.setInt(5, this.getAniosAntiguedad());
			stmt.setInt(6, this.getTelefono());
			stmt.setString(7, this.getContraseña());					
			stmt.setDouble(8, this.getSueldo());// es double
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

	public void ingresarMateriaPrima(MateriaPrima mp) {//error en metodo

		if(mp.getStockDisponible()>=100){
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

		}else{
			JOptionPane.showMessageDialog(null, "stock insuficiente, debe ser mayor a 100");
		}
		
	}
	




}
