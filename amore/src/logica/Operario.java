package logica;

import java.util.ArrayList;

public class Operario extends Usuario{


	
	public Operario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo, String turno, ArrayList<MateriaPrima> mps) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
		this.turno = turno;
		this.mps = mps;
	}
	
	public Operario() {
	}

	private String turno;
	private ArrayList<MateriaPrima> mps;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public ArrayList<MateriaPrima> getMps() {
		return mps;
	}

	public void setMps(ArrayList<MateriaPrima> mps) {
		this.mps = mps;
	}
	
	public void ingresarMateriaPrima(MateriaPrima mp) {
		this.mps.add(mp);
	}

	public void visualizarStock (MateriaPrima mp){
		boolean tieneStock=mps.contains(mp);//chequear
		if(tieneStock){
			System.out.println(mp.getNombre());
			System.out.println(mp.getStockDisponible());
		}else{
			System.out.println("No hay stock");
		}
	}

	

}
