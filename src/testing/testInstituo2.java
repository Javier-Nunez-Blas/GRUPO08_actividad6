package testing;


import modeloDao.Instituto;

public class testInstituo2 {

	public static void main(String[] args) {
	

	Instituto miInstituto = new Instituto();

	System.out.println("Buscar una persona por el nif: '23934383G'");
	System.out.println(miInstituto.buscarPersona("23934383G"));
	

	}
}
