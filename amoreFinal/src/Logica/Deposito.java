package Logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Deposito {
	
	 private int idDepo;
	    private String nombre;

	    ArrayList<Producto> productos;
	    ArrayList<Almacenista> almacenistas;
	  
	    public Deposito(int idDepo, String nombre) {
	        super();
	        this.idDepo = idDepo;
	        this.nombre = nombre;
	        
	        
	    }

		public Deposito(){
			
		}

		public int getIdDepo() {
			return idDepo;
		}

		public void setIdDepo(int idDepo) {
			this.idDepo = idDepo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
			
		public ArrayList<Producto> getProductos() {
			return productos;
		}
		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}

		public ArrayList<Almacenista> getAlmacenistas() {
			return almacenistas;
		}
		public void setAlmacenistas(ArrayList<Almacenista> almacenistas) {
			this.almacenistas = almacenistas;
		}
		
		
		
		
		public void agregarProducto(Producto p) {
			this.productos.add(p);
		}
		
		public void agregarAlmacenistas(Almacenista a) {
			this.almacenistas.add(a);
		}
		
		
		
		
		public boolean loginAlmacenista() {
		    int intentos = 3;
		    while(intentos > 0) {
		        String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario");
		        if(usuario == null) {
		            System.exit(0); // Si el usuario presiona cancelar, salimos del programa
		        }
		        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contrasenia");
		        boolean inicioSesion = false;
		        for(Almacenista almacenista : almacenistas) {
		            if(almacenista.iniciarSesion(usuario, contrasena)) {
		                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso.");
		                inicioSesion = true;
		                break;
		            }
		        }
		        if(inicioSesion) {
		            break; // Si inici� sesi�n, salimos del while
		        }
		        intentos--;
		        if(intentos == 0) {
		            JOptionPane.showMessageDialog(null, "Ha excedido el numero maximo de intentos. Saliendo del programa.");
		            System.exit(0);
		        }
		        JOptionPane.showMessageDialog(null, "Inicio de sesion fallido. Por favor verifique su usuario, contrasenia y permiso. Intentos restantes: " + intentos);
		    }
			return false;
		}
		
		

		public ArrayList<Producto> buscarProductos(ArrayList<Producto> buscados) {
			
			ArrayList<Producto> pedidoRearmado = new ArrayList<>();
			
			    // Iterar sobre los productos del depo
			    for (Producto producto : this.productos) {
			        // Iterar sobre los productos buscados en el pedido
			        for (Producto buscado : buscados) {
			           
			            if (producto.getIdProducto() == buscado.getIdProducto()) {
			                // Comparar si la cantidad del producto es igual o mayor a la cantidad buscada
			                if (producto.getCantidad() >= buscado.getCantidad()) {
			                	producto.setCantidad(producto.getCantidad() - buscado.getCantidad());
			                	
			                    pedidoRearmado.add(buscado);
			                   
			                    JOptionPane.showMessageDialog(null,"Se prepara producto: " + producto.getNombre());
			                    JOptionPane.showMessageDialog(null," Del producto " + producto.getNombre() + " quedo en stock: " 
			                    + producto.getCantidad() );
			                    
			                }else {
			                	JOptionPane.showMessageDialog(null, "No hay sufiente cantidad del producto " + 
			                producto.getNombre() + " y no se prepara");
			                	
			                }
			            }
			        }
			    }
				return pedidoRearmado;
			
		}
		
		
		


		

}
