package TrabajoFinal;

import java.util.List;

public class ClaseController {
	private ClaseDAO claseDAO;

	public ClaseController() {
		this.claseDAO = new ClaseDAO();
	}

	public void agregarClase(Clase clase, int idEstudiante, int idProfesor) {
		claseDAO.agregarClase(clase, idEstudiante, idProfesor);
	}

	public List<Clase> obtenerClases() {
		return claseDAO.obtenerClases();
	}

	public void actualizarClase(int idClase, int idEstudiante, int idProfesor) {
		claseDAO.actualizarClase(idClase, idEstudiante, idProfesor);
	}

	public void eliminarClase(int idClase) {
		claseDAO.eliminarClase(idClase);
	}
}