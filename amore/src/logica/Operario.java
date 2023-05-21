package logica;

import java.util.ArrayList;

public class Operario extends Usuario{


	
	public Operario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasenia, double sueldo, String turno, ArrayList<MateriaPrima> mps) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasenia, sueldo);
		this.turno = turno;
		this.mps = mps;
	}
	
	public Operario() {
	}

	private String turno;
	private ArrayList<MateriaPrima> mps;
	
	public void ingresarMateriaPrima(MateriaPrima mp) {
		this.mps.add(mp);
	}

}
