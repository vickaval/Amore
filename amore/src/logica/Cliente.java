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
    public void realizarPedido(){
        //faltan clases para hacer correctamente el metodo como Pedido
        System.out.println("Bienvenido "+getUsuario+" seleccione lo que va a pedir y la cantidad: ");
        
    }
    
}
