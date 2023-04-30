package interfaz;
import logica.Operario;

import javax.swing.JOptionPane;

import logica.Almacenista;
import logica.Deposito;

public class test {

	public static void main(String[] args) {
		//creo el deposito y un almacenista
		Deposito depo = new Deposito(1,"Depo");
		Almacenista al = new Almacenista("Juan", "P�rez", "123456789", "Almac�n de materiales", 5, 12345678, "jperez", "contrase�a123", 50000.0);

		//agrego almacenista al depo
		depo.agregarAlmacenistas(al);
		
		// Preguntamos al usuario si est� registrado o desea registrarse
	    Object[] options = {"Ya estoy registrado", "Registrarme"};
	    int seleccion = JOptionPane.showOptionDialog(null,
	            "Bienvenido al sistema de dep�sitos. �Est� registrado o desea registrarse?",
	            "Registro en el sistema",
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            options,
	            options[0]);
	    
	    if(seleccion == 0) {
	        // Si est� registrado, iniciamos sesi�n
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
