package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import Datos.Conexion;

public class Categoria {
	private int idCategoria;
	private String nombre;

	Conexion con =  new Conexion();;
	
	Connection conexion = con.conectar();
	
	//PreparedStatement stmt;
	
	
	public Categoria(int idCategoria, String nombre) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean agregarCategoria() {
		  String sql = "INSERT INTO `categoriaproducto`(`nombre`) VALUES (?) ";

		  try {
		   PreparedStatement stmt = conexion.prepareStatement(sql);
		   stmt = conexion.prepareStatement(sql);
		   stmt.setString(1, this.getNombre());
		   stmt.executeUpdate();
		   stmt.close();
		   JOptionPane.showMessageDialog(null, this.getNombre()+" correctamente agregado");
		   return true;

		  } catch (Exception e) {
		   System.out.println("Hubo un error" + e.getMessage());
		   return false;
		  }
		 }

		 public boolean eliminarCategoria() {
		  int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id de la categoria a eliminar"));
		  String sql = "DELETE FROM `categoriaproducto` WHERE idCategoria= ?";
		  try {
		   PreparedStatement stmt = conexion.prepareStatement(sql);   
		   stmt.setInt(1, indice);
		   stmt.executeUpdate();
		   stmt.close();
		   JOptionPane.showMessageDialog(null, this.getNombre()+" correctamente eliminado");
		   return true;
		  } catch (Exception e) {
		   System.out.println("Hubo un error " + e.getMessage());
		   return false;
		  }
		 }
		 
		 public boolean editarCategoria() {//no anda
			 String sql = "UPDATE `categoriaproducto` SET `nombre`= ? WHERE idCategoria= ?";;
			 try {
				   PreparedStatement stmt = conexion.prepareStatement(sql);   
				   stmt.setString(1, nombre);
				   stmt.setInt(2, idCategoria);
				   stmt.executeUpdate();
				   stmt.close();
				   JOptionPane.showMessageDialog(null, this.getNombre()+" editado correctamente");
				   return true;
				  } catch (Exception e) {
				   System.out.println("Hubo un error " + e.getMessage());
				   return false;
				  }
		 }
		 
		 public boolean agregarProductoACate() {// no anda
			 String nombreC=JOptionPane.showInputDialog(null, "ingrese el nombre de la categoria: ");
			 int id=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el id del producto a agregar: "));
			 String sql = "UPDATE `categoriaproducto` SET `nombre`= ? WHERE idCategoria= ?";
			 try {
				   PreparedStatement stmt = conexion.prepareStatement(sql);   
				  // stmt.setInt(1, indice);
				   //stmt.setString(2, nombre);
				   stmt.executeUpdate();
				   stmt.close();
				   JOptionPane.showMessageDialog(null, this.getNombre()+" añadido correctamente");
				   return true;
				  } catch (Exception e) {
				   System.out.println("Hubo un error " + e.getMessage());
				   return false;
				  }
		 }

	
}
