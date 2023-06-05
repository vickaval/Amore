package Logica;

import javax.swing.JOptionPane;

public class Validaciones {
	
	//VERIFICAR EMPLEADO (almacenista y vendedor)
		public boolean verificar(String nombre,String apellido,String contraseña, int telefono) {
			int flag = 0 ;	
			String telefono2 = telefono+"";
			do {
			if (nombre.length()>=3 && nombre.length()<=15 ) {
				if (apellido.length()>=3 && apellido.length()<=15 ) {
					//verifica largo de la contraseña mayor o = a 8
					if (contraseña.length() >= 8) {
						
						if(telefono2.length() == 11) {
						//agregar cuit, crear verificarOperario → verificar turno (mañana, tarde o noche)
							// telefono2 = "";      
						    //int telefono3 = Integer.parseInt(telefono2);
						this.setNombre(nombre);
						this.setApellido(apellido);
						this.setContraseña(contraseña);
						
						
						return true;
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
		
		
		// Validación del DNI
        if (String.valueOf(dni).length() != 8) {
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 caracteres");
            dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de dni"));
            continue; // Vuelve al inicio del bucle
        }
		

}
