package testing;

import modeloDao.Instituto;

public class TestBuscar {

	public static void main(String[] args) {		
		
		Instituto instituto = new Instituto();
	
		//  Buscamos por el tipo de persona
        System.out.println("Buscamos a las personas que sean profesores:");
        System.out.println(instituto.buscarPersonaPorTipo("profesor"));
        System.out.println("");

        System.out.println("Buscamos a las personas que sean alumnos:");
        System.out.println(instituto.buscarPersonaPorTipo("alumno"));

        System.out.println("");
        System.out.println("Buscamos a las personas que sean administrativos:");
        System.out.println(instituto.buscarPersonaPorTipo("administrativo"));
		
		
	}

}
