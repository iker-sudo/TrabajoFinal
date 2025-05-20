package TrabajoFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
//Método para agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO Estudiantes (nombre, apellido, fecha_nacimiento, correo_electronico, telefono) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getFechaNacimiento());
            statement.setString(4, estudiante.getCorreoElectronico());
            statement.setString(5, estudiante.getTelefono());
            statement.executeUpdate();

            System.out.println("Estudiante agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar estudiante: " + e.getMessage());
        }
    }
//Método para listar estudiante
    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String sql = "SELECT * FROM Estudiantes";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Estudiante estudiante = new Estudiante(
                    resultSet.getInt("id_estudiante"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido"),
                    resultSet.getString("fecha_nacimiento"),
                    resultSet.getString("correo_electronico"),
                    resultSet.getString("telefono")
                );
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener estudiantes: " + e.getMessage());
        }
        return estudiantes;
    }
//Método para actualizar estudiante
    public void actualizarEstudiante(Estudiante estudiante) {
        String sql = "UPDATE Estudiantes SET nombre=?, apellido=?, fecha_nacimiento=?, correo_electronico=?, telefono=? WHERE id_estudiante=?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, estudiante.getNombre());
            statement.setString(2, estudiante.getApellido());
            statement.setString(3, estudiante.getFechaNacimiento());
            statement.setString(4, estudiante.getCorreoElectronico());
            statement.setString(5, estudiante.getTelefono());
            statement.setInt(6, estudiante.getIdEstudiante());
            statement.executeUpdate();

            System.out.println("Estudiante actualizado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar estudiante: " + e.getMessage());
        }
    }
//Método para eliminar estudiante
    public void eliminarEstudiante(int idEstudiante) {
        String sql = "DELETE FROM Estudiantes WHERE id_estudiante=?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idEstudiante);
            statement.executeUpdate();

            System.out.println("Estudiante eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar estudiante: " + e.getMessage());
        }
    }
}