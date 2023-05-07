package logica;

public class Cliente extends Usuario{
//hecho por mi
    private int cuit;
    private String razonSocial;
    private String condicionIva;

    Cliente(){

    }

    public Cliente(String nombre, String apellido, int telefono,
    String usuario, String contrasena, int cuit, String razonSocial, String condicionIva){
        super(nombre, apellido, telefono, usuario, contrasena);
        this.cuit=cuit;
        this.razonSocial=razonSocial;
        this.condicionIva=condicionIva;
    }

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


    //metodo inicar sesion esta en  usuario, lo modifique para que aparezca cliente

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
