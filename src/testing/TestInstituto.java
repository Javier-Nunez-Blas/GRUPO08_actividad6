package testing;


import modelo.javabean.Persona;
import modeloDao.InstitutoDao;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class TestInstituto {

	public static void main(String[] args) {
		
		InstitutoDao miInstituto = new InstitutoDao();
		
		System.out.println("Buscar una persona con el nif '23934383G' ");
		
		for (Persona persona: miInstituto.buscarPersona("23934383G")) {
			System.out.println(persona);
		}
	}

}
