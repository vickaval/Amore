package Logica;

public class Deposito {
	
	 private int idDepo;
	    private String nombre;

	    
	  
	    public Deposito(int idDepo, String nombre) {
	        super();
	        this.idDepo = idDepo;
	        this.nombre = nombre;
	        
	        
	    }

		public Deposito(){
			
		}

		public int getIdDepo() {
			return idDepo;
		}

		public void setIdDepo(int idDepo) {
			this.idDepo = idDepo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
		


		

}
