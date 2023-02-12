package modelo.javabean;

import java.util.Objects;

public abstract class Persona {
//creamos la clase abstracta y las propiedades protected
	
	protected String nif;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	
	
	// constructor con todo
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	//constructor vacio
	public Persona() {
		super();
	}
	
	
	//getter and setter
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	
	//Equals and hascode solo de nif
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}


	//creamos los metodos
	public String llamar(Persona p) {
		return (p.nombre +" llamando a "+ getNombre() );
		
	}
	
	abstract String trabajar();
	
	
}
