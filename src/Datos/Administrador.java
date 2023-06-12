package Datos;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;




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
    	
    	String sql ="UPDATE `cliente` SET `nombre`=?,`apellido`=?,`usuario`=?, `telefono`=?,`contrase�a`=?"
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




	
	
	
	
}
	


