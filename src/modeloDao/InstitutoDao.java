package modeloDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;


public class InstitutoDao implements IntInstitutoDao{
	
	private ArrayList<Persona> personas;
	
	public InstitutoDao() {
		personas = new ArrayList<>();
		cargarDatos();
	}
		
	private void cargarDatos() {
		
		Alumno alum1 = new Alumno("23934383G","Javier", "Calle pino 5", "662382393", "1ºDaw");
		Alumno alum2 = new Alumno("50238293D","Luis", "Calle Abeto 12", "753402934", "1ºDaw");
		Profesor prof1 = new Profesor("34045923L", "Tomas","Call Tejo 9", "640392392", "Programacion");
		Profesor prof2 = new Profesor("21829342P", "Maria","Call Tilo 32", "660283492", "BBDD");
		
		personas.add(prof2);
		personas.add(prof1);
		personas.add(alum1);
		personas.add(alum2);
	}		

	
	@Override
	public int hashCode() {
		return Objects.hash(personas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InstitutoDao other = (InstitutoDao) obj;
		return Objects.equals(personas, other.personas);
	}

	@Override
	public boolean altaPersona(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona buscarPersona(String nif) {
		Persona persona1 = new Persona();
		
			persona1.setNif(nif);
		
			int posicion = personas.indexOf(persona1);
			if (posicion == -1) {
				return null;}
			return personas.get(posicion);
		
	}

	@Override
	public List<Persona> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPersonas(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
