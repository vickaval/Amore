package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ejemplo.Proveedor;

public class Administrador extends Usuario { 

	//Administrador controlador = new Administrador("", "", "", "", 0, "");
	
	public Administrador(String nombre, String apellido, String id, String usuario, int telefono, String contraseña) {
		super(nombre, apellido, id, usuario, telefono, contraseña);

	}
	
	//VERIFICAR EMPLEADO (almacenista y vendedor)
	public boolean verificar(String nombre,String apellido,String contraseña, int telefono) {
		int flag = 0 ;	
		String telefono2 = telefono+"";
		do {
		if (nombre.length()>=3 && nombre.length()<=15 ) {
			if (apellido.length()>=3 && apellido.length()<=15 ) {
				//verifica largo de la contraseña mayor o = a 8
				if (contraseña.length() >= 8) {
					
					if(telefono2.length() == 11) {
					//agregar cuit, crear verificarOperario → verificar turno (mañana, tarde o noche)
						// telefono2 = "";      
					    //int telefono3 = Integer.parseInt(telefono2);
					this.setNombre(nombre);
					this.setApellido(apellido);
					this.setContraseña(contraseña);
					
					
					return true;
					} else {
						telefono = Integer.parseInt(JOptionPane.showInputDialog("Error el telefono debe tener 11 caracteres \n Ingrese telefono: "));
						this.setTelefono(telefono); 
					}
				}else{
					contraseña = JOptionPane.showInputDialog("Error la contraseña debe tener 8 caracteres \n Ingrese contraseña: "); 
				}
			}else {
				apellido = JOptionPane.showInputDialog("Error apellido  debe tener entre 3 y 15 letras   \n Ingrese apellido: ");
			}
			
		}else {
			nombre = JOptionPane.showInputDialog("Error el nombre debe tener entre 3 y 15 letras \n Ingrese nombre: ");
		}
		}while(flag==0);
		return true;
			
	}
	
	

	//METODOS DE MOSTRAR USUARIOS POR ROLES
	public void verCliente() {
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
	                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE DEUDA DE LA TABLA PROVEEDOR:\n" + " \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit")+ " \nDEUDA: " + result.getInt("deuda")  + "\n"); 
	                System.out.println("\nTODOS LOS REGISTROS DE LA TABLA OPERARIO:\n");
	                System.out.println(" \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit")+ " \nDEUDA: " + result.getInt("deuda")  + "\n"); 
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	        	System.out.println("Error en la conexion");
	        }
		
	
	
		
	}
   
    
    
    
    
	
	
	
	












	
	

}
