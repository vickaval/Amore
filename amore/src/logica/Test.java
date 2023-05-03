package logica;

public class Test {
    public static void main(String[] args) {
        Usuario u =new Cliente("Martina", "Asad", 45678955,"masad", "martina1990", 45896);
        u.iniciarSesion(u);
    }
}
