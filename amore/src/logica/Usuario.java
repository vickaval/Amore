package logica;

import javax.swing.JOptionPane;

public abstract class Usuario {

		private String nombre;
		private String apellido;
		private String id;
		private String nombreArea;
		private int aniosAntiguedad;
		private int telefono;
		private String usuario;
		private String contrasenia;
		private double sueldo;



		public Usuario(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contrasenia, double sueldo) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.id = id;
			this.nombreArea = nombreArea;
			this.aniosAntiguedad = aniosAntiguedad;
			this.telefono = telefono;
			this.usuario = usuario;
			this.contrasenia = contrasenia;
			this.sueldo = sueldo;
		}



		public Usuario() {
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



		public String getContrasenia() {
			return contrasenia;
		}
		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}



		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		
		public boolean iniciarSesion(Usuario u) {
		    String[] usuario = {"Cliente", "Administrador", "Operario", "Almacenista", "Vendedor"};
		    int usu = JOptionPane.showOptionDialog(null, "Elija una opcion", "Mi pantalla de pregunta", JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE, null, usuario, usuario[0]);

		    String pass;
		    boolean claveCorrecta = false;
		    do {
		        pass = JOptionPane.showInputDialog(null, "Ingrese su contrase�a: ");
		        if (pass.equals(getContrasenia())) {
		            claveCorrecta = true;
		        } else {
		            JOptionPane.showMessageDialog(null, "La clave ingresada es incorrecta. Por favor, int�ntelo de nuevo.");
		        }
		    } while (!claveCorrecta);

		    // mensaje de confirmaci�n por tipo de usuario
		    if (usu == 0) {
		       
		    } else if (usu == 1) {
		        JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
		    } else if (usu == 2) {
		        JOptionPane.showMessageDialog(null, "Bienvenido Operario");
		    } else if (usu == 3) {
		        JOptionPane.showMessageDialog(null, "Bienvenido Almacenista");
		    } else if (usu == 4) {
		        JOptionPane.showMessageDialog(null, "Bienvenido Vendedor");
		    }

		    // inicio sesi�n (usuario y contrase�a correcta)
		    return true;
		}





		//mostrar informacion
			@Override
		public String toString() {
			return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nombreArea=" + nombreArea
					+ ", aniosAntiguedad=" + aniosAntiguedad + ", telefono=" + telefono + ", usuario=" + usuario
					+ ", contrase�a=" + contrasenia + ", sueldo=" + sueldo + "]";
			}

		}
	 
