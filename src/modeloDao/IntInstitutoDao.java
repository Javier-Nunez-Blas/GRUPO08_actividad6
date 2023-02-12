package modeloDao;

import java.util.List;

import modelo.javabean.Persona;

public interface IntInstitutoDao {
	

	//Metemos los datos del interface
	
	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	List<Persona> buscarTodas();
	boolean eliminarPersonas(Persona persona);
	List<Persona> buscarPersonaPorTipo(String tipoPersona);
	
	
	

}
