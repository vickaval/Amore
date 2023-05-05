package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operario extends Usuario{

	private String turno;
	private ArrayList<MateriaPrima> mps;
	private ArrayList<Producto> infoProductos;

	//hacer metodo producir 
	public Operario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo, String turno, ArrayList<MateriaPrima> mps) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
		this.turno = turno;
		this.mps = mps;
	}
	
	public Operario() {
	}


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
		boolean ingreso=mps.add(mp);
		if(ingreso){
			System.out.println("Materia prima agregada");
		}else{
			System.out.println("Materia prima repetida");
		}
	}

	public void visualizarStockMateriaPrima (MateriaPrima mp){
		boolean tieneStock=mps.contains(mp);//chequear
		if(tieneStock){
			System.out.println(mp.getNombre());
			System.out.println(mp.getStockDisponible());
		}else{
			System.out.println("No hay stock");
		}
	}


	public void registrarOperario(){
	//chequear
			String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
	        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
	        String id = JOptionPane.showInputDialog(null, "Ingrese su dni");
	        String nombreArea = JOptionPane.showInputDialog(null, "Ingrese el nombre del area en la que trabaja");
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antiguedad"));
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de telefono"));
	        String usuario = JOptionPane.showInputDialog(null, "Ingrese un nombre de usuario");
	        String contrasena = JOptionPane.showInputDialog(null, "Ingrese una contrasela");
	        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su sueldo"));
			String turno = JOptionPane.showInputDialog(null, "Ingrese en que turno trabaja");
	        Operario op = new Operario(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo, turno);
	        registrarOperario(op);

			//String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			//String usuario, String contrasena, double sueldo, String turno,
	        JOptionPane.showMessageDialog(null, "Registro exitoso.");		
	}

	//rol de iniciar sesion el mismo que usuario, chequear

	public void producirMercaderia(Operario op, MateriaPrima mp){
		JOptionPane.showMessageDialog(null, "Bienvenido "+op.getNombre());
		MateriaPrima mp= JOptionPane.showInputDialog(null, "Ingrese la materia prima que va a producir: ");
		int cantidad=JOptionPane.showInputDialog(null, "Ingrese la cantidad de materia prima que va a utilizar: ");

		if(){

		}

	}

	public void buscarMateriaPrima(MateriaPrima mp){
			boolean buscar=mps.contains(mp);
			if(buscar){
				System.out.println(mp.getNombre());
				System.out.println(mp.getStockDisponible());
			}
	}

	public void cargarProductos(Producto p){
		infoProductos.add(p);

	}


}
