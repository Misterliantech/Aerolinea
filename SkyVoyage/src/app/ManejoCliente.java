package app;

import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDate;


public class ManejoCliente {
    
    String cedula, nombre, email, origen, destino, telefono;
    LocalDate Fecha;
    
    public ManejoCliente(String cedula, String nombre, String email, String origen, String destino, String telefono, LocalDate Fecha) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.origen = origen;
        this.destino = destino;
        this.telefono = telefono;
        this.Fecha = Fecha;
    }
    
    public boolean Guardar(){
        
        String sql = "INSERT INTO cliente (documento_identidad, nombre, email, ciudad_origen, ciudad_destino, telefono, fecha_compra) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = ConexionBD.getConexion().prepareStatement(sql)) {
            // Asignar los valores del cliente a la consulta
            stmt.setString(1, cedula);
            stmt.setString(2, nombre);
            stmt.setString(3, email);
            stmt.setString(4, origen);
            stmt.setString(5, destino);
            stmt.setString(6, telefono);
            stmt.setObject(7, Fecha); 

            // Ejecutar la consulta
            int filasAfectadas = stmt.executeUpdate();

            // Si se afectaron filas, la inserción fue exitosa
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
