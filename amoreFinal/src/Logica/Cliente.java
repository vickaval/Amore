package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Datos.Usuario;
import Datos.Conexion;

public class Cliente extends Usuario{

		private int cuit;
	    private String razonSocial;
	    private String condicionIva;
	    
	    
			public Cliente(String nombre, String apellido, String id, String usuario, int telefono, String contraseña, int cuit, String razonSocial,
				String condicionIva) {
			super(nombre, apellido, id, usuario, telefono, contraseña);
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



			
			Conexion con =  new Conexion();;
			
			Connection conexion = con.conectar();
			
			PreparedStatement stmt;
			
			//metodos		
			public boolean agregarCliente() {
				
		    	
				String sql ="INSERT INTO `cliente`(`id`, `nombre`, `apellido`, `contraseña`, `telefono`,`cuit`, `razonSocial`, `condicionIVA`, `usuario`) VALUES (?,?,?,?,?,?,?,?,?) ";
				
				try {
					stmt = conexion.prepareStatement(sql);
					stmt.setString(1, this.getId());
					stmt.setString(2, this.getNombre());
					stmt.setString(3, this.getApellido());
					stmt.setString(4, this.getContraseña());
					stmt.setLong(5, this.getTelefono());
					stmt.setInt(6, this.getCuit());
					stmt.setString(7, this.getRazonSocial());
					stmt.setString(8, this.getCondicionIva());	
					stmt.setString(9, this.getUsuario());	
					stmt.executeUpdate();
					conexion.close();
					return true;
					
				} catch (Exception e) {
					System.out.println("Hubo un error"+e.getMessage());
					return false;
				}
				
			}
			
			//EDITAR CLIENTE
		    public boolean editarCliente(String id) {   	
		    	String sql ="UPDATE `cliente` SET `nombre`=?,`apellido`=?,`usuario`=?, `telefono`=?,`contraseña`=?,`cuit`=?, `razonSocial`=?,`condicionIva`=?"
		    			+ "WHERE `id` = ?";	
		    	try {
		    		stmt = conexion.prepareStatement(sql);
		    		stmt.setString(1, this.getId());
					stmt.setString(2, this.getNombre());
					stmt.setString(3, this.getApellido());
					stmt.setString(4, this.getUsuario());
					stmt.setLong(5, this.getTelefono());
					stmt.setString(6, this.getContraseña());				
					stmt.setInt(7, this.getCuit());
					stmt.setString(8, this.getRazonSocial());
					stmt.setString(9, this.getCondicionIva());							
					stmt.executeUpdate();
					conexion.close();
		    		return true;
		    		
		    	} catch (Exception e) {
		    		System.out.println("Hubo un error"+e.getMessage());
		    		return false;
		    	}
		    }
		    
			
		    
		    public boolean iniciarSesion() {
		    	boolean validarContrasena = false;
		        do {
		         int cuit = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cuit: "));
		         String contra = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");

		            String sql = "SELECT * FROM `cliente` WHERE cuit = ? AND contraseña = ?";
		            
		            PreparedStatement stmt = null;
		            ResultSet resultSet = null;

		            try {
		                stmt = conexion.prepareStatement(sql);
		                stmt.setInt(1, cuit);
		                stmt.setString(2, contra);
		                resultSet = stmt.executeQuery();
		                if (resultSet.next()) {
		                    JOptionPane.showMessageDialog(null, "Se inició correctamente la sesión");
		                    validarContrasena = true;
		                    resultSet.close();
		                    stmt.close();
		                } else {
		                    JOptionPane.showMessageDialog(null, "Cuit o contraseña incorrectos");
		                }
		            } catch (Exception e) {
		                JOptionPane.showMessageDialog(null, "Hubo un error: " + e.getMessage());
		           }           
		        } while (!validarContrasena);

		        return validarContrasena;
			      
				
		    }
		    
		    
		    
		    public void verCategorias() {
		    	try {     	
			           String sql ="SELECT * FROM `categoriaproducto`";
			           PreparedStatement stmt = conexion.prepareStatement(sql);
					   //stmt = conexion.prepareStatement(sql);
					   ResultSet result = stmt.executeQuery();
			                
			            while (result.next()) {
			                JOptionPane.showMessageDialog(null, "\nLas categorias son: "+result.getString("nombre"));
			  
			            } 
			            conexion.close();   
			            //JOptionPane.showMessageDialog(null, "no hay nada");
			        } catch (SQLException ex) {
			        	System.out.println("Error en la conexion");
			        }  
		    }
		    
			
		

		
		    
		    
		
		    
		

}
