package app;

import java.sql.*;

public class GestorAsientos {
    
    public static void actualizarAsientosParaTodosLosVuelos() {
        String sqlVuelos = "SELECT codigo_vuelo FROM vuelos WHERE estado = 'En Curso'";  // Consulta para obtener todos los vuelos en curso
        
        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmtVuelos = conn.prepareStatement(sqlVuelos);
             ResultSet rsVuelos = stmtVuelos.executeQuery()) {

            // Iteramos por cada vuelo en curso
            while (rsVuelos.next()) {
                String codigoVuelo = rsVuelos.getString("codigo_vuelo");
                
                // Ahora actualizamos los asientos ocupados para este vuelo
                actualizarAsientosOcupados(codigoVuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener los vuelos.");
        }
    }
    
    private static void actualizarAsientosOcupados(String codigoVuelo) {
        // Actualiza la cantidad de asientos ocupados para el vuelo
        String sqlActualizar = "UPDATE vuelos SET asientos_ocupados = ("
                             + "SELECT COUNT(*) FROM asientos_ocupados WHERE codigo_vuelo = ?"
                             + ") WHERE codigo_vuelo = ?";

        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sqlActualizar)) {

            stmt.setString(1, codigoVuelo);  // Establecer el código de vuelo en la subconsulta
            stmt.setString(2, codigoVuelo);  // Establecer el código de vuelo en la cláusula WHERE

            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Asientos ocupados actualizados con éxito para el vuelo " + codigoVuelo);
            } else {
                System.out.println("Error al actualizar los asientos ocupados para el vuelo " + codigoVuelo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar los asientos ocupados para el vuelo " + codigoVuelo);
        }
    }
}


