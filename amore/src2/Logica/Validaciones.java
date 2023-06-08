package Logica;

import javax.swing.JOptionPane;

import Datos.Administrador;
import Datos.Usuario;

public class Validaciones {
	
	
	Administrador nuevoControlador = new Administrador("", "", "", "", 0, "");
	
	
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

    

	//VERIFICAR EMPLEADO (almacenista y vendedor)
		public boolean verificar(String nombre,String apellido,String contraseña, int telefono, int cuit) {
			int flag = 0 ;				
			do {
			if (nombre.length()>=3 && nombre.length()<=15 ) {
				if (apellido.length()>=3 && apellido.length()<=15 ) {
					
					if (contraseña.length() >= 8) {
						
						if(String.valueOf(telefono).length() == 11) {
							
						
							if(String.valueOf(cuit).length() ==  5) {
						//agregar cuit, crear verificarOperario → verificar turno (mañana, tarde o noche)
							
						this.setNombre(nombre);
						this.setApellido(apellido);
						this.setContraseña(contraseña);
						
						
						return true;
							}else {
								cuit = Integer.parseInt(JOptionPane.showInputDialog("Error el cuit debe tener 5 caracteres \n Ingrese cuit: "));
								this.setCuit(cuit);
							}
						} else {
							telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 11 caracteres \n Ingrese telefono: "));
							this.setTelefono(telefono); 							
						}						
					}else{
						contraseña = JOptionPane.showInputDialog("Error la contraseña debe tener 8 caracteres \n Ingrese contraseña: "); 
					}
				}else {
					apellido = JOptionPane.showInputDialog("Error apellido  debe tener entre 3 y 15 letras   \n Ingrese apellido: ");
				}
				
			}else {
				nombre = JOptionPane.showInputDialog("Error el nombre debe tener entre 3 y 15 letras \n Ingrese nombre: ");
			}
			}while(flag==0);
			return true;
						
        }


private void setTelefono(int telefono) {
			// TODO Auto-generated method stub
			
		}


private void setCuit(int cuit) {
			// TODO Auto-generated method stub
			
		}


private void setContraseña(String contraseña) {
			// TODO Auto-generated method stub
			
		}


private void setApellido(String apellido) {
			// TODO Auto-generated method stub
			
		}


private void setNombre(String nombre) {
	// TODO Auto-generated method stub
	
}
        

        
 
}
