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

	//toString 

	@Override
	public String toString() {
		return "Alumno [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()=" + getDireccion()
				+ ", getTelefono()=" + getTelefono() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", curso=" + curso + "]";

	}
	//implemento métodos abstractos de mi padre y los redefino
	@Override
	public String trabajar() {
		return "El alumno " + getNombre() + " va a estudidar para el curso " + curso;
	}



	//métodos propios
	public String hacerExamen() {
		return "El alumno " + getNombre() + " va a hacer su exámen. ";
	}
}
