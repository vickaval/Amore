package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
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

<<<<<<< Updated upstream
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
		this.mps.add(mp);//chequear
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

	

=======
	public void registrarOperario(){
	//chequear
			String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
	        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
	        String id = JOptionPane.showInputDialog(null, "Ingrese su ID");
	        String nombreArea = JOptionPane.showInputDialog(null, "Ingrese el nombre del �rea en la que trabaja");
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de a�os de antig�edad"));
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su n�mero de tel�fono"));
	        String usuario = JOptionPane.showInputDialog(null, "Ingrese un nombre de usuario");
	        String contrasena = JOptionPane.showInputDialog(null, "Ingrese una contrase�a");
	        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su sueldo"));
	        Operario nuevoAlmacenista = new Operario(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
	        registrarOperario(nuevoAlmacenista);
	        JOptionPane.showMessageDialog(null, "Registro exitoso.");		
	}

	//rol de iniciar sesion el mismo que usuario
	public void cargarMateriaPrima(MateriaPrima mp){
		mps.add(mp);	
	}

	public void producirMercaderia(Operario op){
		JOptionPane.showMessageDialog(null, "Bienvenido "+op.getNombre());

	}

>>>>>>> Stashed changes
}
