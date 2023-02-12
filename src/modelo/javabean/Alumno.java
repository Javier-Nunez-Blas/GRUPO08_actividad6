package modelo.javabean;

//heredo de la clase Profesor
public class Alumno extends Persona{

	private String curso;

	//mi constructor sin nada
	public Alumno() {
		super();
	}

	//constructor con todo
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	//getters & setters con todo
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	//toString (primero lo de mi padre y después lo mio)
	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", curso=" + curso + "]";
	}

	//implemento métodos abstractos de mi padre y los redefino
	@Override
	public String trabajar() {
		return "El alumno " + nombre + " va a estudidar para el curso " + curso;
	}

	//métodos propios
	public String hacerExamen() {
		return "El alumno " + nombre + " va a hacer su exámen. ";
	}
}
