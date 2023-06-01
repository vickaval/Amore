package Datos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection con;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amore","root","");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error al conectarse" + e.getMessage());
        }

        return con;
    }
}
