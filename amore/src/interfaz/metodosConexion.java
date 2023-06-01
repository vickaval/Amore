package interfaz;

import java.util.LinkedList;

import Datos.Cliente;

public interface metodosConexion {
	boolean Guardar();
	LinkedList<Cliente> Mostrar();
	boolean Eliminar(int indice);
	boolean Editar(int indice);

}

    

