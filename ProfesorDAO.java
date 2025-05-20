package TrabajoFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {

    public void agregarProfesor(Profesor profesor) {
        String sql = "INSERT INTO Profesores (nombre, apellido, correo_electronico, telefono) VALUES (?, ?, ?, ?)";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, profesor.getNombre());
            statement.setString(2, profesor.getApellido());
            statement.setString(3, profesor.getCorreoElectronico());
            statement.setString(4, profesor.getTelefono());
            statement.executeUpdate();

            System.out.println("Profesor agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar profesor: " + e.getMessage());
        }
    }

    public List<Profesor> obtenerProfesor() {
        List<Profesor> profesores = new ArrayList<>();
        String sql = "SELECT * FROM Profesores";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Profesor profesor = new Profesor(
                    resultSet.getInt("id_profesor"),
                    resultSet.getString("nombre"),
                    resultSet.getString("apellido"),
                    resultSet.getString("correo_electronico"),
                    resultSet.getString("telefono")
                );
                profesores.add(profesor);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener profesores: " + e.getMessage());
        }
        return profesores;
    }

    public void actualizarProfesor(Profesor profesor) {
        String sql = "UPDATE Profesores SET nombre=?, apellido=?, correo_electronico=?, telefono=? WHERE id_profesor=?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, profesor.getNombre());
            statement.setString(2, profesor.getApellido());
            statement.setString(3, profesor.getCorreoElectronico());
            statement.setString(4, profesor.getTelefono());
            statement.setInt(5, profesor.getIdProfesor());
            statement.executeUpdate();

            System.out.println("Profesor actualizado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar profesor: " + e.getMessage());
        }
    }

    public void eliminarProfesor(int idProfesor) {
        String sql = "DELETE FROM Profesores WHERE id_profesor=?";
        try (Connection connection = ConexionBBDD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idProfesor);
            statement.executeUpdate();

            System.out.println("Profesor eliminado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar profesor: " + e.getMessage());
        }
    }
}