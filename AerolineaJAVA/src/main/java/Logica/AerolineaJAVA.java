package Logica;

import Database.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Quintero
 */
public class AerolineaJAVA {

    public static void main(String[] args) {
        
        ConexionDB conexion = new ConexionDB();
    
        Connection conn = Database.ConexionDB.conectar();
        
        if (conn != null){
            
            try {
                
                conn.close();
                
            } catch (SQLException e) {
                
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }
}
