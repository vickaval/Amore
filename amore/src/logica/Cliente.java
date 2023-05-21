package logica;

<<<<<<< HEAD
public class Cliente extends Usuario{

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
    }
    
=======
public class Cliente {
	private int id;
	private Pedido pedido;

	public Cliente() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", pedido=" + pedido + "]";
	}


	
	

>>>>>>> SebaLopez
}
