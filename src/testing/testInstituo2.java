package testing;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modeloDao.Instituto;

public class testInstituo2 {

	public static void main(String[] args) {
	
	Instituto miInstituto = new Instituto();
	Persona alumno, administrativo, profesor;
	

	System.out.println("Buscar una persona por el nif: '23934383G'");
	System.out.println(miInstituto.buscarPersona("23934383G"));
	
	for (Persona persona: miInstituto.buscarPersonaPorTipo(alumno)) {
		System.out.println(miInstituto);
		}

	}
}
