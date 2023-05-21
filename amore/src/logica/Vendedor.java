package logica;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Vendedor extends Usuario {
	
	  ArrayList<Pedido> pedidos;

	public Vendedor(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrase�a, double sueldo, ArrayList<Pedido> pedidos) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrase�a, sueldo);
		this.pedidos = pedidos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	  

}
