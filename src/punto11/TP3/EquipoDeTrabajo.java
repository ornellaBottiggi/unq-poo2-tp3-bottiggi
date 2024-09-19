package punto11.TP3;

import java.util.HashSet;
import java.util.Set;

public class EquipoDeTrabajo {
	private String nombreEquipo;
	private Set<Persona> integrantes; 
	
	public EquipoDeTrabajo(String nombreEquipo) {
        this.setNombreEquipo(nombreEquipo);
        this.integrantes = new HashSet<>();
    }
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
	}
	
	public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }
	
	public String getPromEdades() {

		float promedio = 0;
		for(Persona persona: integrantes) {
			
			int edadPersona = persona.getEdad();
			promedio = (promedio + edadPersona);
		}
		return ("Promedio de edad: " + (promedio/ integrantes.size()));
	}
	
	
	
}
