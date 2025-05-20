package TrabajoFinal;

public class Estudiante {
	private int idEstudiante;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String correoElectronico;
	private String telefono;

	public Estudiante() {
		super();
	}

	// Constructor
	public Estudiante(int idEstudiante, String nombre, String apellido, String fechaNacimiento,
			String correoElectronico, String telefono) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
	}

	// Getters y setters
	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", correoElectronico=" + correoElectronico + ", telefono="
				+ telefono + "]";
	}
}