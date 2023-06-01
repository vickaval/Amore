package Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import interfaz.metodosConexion;


public class Cliente implements metodosConexion {
	
	private int dni;
	private String razonSocial;
	private String condicionIVA;
	private int cuit;
	private String nombre;
	private String apellido;
	private int telefono;
	private String usuario;
	private String contrasena;
	
	Conexion con =  new Conexion();
	
	Connection conexion = con.conectar();
	
	PreparedStatement stmt;
	
	public Cliente(int dni, String razonSocial, String condicionIVA, int cuit, String nombre, String apellido,
			int telefono, String usuario, String contrasena) {
		super();
		this.dni = dni;
		this.razonSocial = razonSocial;
		this.condicionIVA = condicionIVA;
		this.cuit = cuit;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCondicionIVA() {
		return condicionIVA;
	}

	public void setCondicionIVA(String condicionIVA) {
		this.condicionIVA = condicionIVA;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
public boolean Editar(int indice) {
	
	String sql ="UPDATE `cliente` SET `dni`=?,`razonSocial`=?,`condicionIVA`=?, `cuit`=?,`nombre`=?, `apellido`=?, `telefono`=?, `usuario`=?, `contrasena`=? WHERE dni = ?";
	
	try {
		stmt = conexion.prepareStatement(sql);
		stmt = conexion.prepareStatement(sql);
		stmt.setInt(1, this.getDni());
		stmt.setString(2, this.getRazonSocial());
		stmt.setString(3, this.getCondicionIVA());
		stmt.setInt(4, this.getCuit());
		stmt.setString(5, this.getNombre());
		stmt.setString(6, this.getApellido());
		stmt.setInt(7, this.getTelefono());
		stmt.setString(8, this.getUsuario());
		stmt.setString(9, this.getContrasena());
		//stmt.setLong(4, indice);
		stmt.executeUpdate();
		return true;
		
	} catch (Exception e) {
		System.out.println("Hubo un error"+e.getMessage());
		return false;
	}
}

}