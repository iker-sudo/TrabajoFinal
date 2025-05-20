package TrabajoFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO {

    // Método para agregar una clase
    public void agregarClase(Clase clase, int idEstudiante, int idProfesor) {
        String sql = "INSERT INTO Clases (id_estudiante, id_profesor) VALUES (?, ?)";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idEstudiante);
            statement.setInt(2, idProfesor);
            statement.executeUpdate();

            System.out.println("Clase agregada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar clase: " + e.getMessage());
        }
    }

    // Método para obtener todas las clases
    public List<Clase> obtenerClases() {
        List<Clase> clases = new ArrayList<>();
        String sql = "SELECT * FROM Clases";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Clase clase = new Clase(
                    resultSet.getInt("id_clase"),
                    new ArrayList<>(),
                    new ArrayList<>()
                );
                clases.add(clase);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener clases: " + e.getMessage());
        }
        return clases;
    }

    // Método para actualizar una clase
    public void actualizarClase(int idClase, int idEstudiante, int idProfesor) {
        String sql = "UPDATE Clases SET id_estudiante = ?, id_profesor = ? WHERE id_clase = ?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idEstudiante);
            statement.setInt(2, idProfesor);
            statement.setInt(3, idClase);

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Clase actualizada correctamente.");
            } else {
                System.out.println("No se encontró la clase para actualizar.");
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar clase: " + e.getMessage());
        }
    }

    // Método para eliminar una clase
    public void eliminarClase(int idClase) {
        String sql = "DELETE FROM Clases WHERE id_clase = ?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idClase);

            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Clase eliminada correctamente.");
            } else {
                System.out.println("No se encontró la clase para eliminar.");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar clase: " + e.getMessage());
        }
    }
}