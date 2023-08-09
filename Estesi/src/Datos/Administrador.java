package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
	
	
	
	//CATEGORIAS-------------
	public boolean verSalsas() {
        try {     	
           String sql ="SELECT * FROM `salsas`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                
            while (result.next()) {
                JOptionPane.showMessageDialog(null, "\nSALSAS:\n" +  " \nNOMBRE: " + result.getString("nombre")  + "\n"); 
               
            } 
            conexion.close();        
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
		return false;     
	}
	
	
	public boolean verProductos() {
        try {     	
           String sql ="SELECT * FROM `producto`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                
            while (result.next()) {
                JOptionPane.showMessageDialog(null, "\nPASTAS:\n" +  " \nNOMBRE: " + result.getString("nombre")  + "\n"); 
               
            } 
            conexion.close();        
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
		return false;     
	}
	
	
	public boolean verQuesos() {
        try {     	
           String sql ="SELECT * FROM `quesos`";
		   stmt = conexion.prepareStatement(sql);
		   ResultSet result = stmt.executeQuery();
                
            while (result.next()) {
                JOptionPane.showMessageDialog(null, "\nQUESOS:\n" +  " \nNOMBRE: " + result.getString("nombre")  + "\n"); 
               
            } 
            conexion.close();        
        } catch (SQLException ex) {
        	System.out.println("Error en la conexion");
        }
		return false;     
	}
	
	//----------------
	

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

    	double venta = monto - descuento;
    	JOptionPane.showMessageDialog(null, "FACTURA\nMonto: " + monto + "\nDescuento: " + descuento + "\nTotal: " + venta);
    	
    	


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



	public void validarInicioSesionAlmacenista(String usuario, String contrasenia) {
	    // Consulta SQL para buscar al almacenista por usuario y contrase�a
	    String sql = "SELECT * FROM almacenista WHERE usuario = ? AND contrasenia = ?";
	    try {
	        PreparedStatement stmt = conexion.prepareStatement(sql);
	        stmt.setString(1, usuario);
	        stmt.setString(2, contrasenia);
	        ResultSet result = stmt.executeQuery();

	        if (result.next()) {
	            // El almacenista est� registrado, mostrar mensaje de inicio de sesi�n exitoso
	            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
	        } else {
	            // El almacenista no est� registrado, mostrar mensaje de inicio de sesi�n fallido
	            JOptionPane.showMessageDialog(null, "Inicio de sesion fallido");
	        }

	    } catch (SQLException ex) {
	        System.out.println("Error en la conexion: " + ex.getMessage());
	    }
	}



	public int ofrecerOpcionesalmacenista() {
		int ret=0;
		int eleccion=0;
	 	do {
		Object[] opciones = {"Visualizar stock de materias primas", "Visualizar stock de productos", "Ver pedidos pendientes","Preparar pedidos", "Finalizar sesion."};
	    eleccion = JOptionPane.showOptionDialog(null, "¿Que accion desea realizar?", "Menu principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
	    switch (eleccion) {
	    case 0:
           // Ejecutar la consulta SQL y obtener los datos de la tabla
           String sql = "SELECT * FROM materiaprima";
           
           try (
                PreparedStatement stmt = conexion.prepareStatement(sql);
                ResultSet result = stmt.executeQuery()) {
               
               // Construir el mensaje a mostrar en el JOptionPane
               StringBuilder mensaje = new StringBuilder();
               mensaje.append("Stock de materias primas:\n\n");

               // Recorrer los resultados de la consulta y agregarlos al mensaje
               while (result.next()) {
                   int idMp = result.getInt("idMp");
                   String nombre = result.getString("nombre");
                   int stockDisponible = result.getInt("stockDisponible");

                   mensaje.append("ID: ").append(idMp).append("\n");
                   mensaje.append("Nombre: ").append(nombre).append("\n");
                   mensaje.append("Stock disponible: ").append(stockDisponible).append("\n");
                   mensaje.append("--------------------\n");
               }

               // Mostrar el mensaje en un JOptionPane
               JOptionPane.showMessageDialog(null, mensaje.toString(), "Stock de materias primas", JOptionPane.INFORMATION_MESSAGE);
               
           } catch (SQLException e) {
               e.printStackTrace();
           }
           
           break;

	        case 1:    	    		

	        	  // Ejecutar la consulta SQL y obtener los datos de la tabla
	            String sql2 = "SELECT * FROM producto";
	            
	            try (
	                 PreparedStatement stmt = conexion.prepareStatement(sql2);
	                 ResultSet result = stmt.executeQuery()) {
	                
	                // Construir el mensaje a mostrar en el JOptionPane
	                StringBuilder mensaje = new StringBuilder();
	                mensaje.append("Stock de productos:\n\n");

	                // Recorrer los resultados de la consulta y agregarlos al mensaje
	                while (result.next()) {
	                    int idProducto = result.getInt("idProducto");
	                    String nombre = result.getString("nombre");
	                    double precio = result.getInt("precio");
	                    int cantidad = result.getInt("cantidad");

	                    mensaje.append("ID: ").append(idProducto).append("\n");
	                    mensaje.append("Nombre: ").append(nombre).append("\n");
	                    mensaje.append("precio: $").append(precio).append("\n");
	                    mensaje.append("Cantidad: ").append(cantidad).append("\n");
	                    mensaje.append("--------------------\n");
	                }

	                // Mostrar el mensaje en un JOptionPane
	                JOptionPane.showMessageDialog(null, mensaje.toString(), "Stock de productos", JOptionPane.INFORMATION_MESSAGE);
	                
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            break;
	            
	        case 2:
	            try {
	                // Consulta SQL para seleccionar los pedidos con estado = 1
	                String sql3 = "SELECT * FROM pedido WHERE estado = 1";

	                PreparedStatement stmt = conexion.prepareStatement(sql3);
	                ResultSet result = stmt.executeQuery();

	                StringBuilder mensaje = new StringBuilder();
	                mensaje.append("Pedidos a preparar:\n\n");

	                // Procesar los resultados
	                while (result.next()) {
	                    // Obtener los datos de cada pedido
	                    int idPedido = result.getInt("idPedido");
	                    int descuento = result.getInt("descuento");
	                    double total = result.getDouble("total");
	                    String formaPago = result.getString("formaPago");
	                    int idVendedor = result.getInt("idVendedor");
	                    int idCliente = result.getInt("idCliente");
	                    int estado = result.getInt("estado");

	                    // Agregar los datos del pedido al mensaje
	                    mensaje.append("Pedido #: ").append(idPedido).append("\n");
	                    mensaje.append("Descuento: ").append(descuento).append("\n");
	                    mensaje.append("Total: ").append(total).append("\n");
	                    mensaje.append("Forma de Pago: ").append(formaPago).append("\n");
	                    mensaje.append("ID Vendedor: ").append(idVendedor).append("\n");
	                    mensaje.append("ID Cliente: ").append(idCliente).append("\n");
	                    mensaje.append("Estado: ").append(estado).append("\n");

	                    // Consulta SQL para obtener los productos del pedido
	                    String sqlProductos = "SELECT P.nombre FROM producto P INNER JOIN pedido_producto PP ON P.idProducto = PP.idProducto WHERE PP.idPedido = ?";
	                    PreparedStatement stmtProductos = conexion.prepareStatement(sqlProductos);
	                    stmtProductos.setInt(1, idPedido);
	                    ResultSet resultProductos = stmtProductos.executeQuery();

	                    mensaje.append("Productos del pedido:\n");
	                    boolean hayProductos = false;
	                    while (resultProductos.next()) {
	                        String nombreProducto = resultProductos.getString("nombre");
	                        mensaje.append("- ").append(nombreProducto).append("\n");
	                        hayProductos = true;
	                    }

	                    if (!hayProductos) {
	                        mensaje.append("- No hay productos en el pedido\n");
	                    }

	                    // Verificar el estado del pedido
	                    if (estado == 0) {
	                        mensaje.append("Estado del pedido: Ya preparado\n");
	                    }

	                    mensaje.append("--------------------\n");
	                }

	                // Verificar si existen pedidos pendientes
	                if (mensaje.toString().equals("Pedidos a preparar:\n\n")) {
	                    JOptionPane.showMessageDialog(null, "No hay pedidos pendientes.");
	                } else {
	                    JOptionPane.showMessageDialog(null, mensaje.toString(), "Pedidos pendientes", JOptionPane.INFORMATION_MESSAGE);
	                }

	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            break;


	        	
	        case 3:
	            try {
	                String sql4 = "SELECT p.idPedido, p.descuento, pp.cantidad, pr.nombre AS nombreProducto, pr.cantidad AS cantidadProducto, pr.idProducto\n"
	                        + "FROM pedido p \n"
	                        + "INNER JOIN pedido_producto pp\n"
	                        + "ON p.idPedido = pp.idPedido\n"
	                        + "INNER JOIN producto pr\n"
	                        + "ON pp.idProducto = pr.idProducto\n"
	                        + "WHERE p.estado = 1;\n"
	                        + "";

	                PreparedStatement stmt = conexion.prepareStatement(sql4);
	                ResultSet result = stmt.executeQuery();

	                StringBuilder mensaje = new StringBuilder();

	                boolean hayPedidos = false;

	                while (result.next()) {
	                    hayPedidos = true;
	                    int idPedido = result.getInt("idPedido");
	                    int cantidadPedido = result.getInt("cantidad");
	                    int cantidadProducto = result.getInt("cantidadProducto");
	                    int idProducto = result.getInt("idProducto");

	                    if (cantidadPedido <= cantidadProducto) {
	                        // La cantidad del producto es suficiente, realizar el descuento
	                        int nuevaCantidadProducto = cantidadProducto - cantidadPedido;

	                        // Actualizar la tabla producto con la nueva cantidad
	                        String updateSql = "UPDATE producto SET cantidad = ? WHERE idProducto = ?";
	                        PreparedStatement updateStmt = conexion.prepareStatement(updateSql);
	                        updateStmt.setInt(1, nuevaCantidadProducto);
	                        updateStmt.setInt(2, idProducto);
	                        updateStmt.executeUpdate();

	                        // Cambio el estado del pedido para indicar que ya se preparó
	                        String updateEstadoSql = "UPDATE Pedido SET estado = 0 WHERE idPedido = ?";
	                        PreparedStatement updateEstadoStmt = conexion.prepareStatement(updateEstadoSql);
	                        updateEstadoStmt.setInt(1, idPedido);
	                        updateEstadoStmt.executeUpdate();
	                    } else {
	                        // La cantidad del producto es insuficiente
	                        mensaje.append("No hay suficiente cantidad del producto para el pedido #").append(idPedido).append("\n");
	                    }
	                }

	                // Mostrar el mensaje en un JOptionPane
	                if (hayPedidos) {
	                    if (mensaje.length() > 0) {
	                        JOptionPane.showMessageDialog(null, mensaje.toString(), "Cantidad insuficiente del producto", JOptionPane.WARNING_MESSAGE);
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Descuento de productos realizado correctamente.", "Descuento exitoso", JOptionPane.INFORMATION_MESSAGE);
	                    }
	                } else {
	                    JOptionPane.showMessageDialog(null, "No hay pedidos pendientes por preparar.", "No hay pedidos", JOptionPane.INFORMATION_MESSAGE);
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	            break;

	            
	        case 4:
	         	ret=1;
	         	break;
	         	
	        default:
	            JOptionPane.showMessageDialog(null, "Opcion no valida.");
	            break;
	    }
	 	}while (eleccion !=4);
		return ret;
		
	}

	public boolean iniciarSesion(JPasswordField contraseñaLogin, JTextField nombreLogin) {
		   
		   if (nombreLogin.equals(getNombre()) && contraseñaLogin.equals(getContraseña())) {
		        //System.out.println("Inicio de sesi�n exitoso.");
		    	
		        return true;
		    } else {
		    	JOptionPane.showMessageDialog(null, "Amore Pastas\nBienvenido al ABM de Usuarios");
		       //System.out.println("Inicio de sesion fallo. \nPor favor verifique su contrasenia y permiso.");
		        return false;

	}
	}

    
	
	
	

}
