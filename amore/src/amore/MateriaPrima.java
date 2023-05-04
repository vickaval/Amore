package amore;

public class MateriaPrima {
		
		private int codigoMp;
		private String nombre;
		private String procedencia;
		private double precio;
		private int stockDisponible;
		
		
		
		MateriaPrima(){
			
		}



		public MateriaPrima(int codigoMp, String nombre, String procedencia, double precio, int stockDisponible) {
			super();
			this.codigoMp = codigoMp;
			this.nombre = nombre;
			this.procedencia = procedencia;
			this.precio = precio;
			this.stockDisponible = stockDisponible;
		}


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getProcedencia() {
			return procedencia;
		}

		public void setProcedencia(String procedencia) {
			this.procedencia = procedencia;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getStockDisponible() {
			return stockDisponible;
		}

		public void setStockDisponible(int stockDisponible) {
			this.stockDisponible = stockDisponible;
		}

		public int getCodigoMp() {
			return codigoMp;
		}

		public void setCodigoMp(int codigoMp) {
			this.codigoMp = codigoMp;
		}


	

}
