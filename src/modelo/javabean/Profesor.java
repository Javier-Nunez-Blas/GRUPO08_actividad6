package modelo.javabean;
public class Profesor extends Persona{

	private String competencias;

	
	//Costrutor sin nada.
	public Profesor() {
		super();
	}
	//Constructor con el super y añadendo "competencias".
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}
	
	//Getter and setter de competencia.
	public String getCompetencias() {
		return competencias;
	}
	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	//to string, poniendo primero los que hereda y luego los porpios.
	@Override
	public String toString() {
		return "Profesor [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", competencias=" + competencias + "]";
	}
	
	//implementamos los metodos heredados
	@Override
	public String trabajar() {
		return "El profesor "+ nombre + " va a impartir su clase";
		
	}
	
	//Creamos los metodos propios
	
	public String ponerNotas() {
		return ("El profesor " + nombre +" va a corregir los exámenes");
	}
	
	
	

	

	
	
	

}
