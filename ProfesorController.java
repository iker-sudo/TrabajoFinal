package TrabajoFinal;

import java.util.List;

public class ProfesorController {
	private ProfesorDAO profesorDAO;

	public ProfesorController() {
		this.profesorDAO = new ProfesorDAO();
	}

	public void agregarProfesor(Profesor profesor) {
		profesorDAO.agregarProfesor(profesor);
	}

	public List<Profesor> obtenerprofesor() {
		return profesorDAO.obtenerProfesor();
	}

	public void actualizarProfesor(Profesor profesor) {
		profesorDAO.actualizarProfesor(profesor);
	}

	public void eliminarProfesor(int idProfesor) {
		profesorDAO.eliminarProfesor(idProfesor);
	}
}
