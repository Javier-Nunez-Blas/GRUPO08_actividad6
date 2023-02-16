package modeloDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;


public class Instituto implements IntInstitutoDao{
	
	private List<Persona> personas;
	
	public Instituto() {
		personas = new ArrayList<>();
		cargarDatos();
	}
		
	private void cargarDatos() {
		
		Alumno alum1 = new Alumno("23934383G","Javier", "Calle pino 5", "662382393", "1ºDaw");
		Alumno alum2 = new Alumno("50238293D","Luis", "Calle Abeto 12", "753402934", "1ºDaw");
		Profesor prof1 = new Profesor("34045923L", "Tomas","Call Tejo 9", "640392392", "Programacion");
		Profesor prof2 = new Profesor("21829342P", "Maria","Call Tilo 32", "660283492", "BBDD");
		Administrativo adm1 = new Administrativo("34958434L", "Pedro", "Calle Acebo 34", "660349239", "Contabilidad");
		Administrativo adm2 = new Administrativo("93822391H", "Ana", "Calle Sauce 4", "782039251", "Recursos humanos");
		
		personas.add(prof2);
		personas.add(prof1);
		personas.add(alum1);
		personas.add(alum2);
		personas.add(adm1);
		personas.add(adm2);
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
		Instituto other = (Instituto) obj;
		return Objects.equals(personas, other.personas);
	}

	@Override
	public boolean altaPersona(Persona persona) {
		if(personas.contains(persona))
			return false;
			else
			return personas.add(persona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		Alumno alumno = new Alumno();
		alumno.setNif(nif);

		int posicion = personas.indexOf(alumno);
		if (posicion == -1)
			return null;
		return personas.get(posicion);
		
	}

	@Override
	public List<Persona> buscarTodas() {
		return personas;
	}

	@Override
	public boolean eliminarPersonas(Persona persona) {
			return personas.remove(persona);
	}

	@Override

    public ArrayList<Persona> buscarPersonaPorTipo(String tipoPersona) {
       switch (tipoPersona) {
           case "profesor":
               ArrayList<Persona> profesores = new ArrayList<>();
               for (Persona persona: this.personas){
                   if(persona instanceof Profesor){
                       profesores.add(persona);
                   }
               }

               return profesores;
           case "alumno":
               ArrayList<Persona> alumnos = new ArrayList<>();
               for (Persona persona: this.personas){
                   if(persona instanceof Alumno){
                       alumnos.add(persona);
                   }
               }

               return alumnos;
           case "administrativo":
               ArrayList<Persona> administrativos = new ArrayList<>();
               for (Persona persona: this.personas){
                   if(persona instanceof Administrativo){
                       administrativos.add(persona);
                   }
               }
               return administrativos;

           default:
               return null;
       }
    }

}
