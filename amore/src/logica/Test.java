package logica;

public class Test {
    public static void main(String[] args) {
        // testeo rol operario
		Operario op=new Operario();
		op.registrarOperario(op);
		op.iniciarSesion(op); 
		
		
		MateriaPrima mp=new MateriaPrima("tomate", "salta", 45, 100, 0012);
		MateriaPrima mp2=new MateriaPrima("verdeo", "salta", 50, 100, 0013);
		MateriaPrima mp3=new MateriaPrima("cebolla", "san juan", 60, 10, 0014);
		
		op.ingresarMateriaPrima(mp);
		op.ingresarMateriaPrima(mp2);
		op.ingresarMateriaPrima(mp3);
		op.visualizarStockMateriaPrima(mp3);
		op.infoMateriaPrima();
		op.producirMercaderia(op, mp3, 2);
		op.buscarMateriaPrima(mp2);
		
		Producto p1=new Producto(1452, "Salsa Pomodoro", "Salsas", 425, 5);
		Producto p2=new Producto(1453, "Salsa Blanca", "Salsas", 500, 10);
		Producto p3=new Producto(1453, "Salsa Roja", "Salsas", 300, 20);
		Producto p4=new Producto(1453, "Queso Rayado La Serenisima", "Quesos", 800, 10);
		op.cargarProductos(p1);
		op.cargarProductos(p2);
		op.cargarProductos(p3);
		op.cargarProductos(p4);
		p1.agregarProducto(p1);
		p2.agregarProducto(p2);
		p3.agregarProducto(p3);
		p4.agregarProducto(p4);
		
		//testeo rol cliente
		Cliente c=new Cliente();
		c.registrarCliente(c);//funciona
		c.iniciarSesion(c);//funciona
		
		 Deposito depo = new Deposito(1,"Depo");
		 depo.agregarProducto(p2);
		 depo.agregarProducto(p1);
		 depo.agregarProducto(p3);
		 depo.agregarProducto(p4);
		 Pedido p = new Pedido(1, 54.50, 159, null, null, c);
		 c.seleccionarProducto(depo.getProductos(),p);
		 c.metodosDePago(p);
	}

    }
