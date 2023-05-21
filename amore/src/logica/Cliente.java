package logica;

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


	
	

}
