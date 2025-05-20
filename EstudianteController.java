package TrabajoFinal;

import java.util.List;

public class EstudianteController {
	private EstudianteDAO estudianteDAO;

	public EstudianteController() {
		this.estudianteDAO = new EstudianteDAO();
	}

	public void agregarEstudiante(Estudiante estudiante) {
		estudianteDAO.agregarEstudiante(estudiante);
	}

	public List<Estudiante> obtenerEstudiantes() {
		return estudianteDAO.obtenerEstudiantes();
	}

	public void actualizarEstudiante(Estudiante estudiante) {
		estudianteDAO.actualizarEstudiante(estudiante);
	}

	public void eliminarEstudiante(int idEstudiante) {
		estudianteDAO.eliminarEstudiante(idEstudiante);
	}
}
