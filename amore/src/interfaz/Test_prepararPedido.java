package interfaz;

import java.util.ArrayList;

import logica.Almacenista;
import logica.Deposito;
import logica.Pasta;
import logica.Pedido;
import logica.Vendedor;
import logica.Cliente;
import logica.Producto;
import logica.Queso;
import logica.Salsa;

public class Test_prepararPedido {

	public static void main(String[] args) {
		//creo el deposito y un almacenista
		Deposito depo = new Deposito(1,"Depo");
		Almacenista al = new Almacenista("Juan", "Perez", "123456789", "Almacenista", 5, 12345678, "jperez", "123", 50000.0);
		
		Queso quesoParmesano = new Queso(1, "Queso Parmesano", "Queso", 3.50, 10);
		Queso quesoCheddar = new Queso(2, "Queso Cheddar", "Queso", 4.50, 8);
		Queso quesoMozzarella = new Queso(3, "Queso Mozzarella", "Queso", 2.50, 12);
		Salsa salsaTomate = new Salsa(4, "Salsa de Tomate", "Salsa", 1.50, 15);
		Salsa salsaAlfredo = new Salsa(5, "Salsa Alfredo", "Salsa", 2.50, 12);
		Salsa salsaBoloñesa = new Salsa(6, "Salsa Boloñesa", "Salsa", 3.50, 10);
		Pasta spaghetti = new Pasta(7, "Spaghetti", "Pasta", 2.50, 20);
		Pasta fettuccine = new Pasta(8, "Fettuccine", "Pasta", 3.00, 18);
		Pasta mostachol = new Pasta(9, "Mostachol", "Pasta", 2.00, 22);
		
		ArrayList<Producto> productosDelPedido = new ArrayList<>();
		
 		depo.agregarProducto(quesoParmesano);
		depo.agregarProducto(quesoCheddar);
		depo.agregarProducto(quesoMozzarella);
		depo.agregarProducto(salsaTomate);
		depo.agregarProducto(salsaAlfredo);
		depo.agregarProducto(salsaBoloñesa);
		depo.agregarProducto(spaghetti);
		depo.agregarProducto(fettuccine);
		depo.agregarProducto(mostachol);
		
		
		Pasta spaghetti2 = new Pasta(7, "Spaghetti", "Pasta", 2.50, 10);
		Salsa salsaTomate2 = new Salsa(4, "Salsa de Tomate", "Salsa", 1.50, 16);
		
		productosDelPedido.add(spaghetti2);
		productosDelPedido.add(salsaTomate2);
		
		
		Pedido p = new Pedido(1, 54.50, 159, null, productosDelPedido, null);
		
		System.out.println("Se preparo el siguiente pedido: " + al.prepararPedido(depo,p));
		
		

	}

}
