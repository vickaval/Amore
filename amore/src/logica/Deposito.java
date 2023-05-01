package logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Deposito {
    private int idDepo;
    private String nombre;
    ArrayList<Categoria> categorias;
    ArrayList<Almacenista> almacenistas;
        
    public Deposito(int idDepo, String nombre) {
        super();
        this.idDepo = idDepo;
        this.nombre = nombre;
        this.categorias = new ArrayList<>();
        this.almacenistas = new ArrayList<>();
    }

	public Deposito(){
		
	}

	public int getIdDepo() {
		return idDepo;
	}

	public void setIdDepo(int idDepo) {
		this.idDepo = idDepo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCategorias(Categoria c) {
		this.categorias.add(c);
	}
	
	public void agregarAlmacenistas(Almacenista a) {
		this.almacenistas.add(a);
	}
	
	public ArrayList<Almacenista> getAlmacenistas() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void registroAlmacenista() {
			JOptionPane.showMessageDialog(null, "Vamos a dar de alta un nuevo almacenista");
	    
	        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
	        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido");
	        String id = JOptionPane.showInputDialog(null, "Ingrese su ID");
	        String nombreArea = JOptionPane.showInputDialog(null, "Ingrese el nombre del �rea en la que trabaja");
	        int aniosAntiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de a�os de antig�edad"));
	        int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su n�mero de tel�fono"));
	        String usuario = JOptionPane.showInputDialog(null, "Ingrese un nombre de usuario");
	        String contrasena = JOptionPane.showInputDialog(null, "Ingrese una contrase�a");
	        double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su sueldo"));
	        Almacenista nuevoAlmacenista = new Almacenista(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasena, sueldo);
	        agregarAlmacenistas(nuevoAlmacenista);
	        JOptionPane.showMessageDialog(null, "Registro exitoso.");
	    } 

	
	
	
	public void iniciarSesionAlmacenista() {
	    int intentos = 3;
	    while(intentos > 0) {
	        String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario");
	        if(usuario == null) {
	            System.exit(0); // Si el usuario presiona cancelar, salimos del programa
	        }
	        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contrase�a");
	        boolean inicioSesion = false;
	        for(Almacenista almacenista : almacenistas) {
	            if(almacenista.iniciarSesion(usuario, contrasena)) {
	                JOptionPane.showMessageDialog(null, "Inicio de sesi�n exitoso.");
	                inicioSesion = true;
	                break;
	            }
	        }
	        if(inicioSesion) {
	            break; // Si inici� sesi�n, salimos del while
	        }
	        intentos--;
	        if(intentos == 0) {
	            JOptionPane.showMessageDialog(null, "Ha excedido el n�mero m�ximo de intentos. Saliendo del programa.");
	            System.exit(0);
	        }
	        JOptionPane.showMessageDialog(null, "Inicio de sesi�n fallido. Por favor verifique su usuario, contrase�a y permiso. Intentos restantes: " + intentos);
	    }
	}

	public void mostrarAlmacenistas() {
	    StringBuilder sb = new StringBuilder();
	    for (Almacenista almacenista : almacenistas) {
	        sb.append(almacenista.getUsuario()).append(" - ").append(almacenista.getNombreArea()).append("\n");
	    }
	    JOptionPane.showMessageDialog(null, sb.toString(), "Almacenistas registrados: ", JOptionPane.PLAIN_MESSAGE);
	}




	
	

}
