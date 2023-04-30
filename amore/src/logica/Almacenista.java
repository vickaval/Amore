package logica;

public class Almacenista extends Usuario {

	

public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrase�a, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrase�a, sueldo);
	}

public Almacenista(){;

}


public boolean iniciarSesion(String usuario, String contrase�a) {
    // Verificar si el usuario y la contrase�a son v�lidos
    if (usuario.equals(getUsuario()) &&contrase�a.equals(getContrase�a())) {
        System.out.println("Inicio de sesi�n exitoso.");
        return true;
    } else {
        System.out.println("Inicio de sesi�n fallido. Por favor verifique su usuario, contrase�a y permiso.");
        return false;
    }
}




	

}
