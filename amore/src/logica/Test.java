package logica;

public class Test {
    public static void main(String[] args) {
        // testeo rol operario
		Operario op=new Operario();
		op.registrarOperario(op);
		op.iniciarSesion(op); 
		
		
		MateriaPrima mp=new MateriaPrima("tomate", "salta", 45, 100, 0012);
		MateriaPrima mp2=new MateriaPrima("verdeo", "salta", 50, 100, 0013);
		MateriaPrima mp3=new MateriaPrima("cebolla", "san juan", 60, 100, 0014);
		
		op.ingresarMateriaPrima(mp);
		op.ingresarMateriaPrima(mp2);
		op.ingresarMateriaPrima(mp3);
		op.visualizarStockMateriaPrima(mp3);
		op.infoMateriaPrima();
		op.producirMercaderia(op, mp3, 2);
		op.buscarMateriaPrima(mp2);
		
		Producto p1=new Producto(1452, "Salsa Pomodoro", "Salsas", 425, 5);
		Producto p2=new Producto(1453, "Salsa Blanca", "Salsas", 425, 5);
		op.cargarProductos(p1);
		op.cargarProductos(p2);
		
		
		

		
		

    }
}
