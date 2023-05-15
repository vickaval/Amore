package logica;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Almacenista extends Usuario {
	private ArrayList<Producto> paraEntregar;	
	private ArrayList<Pedido> preparados;	

	

public Almacenista(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono,
			String usuario, String contrasenia, double sueldo) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contrasenia, sueldo);
		this.paraEntregar = new ArrayList<>();
		this.preparados = new ArrayList<>();
	}

public Almacenista(){;

}


public ArrayList<Producto> getParaEntregar() {
	return paraEntregar;
}

public void setParaEntregar(ArrayList<Producto> paraEntregar) {
	this.paraEntregar = paraEntregar;
}

public boolean iniciarSesion(String usuario, String contrasenia) {
    // Verificar si el usuario y la contrase�a son v�lidos
    if (usuario.equals(getUsuario()) &&contrasenia.equals(getContrasenia())) {
        //System.out.println("Inicio de sesi�n exitoso.");
        return true;
    } else {
        System.out.println("Inicio de sesi�n fallido. Por favor verifique su usuario, contrase�a y permiso.");
        return false;
    }
}

public ArrayList<Producto> prepararPedido(Deposito depo,Pedido p) {
	ArrayList<Producto> pedidoRearmado = new ArrayList<>();
	p.setProductos(paraEntregar = depo.buscarProductos(p.productos));
	//System.out.println(p.toString());
	//System.out.println(paraEntregar);
	this.preparados.add(p);
	EnviarPedido(); // ESTE LO PUSE ACA PARA COMPROBAR QUE LA LISTA DE PREPARADOS CONTIENE ELEMENTOS
	//System.out.println(p.getProductos());
	return paraEntregar;
	//return pedidoRearmado = depo.buscarProductos(p.productos);
	
}

public void EnviarPedido() {
	JOptionPane.showMessageDialog(null, this.preparados.toString());
	
	//p.setIdPedido(this.pedido.getCliente().getId());
	
	
}




	

}
