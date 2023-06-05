package amore;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MateriaPrima implements CharSequence {
		
		private int codigoMp;
		private String nombre;
		private String procedencia;
		private double precio;
		private int stockDisponible;
		
		ArrayList <MateriaPrima> materiasPrimas;
		
		
		
		MateriaPrima(){
			
		}



		public MateriaPrima(int codigoMp, String nombre, String procedencia, double precio, int stockDisponible) {
			super();
			this.codigoMp = codigoMp;
			this.nombre = nombre;
			this.procedencia = procedencia;
			this.precio = precio;
			this.stockDisponible = stockDisponible;
			this.materiasPrimas = new ArrayList<>();
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
		
		
		
		public ArrayList<MateriaPrima> getMateriasPrimas() {
			return materiasPrimas;
		}
		public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
			this.materiasPrimas = materiasPrimas;
		}



		public void visualizarStockMateriaPrima(MateriaPrima mp){
			boolean tieneStock=nombre.contains(mp);//chequear
				if(tieneStock){
					System.out.println(mp.getNombre());
					System.out.println(mp.getStockDisponible());
					JOptionPane.showMessageDialog(null,"Materia Prima: " + mp.getNombre() + " tiene en stock " + mp.getStockDisponible() );
				}else{
					JOptionPane.showMessageDialog(null,"Sin stock disponible");
					System.out.println("No hay stock");
				}
		}
		
		
		public void agregarMateriaPrima (MateriaPrima mp) {
			//chequeear
			materiasPrimas.add(mp);
		}



		@Override
		public int length() {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public char charAt(int index) {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public CharSequence subSequence(int start, int end) {
			// TODO Auto-generated method stub
			return null;
		}


	

}
