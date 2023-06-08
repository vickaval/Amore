package interfaz;
import logica.Operario;
import logica.Pasta;
import logica.Pedido;
import logica.Produccion;
import logica.Producto;
import logica.Queso;
import logica.Salsa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import logica.Almacenista;
import logica.Deposito;
import logica.MateriaPrima;

public class test {

	public static void main(String[] args) {
		//creo el deposito y un almacenista
		Deposito depo = new Deposito(1,"Depo");
		
		//ESTO ES PARA METODO PREPARARPEDIDO()
		ArrayList<Producto> productosDelPedido = new ArrayList<>();
		Pasta spaghetti2 = new Pasta(7, "Spaghetti", "Pasta", 2.50, 10);
		Salsa salsaTomate2 = new Salsa(4, "Salsaa de Tomate", "Salsa", 1.50, 16);
		
		productosDelPedido.add(spaghetti2);
		productosDelPedido.add(salsaTomate2);
		
		
		Pedido p = new Pedido(1, 54.50, 159, null, productosDelPedido, null);
		Almacenista al = new Almacenista("Juan", "Perez", "123456789", "Almacenista", 5, 12345678, "jperez", "123", 50000.0);
		//al.setPedido(p);  //SETEO EL PEDIDO DE LA CLASE ALMACENISTA PARA QUE NO QUEDE EN NULL Y NO TENER QUE INICIALIZARLO CUANDO CREO 
		//AL ALMACENISTA 
		
		
		//agrego almacenista al depo
		depo.agregarAlmacenistas(al);
		
		Produccion prod = new Produccion(1, null);
		
		MateriaPrima materia1 = new MateriaPrima(1001, "Tomate", "Espaï¿½a", 1.50, 500);
		MateriaPrima materia2 = new MateriaPrima(1002, "Cebolla", "Mï¿½xico", 0.75, 300);
		MateriaPrima materia3 = new MateriaPrima(1003, "Ajo", "China", 2.20, 200);
		MateriaPrima materia4 = new MateriaPrima(1004, "Aceite de oliva", "Italia", 4.50, 100);
		MateriaPrima materia5 = new MateriaPrima(1005, "Sal", "Francia", 0.30, 1000);
		
		prod.agregarMateriasPrimas(materia1);
		prod.agregarMateriasPrimas(materia2);
		prod.agregarMateriasPrimas(materia3);
		prod.agregarMateriasPrimas(materia4);
		prod.agregarMateriasPrimas(materia5);
		
		
    	Queso quesoParmesano = new Queso(1, "Queso Parmesano", "Queso", 3.50, 10);
		Queso quesoCheddar = new Queso(2, "Queso Cheddar", "Queso", 4.50, 8);
		Queso quesoMozzarella = new Queso(3, "Queso Mozzarella", "Queso", 2.50, 12);
		Salsa salsaTomate = new Salsa(4, "Salsa de Tomate", "Salsa", 1.50, 15);
		Salsa salsaAlfredo = new Salsa(5, "Salsa Alfredo", "Salsa", 2.50, 12);
		Salsa salsaBoloniesa = new Salsa(6, "Salsa Boloï¿½esa", "Salsa", 3.50, 10);
		Pasta spaghetti = new Pasta(7, "Spaghetti", "Pasta", 2.50, 20);
		Pasta fettuccine = new Pasta(8, "Fettuccine", "Pasta", 3.00, 18);
		Pasta mostachol = new Pasta(9, "Mostachol", "Pasta", 2.00, 22);
		
		depo.agregarProducto(quesoParmesano);
		depo.agregarProducto(quesoCheddar);
		depo.agregarProducto(quesoMozzarella);
		depo.agregarProducto(salsaTomate);
		depo.agregarProducto(salsaAlfredo);
		depo.agregarProducto(salsaBoloniesa);
		depo.agregarProducto(spaghetti);
		depo.agregarProducto(fettuccine);
		depo.agregarProducto(mostachol);
		
		

		
		
		// Preguntamos al usuario si estï¿½ registrado o desea registrarse
	    Object[] options = {"Ya estoy registrado", "Registrarme"};
	    int seleccion = JOptionPane.showOptionDialog(null,
	            "Bienvenido al sistema de depositos. ¿Esta registrado o desea registrarse?",
	            "Registro en el sistema",
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            options,
	            options[0]);
	    
	    if(seleccion == 0) {
	        // Si estï¿½ registrado, iniciamos sesiï¿½n
	        
	    	depo.iniciarSesionAlmacenista();
	    	
	    	
	   
    	
	    	if (al.iniciarSesion(al.getUsuario(), al.getContrasenia())) { // Si el inicio de sesiï¿½n es exitoso
	    		int eleccion;
	    	 	do {
	    		Object[] opciones = {"Visualizar stock de materias primas", "Visualizar stock de productos", "Preparar pedidos", "Enviar pedidos", "Salir del programa"};
	    	    eleccion = JOptionPane.showOptionDialog(null, "¿Que accion desea realizar?", "Menu principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
	    	    switch (eleccion) {
	    	        case 0:	    	        		
	    	    		 ArrayList<MateriaPrima> materias = prod.getListaMPs();
	    	             String mensaje = "Listado de Materias Primas: \n\n";
	    	             for (MateriaPrima mp : materias) {
	    	             	mensaje += "Codigo: " + mp.getCodigoMp() + " - " + "Nombre: " + mp.getNombre() +  " - " + "Stock: " + mp.getStockDisponible() + "\n";
	    	             }
	    	             JOptionPane.showMessageDialog(null, mensaje);
	    	            break;
	    	        case 1:    	    		
	    	    		 ArrayList<Producto> productos = depo.getProductos();
	    	             String mensaje1 = "Listado de Productos: \n\n";
	    	             for (Producto produ : productos) {
	    	             	mensaje1 += "Codigo: " + produ.getIdProducto() + " - " + "Nombre: " + produ.getNombre() +  " - " 
	    	             + " tipo: " + produ.getTipo() + " - " + "Stock: " + produ.getCantidad() + "\n";
	    	             }
	    	             JOptionPane.showMessageDialog(null, mensaje1);
	    	            break;
	    	        case 2:
	    	        	al.prepararPedido(depo,p);
	    	        	JOptionPane.showMessageDialog(null, "Se preparo el pedido ");
	    	            break;
	    	        case 3:
	    	        	al.EnviarPedido();
	    	        	JOptionPane.showMessageDialog(null, "Se envia el pedido ");
	    	        	//System.out.println(p.getProductos());
	    	            break;
	    	        case 4:
	    	        	JOptionPane.showMessageDialog(null, "Fin de sesion ");
	    	            break;
	    	        default:
	    	            JOptionPane.showMessageDialog(null, "Opcion no valida.");
	    	            break;
	    	    }
	    	 	}while (eleccion !=4);
	    	}

	    
	        	        
	    } else if(seleccion == 1) {
	        // Si desea registrarse, lo agregamos a la lista de usuarios registrados
	        depo.registroAlmacenista();
	        depo.mostrarAlmacenistas();
	    }
		
	 
		
		
		//llamo a metodo de inicio de sesion en el depo
		//depo.iniciarSesionAlmacenista();
	    
	   //depo.mostrarAlmacenistas();
		
		

	}

}
