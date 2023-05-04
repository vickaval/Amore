package amore;

import java.util.ArrayList;

public class Cliente extends Usuario{

	    private int cuit;
	    private String razonSocial;
	    private String condicionIva;
	    ArrayList<Cliente> clientes;

	   // Cliente(){
	    //}

	  
		public Cliente(String nombre, String apellido, String id, String nombreArea, int aniosAntiguedad, int telefono, String usuario, String contraseña, double sueldo, int cuit, String razonSocial, String condicionIva) {
		super(nombre, apellido, id, nombreArea, aniosAntiguedad, telefono, usuario, contraseña, sueldo);
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.condicionIva = condicionIva;
		this.clientes = new ArrayList<>();
	}

		//getters y setters
	    public int getCuit() {
			return cuit;
		}


		public void setCuit(int cuit) {
			this.cuit = cuit;
		}

		public String getRazonSocial() {
			return razonSocial;
		}

		public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}

		public String getCondicionIva() {
			return condicionIva;
		}

		public void setCondicionIva(String condicionIva) {
			this.condicionIva = condicionIva;
		}
		
		


	    public ArrayList<Cliente> getClientes() {
			return clientes;
		}
		public void setClientes(ArrayList<Cliente> clientes) {
			this.clientes = clientes;
		}

		//metodos
	    public void realizarPedido(){
	        //faltan clases para hacer correctamente el metodo como Pedido
	        System.out.println("Bienvenido " + getNombre() +  " seleccione lo que va a pedir y la cantidad: ");
	        
	    }
	    
	}



