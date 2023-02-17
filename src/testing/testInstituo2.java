package testing;


import modelo.javabean.Persona;
import modeloDao.Instituto;

public class testInstituo2 {

	public static void main(String[] args) {
	

	Instituto miInstituto = new Instituto();
	for (Persona ele : miInstituto.buscarTodas() ) {
		System.out.println(ele);
	}
	System.out.println();
	
	System.out.println("Buscar una persona por el nif: '21829342P'");
	System.out.println(miInstituto.buscarPersona("21829342P"));
	
	

	}
}
