package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;


import Datos.Usuario;
import Logica.Almacenista;
import Datos.Conexion;


public class Administrador extends Usuario { 

	//Administrador controlador = new Administrador("", "", "", "", 0, "");
	
	public Administrador(String nombre, String apellido, String id, String usuario, int telefono, String contraseña) {
		super(nombre, apellido, id, usuario, telefono, contraseña);

	}
	

	ArrayList<Administrador> administradores;

	
	public void agregarAdministrador(Administrador a) {
		this.administradores.add(a);
	}
	
	//metodos
	public boolean iniciarSesion(String contraseñaLogin, String nombreLogin) {
	    // Verificar si el usuario y la contrase�a son v�lidos
					   
			   if (nombreLogin.equals(getNombre()) && contraseñaLogin.equals(getContraseña())) {
			        //System.out.println("Inicio de sesi�n exitoso.");
			    	
			        return true;
			    } else {
			    	JOptionPane.showMessageDialog(null, "Amore Pastas\nBienvenido al ABM de Usuarios");
			       //System.out.println("Inicio de sesion fallo. \nPor favor verifique su contrasenia y permiso.");
			        return false;
			   
	        }
	}
	
	
	public boolean loginAdministrador() {
	    int intentos = 3;
	    while(intentos > 0) {		      
	        String contraseñaLogin = JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");
	        String nombreLogin = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
	        boolean inicioSesion = false;
	        Administrador administrador = new Administrador("victoria", "valerio", "1", "administrador", 1234567891, "12345678");
	            if(administrador.iniciarSesion(contraseñaLogin, nombreLogin)) {
	                JOptionPane.showMessageDialog(null, "Se inicio sesion\n Bienvenid@ " + nombreLogin);
	                inicioSesion = true;
	                break;
	            }
	        
	        if(inicioSesion) {
	            break; // Si inici� sesi�n, salimos del while
	        }
	        intentos--;
	        if(intentos == 0) {
	            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de intentos. Saliendo del programa.");
	            System.exit(0);
	        }
	        //JOptionPane.showMessageDialog(null, "Inicio de sesion fallido. Por favor verifique su usuario, contrasenia y permiso. Intentos restantes: " + intentos);
	    }
		return false;
	}

			   

	public boolean verificarId(String id) {
		int flag = 0 ;				
		//do {
		if(!id.equalsIgnoreCase("0")) {
			this.setId(id);
		}else {
        	id = JOptionPane.showInputDialog(null, "El id debe ser >= 1 \nIngrese id del cliente a editar: ");	
		}
		//}while(flag==0);
		return true;
		
	}
	
	//VERIFICAR AGREGAR USUARIO
	public boolean verificar(String nombre,String apellido,String contraseña) {
		int flag = 0 ;				
		do {
		if (nombre.length()>=3 && nombre.length()<=15 ) {
			if (apellido.length()>=3 && apellido.length()<=15 ) {
				
				if (contraseña.length() >= 8) {
					
					//if(String.valueOf(telefono).length() >= 10) {											
					//agregar cuit, crear verificarOperario → verificar turno (mañana, tarde o noche)
						
					this.setNombre(nombre);
					this.setApellido(apellido);
					//this.setTelefono(telefono); 
					this.setContraseña(contraseña);
						
					return true;
						
					//} else {
						
						// tel = JOptionPane.showInputDialog("Error el telefono debe tener 11 caracteres \n Ingrese telefono: ");  
								
					//}						
				}else{
					contraseña = JOptionPane.showInputDialog("Error la contraseña debe tener 8 caracteres \n Ingrese contraseña: "); 
					this.setContraseña(contraseña);
				}
			}else {
				apellido = JOptionPane.showInputDialog("Error apellido  debe tener entre 3 y 15 letras   \n Ingrese apellido: ");
				this.setApellido(apellido);
			}
			
		}else {
			nombre = JOptionPane.showInputDialog("Error el nombre debe tener entre 3 y 15 letras \n Ingrese nombre: ");
			this.setNombre(nombre);
		}
		}while(flag==0);
		return true;
					
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
            	
                JOptionPane.showMessageDialog(null, "\nTODOS LOS REGISTROS DE LA TABLA PROVEEDOR:\n" +  " \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit") + " \nPROVEE: " + result.getString("materialesQueProvee")+ " \nMONTO COMPRADO: " + result.getInt("montoComprado") +  " \nDEUDA: " + result.getString("deuda") + "\n"); 
                System.out.println("\n TODOS LOS REGISTROS DE LA TABLA PROVEEDOR:\n");
                System.out.println(" \nNOMBRE: " + result.getString("nombre") + " \nCUIT: " + result.getString("cuit") + " \nPROVEE: " + result.getString("materialesQueProvee")+ " \nMONTO COMPRADO: " + result.getInt("montoComprado") +  " \nDEUDA: " + result.getString("deuda") + "\n");
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
			stmt.setString(6, this.getContraseña());											
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