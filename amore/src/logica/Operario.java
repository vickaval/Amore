package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operario extends Usuario{

	private String turno;
	private ArrayList<MateriaPrima> mps=new ArrayList<>();
	private ArrayList<Producto> infoProductos=new ArrayList<>();

	 
	public Operario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasena, double sueldo, String turno) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
		this.turno = turno;
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
	
	public ArrayList<Producto> getInfoProductos() {
		return infoProductos;
	}

	public void setInfoProductos(ArrayList<Producto> infoProductos) {
		this.infoProductos = infoProductos;
	}

	public void ingresarMateriaPrima(MateriaPrima mp) {//cheuqeado
		boolean ingreso=mps.add(mp);
		if(ingreso) {
			System.out.println("materia prima ingresada correctamente");
		}
	}
	
	public void cargarProductos(Producto p){
		boolean ingreso=infoProductos.add(p);
		if(ingreso) {
			System.out.println("Producto ingresado correctamente");	
		}

	}
	
	
	
	public void visualizarStockMateriaPrima (MateriaPrima mp){//chequeado
		boolean tieneStock=mps.contains(mp);//chequear
		if(tieneStock){
			System.out.println("Nombre del producto: "+mp.getNombre());
			System.out.println("Cantidad de stock disponible: "+mp.getStockDisponible());
		}else{
			System.out.println("No hay stock");
		}
	}
	
	public void infoMateriaPrima() {//chequeado
		System.out.println(mps);
	}


	public void registrarOperario(Operario op){
	//chequeado
			String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
	        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
	        String id = JOptionPane.showInputDialog(null, "Ingrese su dni");
	        String nombreArea = JOptionPane.showInputDialog(null, "Ingrese el nombre del area en la que trabaja");
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años de antiguedad"));
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero de telefono"));
	        String usuario = JOptionPane.showInputDialog(null, "Ingrese un nombre de usuario");
	        String contrasena = JOptionPane.showInputDialog(null, "Ingrese una contrasena");
	        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su sueldo"));
			String turno = JOptionPane.showInputDialog(null, "Ingrese en que turno trabaja");
	        op.setNombre(nombre);
	        op.setApellido(apellido);
	        op.setId(id);
	        op.setNombreArea(nombreArea);
	        op.setAniosAntiguedad(aniosAntiguedad);
	        op.setTelefono(telefono);
	        op.setUsuario(usuario);
	        op.setContrasena(contrasena);
	        op.setSueldo(sueldo);
	        op.setTurno(turno);
	        JOptionPane.showMessageDialog(null, "Registro exitoso.");		
	}

	//rol de iniciar sesion el mismo que usuario, chequeado

	public void producirMercaderia(Operario op, MateriaPrima mp, int cantidad){//chequeado
		boolean producir=mps.contains(mp)&& mp.getStockDisponible()>=cantidad; 
		if(producir){
			System.out.println("produciendo con la materia prima "+mp.getNombre());	
		}else{
			System.out.println("Materia prima inexistente o stock insuficiente");	
		}

	}

	public void buscarMateriaPrima(MateriaPrima mp){//chequeado
			boolean buscar=mps.contains(mp);
			if(buscar){
				System.out.println(mp.toString());
			}
	}



}

