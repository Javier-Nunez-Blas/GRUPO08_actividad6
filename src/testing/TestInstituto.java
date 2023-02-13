package testing;


import modeloDao.InstitutoDao;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;
import modelo.javabean.Persona;

public class TestInstituto {

	public static void main(String[] args) {
		
		InstitutoDao miInstituto = new InstitutoDao();
		
		System.out.println("Añadir una persona, 'alumno3'");
		
		Alumno alumno3 = new Alumno("20349293S", "Pedro", "Calle Arce 4", "695600867", "1ºDAW");
		
		System.out.println(miInstituto.altaPersona(alumno3));
			for (Persona ele : miInstituto.buscarTodas() ) {
				System.out.println(ele);
			}
		System.out.println("Buscar una persona por el nif: '20349293S'");
		System.out.println(miInstituto.buscarPersona("20349293S"));
		
		System.out.println("Eliminar una persona");
		System.out.println(miInstituto.eliminarPersonas(alumno3));
			for(Persona ele: miInstituto.buscarTodas()) {
			System.out.println(ele);
			}
	}
	
	

}
