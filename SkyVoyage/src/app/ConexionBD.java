package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Aerolinea;encrypt=false"; // Cambia según tu configuración
    private static final String USUARIO = "Quintero";  // Ajusta tu usuario
    private static final String CONTRASENA = "clave123";  // Ajusta tu contraseña

    // Método para obtener la conexión a la base de datos
    public static Connection getConexion() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (SQLException e) {
            throw new SQLException("Error al conectar con la base de datos", e);
        }
    }
}
