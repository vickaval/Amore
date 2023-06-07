package Logica;

import javax.swing.JOptionPane;

import Datos.Administrador;
import Datos.Usuario;

public class Validaciones extends Usuario {
	
	
	
	public Validaciones(String nombre, String apellido, int id, String usuario, int telefono, String contraseña) {
		super(nombre, apellido, id, usuario, telefono, contraseña);
		
	}


	Administrador nuevoControlador = new Administrador();//solucionar esto
	
	
	//verificar para mostrar
    public boolean verificarMostrarCliente(){
		return nuevoControlador.verCliente();
			
		
	}
	

  //verificar para eliminar
    public boolean EliminarCliente(int id) {
		if(id > 0) {
			return nuevoControlador.eliminarCliente(id);
		}else {
			return false;
		}
	}
    
    
  //verificar para editar
    public boolean EditarCliente(int id) {
		if(id > 0) {
			//nuevoControlador = ;
			return nuevoControlador.editarCliente(id);
		}else {
			return false;
		}
	}
    

	//VERIFICAR EMPLEADO (almacenista y vendedor) EL METODO ENTERO VERIFICAR
		public boolean verificar(String usuario,String contraseña, int id) {
			int flag = 0 ;	
			String contra= String.valueOf(id);			
			do {
				if (usuario.length()>=5 && usuario.length()<=45 ) {
					if (contraseña.length()>=5 && contraseña.length()<=15 ) {
						if (contra.length()==8) {//no me deja seleccionar dni
							nuevoControlador.setUsuario(usuario);
							nuevoControlador.setContraseña(contraseña);
							nuevoControlador.setId(id);
							//return nuevoControlador.Guardar();
						}else{
							id =Integer.parseInt(JOptionPane.showInputDialog("Error el dni debe tener 8 caracteres \n Ingrese dni de alumno: ")); 
						}
					}else {
						contraseña = JOptionPane.showInputDialog("Error contraseña debe tener entre 5 y 45 caracteres   \n Ingrese contraseña: ");
					}
					
				}else {
					usuario = JOptionPane.showInputDialog("Error el usuario debe tener entre 5 y 45 caracteres \n Ingrese usuario: ");
				}
				return nuevoControlador.editarCliente(nuevoControlador.getId());
				}while(flag==0);
						
        }
        

		/*
		// Validación del DNI
        if (String.valueOf(dni).length() != 8) {
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 caracteres");
            int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de dni"));
            continue; // Vuelve al inicio del bucle
		*/

        
 
}
