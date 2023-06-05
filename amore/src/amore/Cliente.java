package ejemplo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

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
					return true;
					
				} catch (Exception e) {
					System.out.println("Hubo un error"+e.getMessage());
					return false;
				}
			}
			
			
			
			
			
	      public boolean editarCliente(int id) {
	    		String sql ="ALTER * FROM `cliente` WHERE id = ?";
	    		
	    		try {
	    			stmt = conexion.prepareStatement(sql);
	    			stmt.setLong(1, id);
	    			
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

	    			stmt.executeUpdate();
	    			return true;
	    			
	    		} catch (Exception e) {
	    			System.out.println("Hubo un error"+e.getMessage());
	    			return false;
	    		}
	    		
	      }
				
			
			
			/*
			
			//MOSTRAR PERSONAS(FALTA TERMINAR)
			public LinkedList<Cliente> mostrarCliente() {
				LinkedList<Cliente> Clientes = new LinkedList<Cliente>();
					String sql ="SELECT * FROM `cliente`";
					
					
					
					char[] datos= new char[9]; 
					try {
						stmt = conexion.prepareStatement(sql);
						ResultSet result = stmt.executeQuery();
						
						while(result.next()) {
													
							datos[0]= result.getString(1);
							datos[1]= result.getString(2);
							datos[2]= result.getString(3);
							datos[3]= result.getString(4);
							datos[4]= result.getString(5);
							datos[5]= result.getString(6);
							datos[6]= result.getString(7);
							datos[7]= result.getString(8);
							datos[8]= result.getString(9);
							Clientes.add(new Cliente(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]));
							
						
						}
						return Clientes;
						
					} catch (Exception e) {
						System.out.println("Hubo un error"+e.getMessage());
						return null;
					}
				}
			
			
			*/
			
			
			
		
			
			
			
			
		    public void realizarPedido(){
		        //faltan clases para hacer correctamente el metodo como Pedido
		        System.out.println("Bienvenido " + getNombre() +  " seleccione lo que va a pedir y la cantidad: ");
		        
		    }
		    
		    
		
		    
		

}
