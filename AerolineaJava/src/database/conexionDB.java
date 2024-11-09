package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionDB {
    
    public static void main(String[] args) {
        
        String url = "";
        String usuario = "Quintero";
        String contraseña = "clave123";
        
        try (Connection conn = Driver.Manager.getConnection(url, usuario, contraseña)){
            
            System.out.println("Conexion exitosa");
            
        } catch (SQLException e) {
            
            System.out.println("Error al conectarse a la DB");
            e.printStackTrace();
        }
    }
    
}
