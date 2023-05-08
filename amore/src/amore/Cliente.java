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
	
	
	//metodos de martina
	
	 public void seleccionarProducto(ArrayList<Producto> lista,Pedido p) {    
    	for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNombre());
			System.out.println(lista.get(i).getPrecio());
		}
    	
    	 Object[] productos = lista.toArray();
    	 int cantidad=0;
    	 double total=0;
    	 int opciones=JOptionPane.showOptionDialog(null, "Elija una opcion", "Mi pantalla de pregunta", JOptionPane.DEFAULT_OPTION,
 	            JOptionPane.QUESTION_MESSAGE, null, productos, productos[0]);
    	 if(opciones<productos.length) {
    		 cantidad=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad a llevar: "));
    		 if(cantidad<=lista.get(opciones).getStockDisponible()) {
    			 total=lista.get(opciones).getPrecio()*cantidad;
    			 JOptionPane.showMessageDialog(null, "El total de la compra es: "+total);
    			
    		 }else {
    			 JOptionPane.showMessageDialog(null, "Stock insuficiente");
    		 }
    	 }
    	
    	
    }
    
    public void metodosDePago(Pedido p) {
    	String []mediosDePago= {"Efectivo", "Transferencia"};
    	int pago = JOptionPane.showOptionDialog(null, "Elija un medio de pago", "Mi pantalla de pregunta", JOptionPane.DEFAULT_OPTION,
	            JOptionPane.QUESTION_MESSAGE, null, mediosDePago, mediosDePago[0]);
    	
    	if(pago==0) {
    		JOptionPane.showMessageDialog(null,"En 48 horas iremos a su domicilio a retirar el dinero");
    	}else {
    		JOptionPane.showMessageDialog(null,"Datos de la cuenta a depositar: ");
    		JOptionPane.showMessageDialog(null,"CBU: 002314456987");
    		JOptionPane.showMessageDialog(null,"Titular: Amore Pasta S.A");
    		JOptionPane.showMessageDialog(null,"Banco: Banco Patagonia");
    	}
    	
    	
    }
	    
	}


