<<<<<<< Updated upstream:amore/src/amore/Cliente.java
package Logica;

public class Cliente extends Usuario{
	private int cuit;
	private String razonSocial;
	private String condicionIva;
	
	Cliente(){
		
	}
	
	public Cliente (int cuit, String razonSocial, String condicionIva) {
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
	
	

}
=======
package logica;

public class Cliente extends Usuario {
    private int cuit;
    private int razonSocial;
    private String condicionIva;

    
}
>>>>>>> Stashed changes:amore/src/logica/Cliente.java