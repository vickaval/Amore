package interfaz;
import logica.Operario;
import logica.Produccion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import logica.Almacenista;
import logica.Deposito;
import logica.MateriaPrima;

public class test {

	public static void main(String[] args) {
		//creo el deposito y un almacenista
		Deposito depo = new Deposito(1,"Depo");
		Almacenista al = new Almacenista("Juan", "Perez", "123456789", "Almacén de materiales", 5, 12345678, "jperez", "123", 50000.0);

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
	    	
	    	if (al.iniciarSesion(al.getUsuario(), al.getContraseña())) { // Si el inicio de sesión es exitoso
	    	    Object[] opciones = {"Visualizar stock de materias primas", "Visualizar stock de productos", "Preparar pedidos", "Enviar pedidos"};
	    	    int eleccion = JOptionPane.showOptionDialog(null, "¿Qué acción desea realizar?", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
	    	    switch (eleccion) {
	    	        case 0:
	    	        	Produccion prod = new Produccion(1, null, null);
	    	    		
	    	    		MateriaPrima materia1 = new MateriaPrima(1001, "Tomate", "España", 1.50, 500);
	    	    		MateriaPrima materia2 = new MateriaPrima(1002, "Cebolla", "México", 0.75, 300);
	    	    		MateriaPrima materia3 = new MateriaPrima(1003, "Ajo", "China", 2.20, 200);
	    	    		MateriaPrima materia4 = new MateriaPrima(1004, "Aceite de oliva", "Italia", 4.50, 100);
	    	    		MateriaPrima materia5 = new MateriaPrima(1005, "Sal", "Francia", 0.30, 1000);
	    	    		
	    	    		prod.agregarMateriasPrimas(materia1);
	    	    		prod.agregarMateriasPrimas(materia2);
	    	    		prod.agregarMateriasPrimas(materia3);
	    	    		prod.agregarMateriasPrimas(materia4);
	    	    		prod.agregarMateriasPrimas(materia5);
	    	    		
	    	    		 ArrayList<MateriaPrima> materias = prod.getListaMPs();
	    	             String mensaje = "Listado de Materias Primas: \n\n";
	    	             for (MateriaPrima mp : materias) {
	    	             	mensaje += "Código: " + mp.getCodigoMp() + " - " + "Nombre: " + mp.getNombre() +  " - " + "Stock: " + mp.getStockDisponible() + "\n";
	    	             }
	    	             JOptionPane.showMessageDialog(null, mensaje);
	    	            break;
	    	        case 1:
	    	            //depo.visualizarStockDeProductos();
	    	            break;
	    	        case 2:
	    	            //depo.prepararPedidos();
	    	            break;
	    	        case 3:
	    	            //depo.enviarPedidos();
	    	            break;
	    	        default:
	    	            JOptionPane.showMessageDialog(null, "Opción no válida.");
	    	            break;
	    	    }
	    	}

	        
	        	        
	    } else if(seleccion == 1) {
	        // Si desea registrarse, lo agregamos a la lista de usuarios registrados
	        depo.registroAlmacenista();
	    }
		
		
		
		//llamo a metodo de inicio de sesion en el depo
		//depo.iniciarSesionAlmacenista();
	    
	   //depo.mostrarAlmacenistas();
		
		

	}

}
