package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Logica.Almacenista;

public abstract class Usuario {
		
		private String nombre;
		private String apellido;
		private String id;
		private String usuario;
		private int telefono;
		private String contraseña;
		
		/*
		private String nombreArea;
		private int aniosAntiguedad;
		private double sueldo;
		
		
		private String turno;
		private int cuit;
		private String razonSocial;
		private String condicionIva;
		*/
		
		Conexion con =  new Conexion();;
		
		Connection conexion = con.conectar();
		
		PreparedStatement stmt;
		
		public Usuario(String nombre, String apellido, String id, String usuario, int telefono, String contraseña) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.id = id;
			this.usuario = usuario;
			this.telefono = telefono;
			this.contraseña = contraseña;
			/*
			this.nombreArea = nombreArea;
			this.aniosAntiguedad = aniosAntiguedad;
			this.sueldo = sueldo;
			this.turno = turno;
			this.cuit = cuit;
			this.razonSocial = razonSocial;
			this.condicionIva = condicionIva;
			*/
		}
		


		//getters y setters
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

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}

		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}



		@Override
		public String toString() {
			return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", usuario=" + usuario
					+ ", telefono=" + telefono + ", contraseña=" + contraseña + ", con=" + con + ", conexion="
					+ conexion + ", stmt=" + stmt + "]";
		}

		
		//metodos
		public boolean iniciarSesion(String contraseñaLogin, String nombreLogin) {
		    // Verificar si el usuario y la contrase�a son v�lidos
			    			   
				   if (nombreLogin.equals(getNombre()) && contraseñaLogin.equals(getContraseña())) {
				        //System.out.println("Inicio de sesi�n exitoso.");
				    	
				        return true;
				    } else {
				    	JOptionPane.showMessageDialog(null, "Amore Pastas\nBienvenido al ABM de Usuarios");
				       //System.out.println("Inicio de sesion fallo. \nPor favor verifique su contrasenia y permiso.");
				        return false;
				   
		        }
		}
		
	
			  
		   
		

	
		
	
		
		
		

}