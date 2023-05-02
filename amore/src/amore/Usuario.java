package amore;

import javax.swing.JOptionPane;

public abstract class Usuario {
	
	private String nombre;
	private String apellido;
	private String id;
	private String nombreArea;
	private int aniosAntiguedad;
	private int telefono;
	private String usuario;
	private String contraseña;
	private double sueldo;
	
	

	public Usuario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.nombreArea = nombreArea;
		this.aniosAntiguedad = aniosAntiguedad;
		this.telefono = telefono;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.sueldo = sueldo;
	}



	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}



	public String getNombreArea() {
		return nombreArea;
	}
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}



	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}
	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}



	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

	//mostrar informacion
		@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nombreArea=" + nombreArea
				+ ", aniosAntiguedad=" + aniosAntiguedad + ", telefono=" + telefono + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + ", sueldo=" + sueldo + "]";
		}
		
		
		//metodos
	//selecciona rol
		public boolean iniciarSesion(Usuario u) {
			
			String []usuario= {"Cliente" , "Administrador","Operario","Almacenista", "Vendedor"};
	        int usu = JOptionPane.showOptionDialog(null, "Elija una opcion", "Mi pantalla de pregunta",JOptionPane.DEFAULT_OPTION,
	                JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);
	        
	        
	        String pass = (String)JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");
	        //numero maximo de caracteres de contraseña = 8
	        if(pass.length() <= 8) {
	        		    
			if(pass.equals(getContraseña())) {
			
			//mensaje de confirmacion por tipo de usuario
	            if (usu == 0) {
	            System.out.println("Bienvenido a Amore Pastas");
	            } else  if (usu == 1) {
	                System.out.println("Bienvenido Administrador");
	            } else  if (usu == 2) {
	                System.out.println("Bienvenido Operario");
	            } else  if (usu == 3) {
	            	System.out.println("Bienvenido Almacenista");
	            } else if (usu == 4) {
	            	System.out.println("Bienvenido Vendedor");
	            }
	        
	        //inicio sesion (usuario y contaseña correcta)
	    	return true;
			} else {
				
		
			}
			
	        }//no pudo iniciar sesion
			return false;
	        
	        
	        
	        
		}
	
	}
