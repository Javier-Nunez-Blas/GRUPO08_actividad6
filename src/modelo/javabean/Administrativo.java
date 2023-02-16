package modelo.javabean;

//creamos la clase y hacemos que herede de la clase persona
public class Administrativo extends Persona{

//definimos los atributos	
	private String tarea;

	
//Creamos los constructores cn todo y otro vacio

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tarea) {
		super(nif, nombre, direccion, telefono);
		this.tarea = tarea;
	}
	
	
	public Administrativo() {
		super();
	
	}


	//definimos los metodods getter & setter
	public String getTarea() {
		return tarea;
	}



	//sobrescribimos el metodo toString

		@Override
		public String toString() {
			return "Administrativo [getNif()=" + getNif() + ", getNombre()=" + getNombre() + ", getDireccion()="
					+ getDireccion() + ", getTelefono()=" + getTelefono() + ", tarea=" + tarea + "]";
		}
		
//Metodos propios
		
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public String gestionarMatricula(){
		return "el adminitrador " + getNombre() + "  va a gestionar una matricula";
	}

	@Override
	public String trabajar() {
		return "el administrativo " + getNombre() + " va a realizar estas tareas " + this.tarea;
	}



}
