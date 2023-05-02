package interfaz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import logica.Deposito;
import logica.Pasta;
import logica.Producto;
import logica.Queso;
import logica.Salsa;

public class TestVisualizaStockProductos {

	public static void main(String[] args) {
		
		Deposito depo = new Deposito(1,"Depo");
		Queso quesoParmesano = new Queso(1, "Queso Parmesano", "Queso", 3.50, 10);
		Queso quesoCheddar = new Queso(2, "Queso Cheddar", "Queso", 4.50, 8);
		Queso quesoMozzarella = new Queso(3, "Queso Mozzarella", "Queso", 2.50, 12);
		Salsa salsaTomate = new Salsa(4, "Salsa de Tomate", "Salsa", 1.50, 15);
		Salsa salsaAlfredo = new Salsa(5, "Salsa Alfredo", "Salsa", 2.50, 12);
		Salsa salsaBoloñesa = new Salsa(6, "Salsa Boloñesa", "Salsa", 3.50, 10);
		Pasta spaghetti = new Pasta(7, "Spaghetti", "Pasta", 2.50, 20);
		Pasta fettuccine = new Pasta(8, "Fettuccine", "Pasta", 3.00, 18);
		Pasta penne = new Pasta(9, "Penne", "Pasta", 2.00, 22);
		
		depo.agregarProducto(quesoParmesano);
		depo.agregarProducto(quesoCheddar);
		depo.agregarProducto(quesoMozzarella);
		depo.agregarProducto(salsaTomate);
		depo.agregarProducto(salsaAlfredo);
		depo.agregarProducto(salsaBoloñesa);
		depo.agregarProducto(spaghetti);
		depo.agregarProducto(fettuccine);
		depo.agregarProducto(penne);

		//System.out.println(depo.getProductos());
		
		// Preguntar al usuario si quiere ver o agregar productos
        int opcion = JOptionPane.showOptionDialog(null, "Inicio",
                "Deposito / Stock de productos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Ver Productos" }, null);
        //new Object[] { "Ver productos", agregar productos" }, null);

        if (opcion == JOptionPane.YES_OPTION) {
            // Ver productos
            ArrayList<Producto> productos = depo.getProductos();
            String mensaje = "Listado de Productos: \n\n";
            for (Producto prod : productos) {
            	mensaje += "Código: " + prod.getIdProducto() + " - " + "Nombre: " + prod.getNombre() +  " - " 
            + " tipo: " + prod.getTipo() + " - " + "Stock: " + prod.getStockDisponible() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }

	}

}
