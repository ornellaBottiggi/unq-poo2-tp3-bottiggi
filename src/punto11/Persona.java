package punto11;


public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Persona(String nombre, String apellido, int edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
