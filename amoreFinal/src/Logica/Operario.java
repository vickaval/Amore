package Logica;

import Datos.Usuario;

public class Operario extends Usuario{

	private String turno;

	 
	public Operario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo, String turno) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, usuario);
		this.turno = turno;
	}
	
	


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	




}
