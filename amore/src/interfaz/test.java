package interfaz;
import logica.Operario;

import javax.swing.JOptionPane;

import logica.Almacenista;
import logica.Deposito;

public class test {

	public static void main(String[] args) {
		//creo el deposito y un almacenista
		Deposito depo = new Deposito(1,"Depo");
		Almacenista al = new Almacenista("Juan", "Pérez", "123456789", "Almacén de materiales", 5, 12345678, "jperez", "contraseña123", 50000.0);

		//agrego almacenista al depo
		depo.agregarAlmacenistas(al);
		
		// Preguntamos al usuario si está registrado o desea registrarse
	    Object[] options = {"Ya estoy registrado", "Registrarme"};
	    int seleccion = JOptionPane.showOptionDialog(null,
	            "Bienvenido al sistema de depósitos. ¿Está registrado o desea registrarse?",
	            "Registro en el sistema",
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            options,
	            options[0]);
	    
	    if(seleccion == 0) {
	        // Si está registrado, iniciamos sesión
	        depo.iniciarSesionAlmacenista();
	    } else if(seleccion == 1) {
	        // Si desea registrarse, lo agregamos a la lista de usuarios registrados
	        depo.registroAlmacenista();
	    }
		
		
		
		//llamo a metodo de inicio de sesion en el depo
		//depo.iniciarSesionAlmacenista();
	    
	   depo.mostrarAlmacenistas();
		
		

	}

}
