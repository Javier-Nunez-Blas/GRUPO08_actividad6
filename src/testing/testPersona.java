package testing;

import modelo.javabean.Profesor;

public class testPersona {

	public static void main(String[] args) {
		//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		
		Profesor profesor = new Profesor("50394827H", "Javier", "Calle Pez", "660611850", "Programacion");
		
		
		
		//Ejecutamos el metodo toString() de cada objeto.
		
		System.out.println(profesor.toString());
		
		
		//Ejecutamos el metodo trabajar() de cada objeto.
		
		System.out.println(profesor.trabajar());
		
		
		//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		
		//System.out.println(alumno.llamar(profesor));
		
		
		
		//Ejecuta el método ponerNotas() del objeto Profesor.
		
		System.out.println(profesor.ponerNotas());
		
		
		
		//Ejecuta el método hacerExamen() del objeto Alumno.
		
		
		
		//Ejecuta el método gestionarMatricula() del objeto Administrativo.
		
		
		 
	}
}
