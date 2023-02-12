package testing;

import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class testPersona {

	public static void main(String[] args) {
		//Crea un objeto Profesor, un objeto Alumno y un objeto Administrativo.
		
		Profesor profesor1 = new Profesor("50394827H", "Javier", "Calle Pez", "660611850", "Programacion");
				
		Alumno alumno1 = new Alumno("53976554Q", "Maria López", "Calle Virgen María", "643879605", "1ºDAW");
				
		Administrativo admin1 = new Administrativo("23758990L", "Luis Miguel Nuñez", "Paseo del Paisaje", "657980765", "facturación");
				
		System.out.println();
		
		
		//Ejecutamos el metodo toString() de cada objeto.
		System.out.println(profesor1.toString());
		System.out.println(alumno1.toString());
		System.out.println(admin1.toString());
		
		System.out.println();
		
		//Ejecutamos el metodo trabajar() de cada objeto.
		System.out.println(profesor1.trabajar());
		System.out.println(alumno1.trabajar());
		System.out.println(admin1.trabajar());
		
		System.out.println();
		
		//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		System.out.println((alumno1).llamar(profesor1));
		
		System.out.println(); 
		
		//Ejecuta el método ponerNotas() del objeto Profesor.
		System.out.println(profesor1.ponerNotas());
		
		//Ejecuta el método hacerExamen() del objeto Alumno.
		System.out.println(((Alumno)alumno1).hacerExamen());
		
		//Ejecuta el método gestionarMatricula() del objeto Administrativo.
		System.out.println(((Administrativo)admin1).gestionarMatricula());
		
		 
	}
}
