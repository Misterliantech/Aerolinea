package Logica;

import Database.ConexionDB;
import Visuales.PaginaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;

public class AerolineaJAVA {

    public static void main(String[] args) {
        
        ConexionDB conexion = new ConexionDB();
        Connection conn = null;

        try {
            // Intentamos establecer la conexión
            conn = conexion.conectar();

            if (conn != null) {
                System.out.println("Conexión establecida con éxito.");
                
                javax.swing.SwingUtilities.invokeLater(() -> {
                    PaginaPrincipal inicio = new PaginaPrincipal();
                    inicio.setVisible(true);
                });
                
            } else {
                System.out.println("No se pudo establecer la conexión.");
            }
            
        } catch (Exception e) {
            
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            
        } finally {
            // Aseguramos que la conexión se cierre siempre
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
