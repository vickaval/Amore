package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;


import Datos.Usuario;
import Datos.Conexion;


public class Administrador extends Usuario { 

	//Administrador controlador = new Administrador("", "", "", "", 0, "");
	
	public Administrador(String nombre, String apellido, String id, String usuario, int telefono, String contrasenia) {
		super(nombre, apellido, id, usuario, telefono, contrasenia);

	}
	

	
	public boolean verificar(String nombre,String apellido,String contrasenia, int telefono, int cuit) {
		return false;
		
	}
	
	

	//METODOS DE MOSTRAR USUARIOS POR ROLES
	public boolean verCliente() {
        try {     	
           String sql ="SELECT * FROM `cliente`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                
            while (result.next()) {
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA CLIENTES:\n" + "\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nCUIT: " + result.getString("cuit") + " \nRAZON SOCIAL: " + result.getString("razonSocial") + " \nCONDICION IVA: " + result.getString("condicionIva") + "\n"); 
                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA CLIENTES:\n");
                System.out.println("\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nCUIT: " + result.getString("cuit") + " \nRAZON SOCIAL: " + result.getString("razonSocial") + " \nCONDICION IVA: " + result.getString("condicionIva") + "\n");
  
            } 
            conexion.close();        
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
		return false;     
	}
	
	
	public void verOperario() {
        try {     	
        	String sql ="SELECT * FROM `operario`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                       
            while (result.next()) {
            	
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA OPERARIO:\n" + "\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") + " \nTURNO: " + result.getString("turno") + "\n"); 
                System.out.println("\nTODOS LOS REGISTROS DE LA TABLA OPERARIO:\n");
                System.out.println("\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") + " \nTURNO: " + result.getString("turno") + "\n");
                conexion.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
	}
	
		
	public void verVendedor() {
        try {     	
        	String sql ="SELECT * FROM `vendedor`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                       
            while (result.next()) {
            	
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA VENDEDOR:\n" + "\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") +  "\n"); 
                System.out.println("\nTODOS LOS REGISTROS DE LA TABLA VENDEDOR:\n");
                System.out.println("\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") + "\n");
                conexion.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
	}
	
	
	public void verAlmacenista() {
        try {     	
        	String sql ="SELECT * FROM `almacenista`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                       
            while (result.next()) {
            	
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA ALMACENISTA:\n" + "\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") + " \nID DEPOSITO: " + result.getString("idDepo") +  "\n"); 
                System.out.println("\nTODOS LOS REGISTROS DE LA TABLA ALMACENISTA:\n");
                System.out.println("\nID: " + result.getInt("id") + " \nNOMBRE: " + result.getString("nombre") + " \nAPELLIDO: " + result.getString("apellido")+ " \nTELEFONO: " + result.getInt("telefono") + " \nNOMBRE AREA: " + result.getString("nombreArea") + " \nANTIGUEDAD: " + result.getString("aniosAntiguedad") + " \nSUELDO: " + result.getString("sueldo") +  " \nID DEPOSITO: " + result.getString("idDepo")+ "\n");
                conexion.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
	}

	
	public void verProveedor() {
        try {     	
           String sql ="SELECT * FROM `proveedor`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                       
            while (result.next()) {
            	
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA PROVEEDOR:\n" + "\nID: " + " \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit") + " \nPROVEE: " + result.getString("materialesQueProvee")+ " \nMONTO COMPRADO: " + result.getInt("montoComprado") +  " \nDEUDA: " + result.getString("deuda") + "\n"); 
                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA PROVEEDOR:\n");
                System.out.println("\nID: " + " \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit") + " \nPROVEE: " + result.getString("materialesQueProvee")+ " \nMONTO COMPRADO: " + result.getInt("montoComprado") +  " \nDEUDA: " + result.getString("deuda") + "\n");
                conexion.close();
            }
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
	}
	
	
	
	
	//ELIMINAR PERSONAS
	public boolean eliminarCliente(int id) {
		
		String sql ="DELETE FROM `cliente` WHERE id = ?";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setLong(1, id);

			stmt.executeUpdate();
			conexion.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("Hubo un error"+e.getMessage());
			return false;
		}
	}
	
	public boolean eliminarOperario(int id) {
		
		String sql ="DELETE FROM `operario` WHERE id = ?";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setLong(1, id);

			stmt.executeUpdate();
			conexion.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("Hubo un error"+e.getMessage());
			return false;
		}
	}
	
	
	
    public boolean eliminarVendedor(int id) {
		
		String sql ="DELETE FROM `vendedor` WHERE id = ?";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setLong(1, id);

			stmt.executeUpdate();
			conexion.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("Hubo un error"+e.getMessage());
			return false;
		}
	}
    
    
    
    public boolean eliminarAlmacenista(int id) {
		
		String sql ="DELETE FROM `almacenista` WHERE id = ?";
		
		try {
			stmt = conexion.prepareStatement(sql);
			stmt.setLong(1, id);

			stmt.executeUpdate();
			conexion.close();
			return true;
			
		} catch (Exception e) {
			System.out.println("Hubo un error"+e.getMessage());
			return false;
		}
	}
    
    
    
    
  //EDITAR CLIENTE
    public boolean editarCliente(int id) {
    	
    	String sql ="UPDATE `cliente` SET `nombre`=?,`apellido`=?,`usuario`=?, `telefono`=?,`contraseña`=?"
    			+ "WHERE id = ?";
    	
    	try {
    		stmt = conexion.prepareStatement(sql);
    		stmt.setString(1, this.getId());
			stmt.setString(2, this.getNombre());
			stmt.setString(3, this.getApellido());
			stmt.setString(4, this.getUsuario());
			stmt.setLong(5, this.getTelefono());
			stmt.setString(6, this.contrasenia());											
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



	//APLICAR DESCUENTO
    public double aplicarDescuento() {
    	// Clientes grandes: 10% si compra $10000 o + 		
	    double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto del cliente"));   
       
    	double descuento;
    	
    	if(monto >= 10000){
    	descuento = (monto * 10) / 100;
    	} else {
    	descuento = 0;
    	}

    	
    	JOptionPane.showMessageDialog(null, "El descuento es de: " + descuento);
    	
    	double venta = monto - descuento;
    	JOptionPane.showMessageDialog(null,"El monto total de la venta es de: " + venta);
    	
    	System.out.println (" ");
    	System.out.println ("FACTURA");
    	System.out.println ("monto: " + monto);
    	System.out.println ("descuento: " + descuento);
    	System.out.println ("total: " + venta);
		return venta;
		
	}
    
    
    
    
	
	public void deudaConProveedores() {	
		 try {     	
	        	String sql ="SELECT * FROM `proveedor`";
			   stmt = conexion.prepareStatement(sql);
			   ResultSet result = stmt.executeQuery();
	                       
	            while (result.next()) {
	            	if(!result.getString("deuda").equalsIgnoreCase("0")) {
	            		         	
	                JOptionPane.showMessageDialog(null, "\nTODOS LOS PROVEEDORES CON DEUDA:\n" + " \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit")+ " \nDEUDA: " + result.getInt("deuda")  + "\n"); 
	                System.out.println("\nTODOS LOS PROVEEDORES CON DEUDA:\n");
	                System.out.println(" \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit")+ " \nDEUDA: " + result.getInt("deuda")  + "\n"); 
	                conexion.close();
	                }
	            }
	        } catch (SQLException ex) {
	        	System.out.println("Error en la conexion");
	        }
		
	
	
		
	}
	

}
