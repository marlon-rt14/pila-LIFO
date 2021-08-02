
package app;


public class Estudiante {
	
	private int IdEstudiante;
	private String nombreEstudiante;
	private String apellidoEstudiante;
	private int edadEstudiante;
	Estudiante siguienteEstudiante;

	public Estudiante(int IdEstudiante, String nombreEstudiante, String apellidoEstudiante, int edadEstudiante) {
		this.IdEstudiante = IdEstudiante;
		this.nombreEstudiante = nombreEstudiante;
		this.apellidoEstudiante = apellidoEstudiante;
		this.edadEstudiante = edadEstudiante;
		this.siguienteEstudiante = null;
	}

	public int getIdEstudiante() {
		return IdEstudiante;
	}

	public void setIdEstudiante(int IdEstudiante) {
		this.IdEstudiante = IdEstudiante;
	}

	public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public String getApellidoEstudiante() {
		return apellidoEstudiante;
	}

	public void setApellidoEstudiante(String apellidoEstudiante) {
		this.apellidoEstudiante = apellidoEstudiante;
	}

	public int getEdadEstudiante() {
		return edadEstudiante;
	}

	public void setEdadEstudiante(int edadEstudiante) {
		this.edadEstudiante = edadEstudiante;
	}

	public Estudiante getSiguienteEstudiante() {
		return siguienteEstudiante;
	}

	public void setSiguienteEstudiante(Estudiante siguienteEstudiante) {
		this.siguienteEstudiante = siguienteEstudiante;
	}
	
	
}
