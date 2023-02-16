package testing;

import modelo.javabean.Administrativo;
import modeloDao.Instituto;
import modelo.javabean.Alumno;
import modelo.javabean.Persona;
import modelo.javabean.Profesor;

public class TestInstituto {

	public static void main(String[] args) {
		
		Instituto miInstituto = new Instituto();
		
		System.out.println("Añadir un alumno, un profesor y un administrativo");
		
		Alumno alumno3 = new Alumno("20349293S", "Pedro", "Calle Roble 4", "650238473", "1ºDAW");
		Profesor prof3 = new Profesor("32849323H", "Juanita", "Calle Quejigo 12", "654833402", "Entornos");
		Administrativo adm3 = new Administrativo("83437256H", "Lolo", "Calle Melojo 8", "702349387", "Contabilidad");
		
		System.out.println(miInstituto.altaPersona(alumno3));
		System.out.println(miInstituto.altaPersona(adm3));
		System.out.println(miInstituto.altaPersona(prof3));
			for (Persona ele : miInstituto.buscarTodas() ) {
				System.out.println(ele);
			}
	
		System.out.println("Eliminar una persona");
		System.out.println(miInstituto.eliminarPersonas(alumno3));
				for(Persona ele: miInstituto.buscarTodas()) {
				System.out.println(ele);
				}
			
			
			
	}
	
	

}
