package Database;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public Connection conectar(){
        
        // URL de conexión con las propiedades 'encrypt=true' y 'trustServerCertificate=true'
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Aerolinea;encrypt=true;trustServerCertificate=true;";
        
        String usuario = "Quintero";
        String contrasena = "clave123";
        
        Connection conexion = null;
        
        try {
            
            // Establecer la conexión utilizando la URL con las propiedades de cifrado
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            
            System.out.println("Conexión exitosa a SQL Server");
            
        } catch (SQLException e) {
            
            // Manejo de error
            System.out.println("Error al conectar: " + e.getMessage());
            
        }     
        
        return conexion;
    }
}
