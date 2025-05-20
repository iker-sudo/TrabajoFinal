package TrabajoFinal;

public class Profesor {
	private int idProfesor;
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String telefono;

	public Profesor() {
		super();
	}

	// Constructor
	public Profesor(int idProfesor, String nombre, String apellido, String correoElectronico, String telefono) {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
	}

	// Getters y setters
	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Profesores [idProfesor=" + idProfesor + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + "]";
	}
}
