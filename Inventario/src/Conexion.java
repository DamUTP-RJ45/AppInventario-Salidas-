
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
        
    public static String Base = "mydb";
    String user = "HRP";
    String password = "1234";
    String url = "jdbc:mysql://localhost:3306/" + Base;

    Connection Conectar = null;
    
    public Connection conexion() {
        try {
            Conectar = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Exitosa. . .");
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }
        return Conectar;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.conexion();
    }
}

