package TrabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class Clase {
	private int idClase;
	private List<Estudiante> estudiantes;
	private List<Profesor> profesores;

	public Clase() {
		super();
		this.estudiantes = new ArrayList<>();
		this.profesores = new ArrayList<>();
	}

	// Constructor
	public Clase(int idClase, List<Estudiante> estudiantes, List<Profesor> profesores) {
		super();
		this.idClase = idClase;
		this.estudiantes = estudiantes;
		this.profesores = profesores;
	}

	// Getters y setters
	public int getIdClase() {
		return idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	// Métodos para agregar estudiantes y profesores
	public boolean agregarEstudiante(Estudiante estudiante) {
		return estudiantes.add(estudiante);
	}

	public boolean agregarProfesor(Profesor profesor) {
		return profesores.add(profesor);
	}

	@Override
	public String toString() {
		return "Clase [idClase=" + idClase + ", estudiantes=" + estudiantes + ", profesores=" + profesores + "]";
	}
}