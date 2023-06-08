package nuevo.Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;


import Datos.Usuario;
import Datos.Conexion;

public class Cliente extends Usuario{

		private int cuit;
	    private String razonSocial;
	    private String condicionIva;
	    
	    
			public Cliente(String nombre, String apellido, String id, String usuario, int telefono, String contrasenia, int cuit, String razonSocial,
				String condicionIva) {
			super(nombre, apellido, id, usuario, telefono, contrasenia);
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
		    	
				System.out.println("agregar usuario");
				String sql ="INSERT INTO `cliente`(`nombre`, `apellido`, `contrasenia`, `telefono`,`cuit`, `razonSocial`, `condicionIVA`, `usuario`) VALUES (?,?,?,?,?,?,?,?) ";
				
				try {
					stmt = conexion.prepareStatement(sql);
					stmt.setString(1, this.getNombre());
					stmt.setString(2, this.getApellido());
					stmt.setString(3, this.contrasenia());
					stmt.setLong(4, this.getTelefono());
					stmt.setInt(5, this.getCuit());
					stmt.setString(6, this.getRazonSocial());
					stmt.setString(7, this.getCondicionIva());	
					stmt.setString(8, this.getUsuario());	
					stmt.executeUpdate();
					conexion.close();
					return true;
					
				} catch (Exception e) {
					System.out.println("Hubo un error"+e.getMessage());
					return false;
				}
				
			}
			
			private String contrasenia() {
				// TODO Auto-generated method stub
				return null;
			}




			//EDITAR CLIENTE
		    public boolean editarCliente(int id) {
		    	
		    	String sql ="UPDATE `cliente` SET `nombre`=?,`apellido`=?,`usuario`=?, `telefono`=?,`contraseña`=?,`cuit`=?, `razonSocial`=?,`condicionIva`=?"
		    			+ "WHERE id = ?";
		    	
		    	try {
		    		stmt = conexion.prepareStatement(sql);
		    		stmt.setString(1, this.getId());
					stmt.setString(2, this.getNombre());
					stmt.setString(3, this.getApellido());
					stmt.setString(4, this.getUsuario());
					stmt.setLong(5, this.getTelefono());
					stmt.setString(6, this.getcontrasenia());				
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
		    
			
			
		
				
			
			
		
			
		    private String getcontrasenia() {
				// TODO Auto-generated method stub
				return null;
			}




			public void realizarPedido(){
		        //faltan clases para hacer correctamente el metodo como Pedido
		        System.out.println("Bienvenido " + getNombre() +  " seleccione lo que va a pedir y la cantidad: ");
		        
		    }
		    
		    
		
		    
		

}
