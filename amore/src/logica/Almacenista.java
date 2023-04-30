package logica;

public class Almacenista extends Usuario {

	

public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contraseña, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
	}

public Almacenista(){;

}


public boolean iniciarSesion(String usuario, String contraseña) {
    // Verificar si el usuario y la contraseña son válidos
    if (usuario.equals(getUsuario()) &&contraseña.equals(getContraseña())) {
        System.out.println("Inicio de sesión exitoso.");
        return true;
    } else {
        System.out.println("Inicio de sesión fallido. Por favor verifique su usuario, contraseña y permiso.");
        return false;
    }
}




	

}
