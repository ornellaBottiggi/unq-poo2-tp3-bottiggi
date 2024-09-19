package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import punto11.EquipoDeTrabajo;
import punto11.Persona;

class Punto11Test {
	private EquipoDeTrabajo equipo;
	
	 @BeforeEach
	void setUp() throws Exception {
		 equipo = new EquipoDeTrabajo("Equipo de Prueba");
	}
	 
	 @Test
	 void testGetPromEdadesCon5Integrantes() {
	        Persona persona1 = new Persona("Juan", "Perez", 21);
	        Persona persona2 = new Persona("Ana", "Gomez", 23);
	        Persona persona3 = new Persona("Luis", "Martinez", 20);
	        Persona persona4 = new Persona("Jose", "Lopez", 23);
	        Persona persona5 = new Persona("Laura", "Diaz", 20);

	        equipo.agregarIntegrante(persona1);
	        equipo.agregarIntegrante(persona2);
	        equipo.agregarIntegrante(persona3);
	        equipo.agregarIntegrante(persona4);
	        equipo.agregarIntegrante(persona5);


	        assertEquals("Promedio de edad: 21.4", equipo.getPromEdades());
	    }

}
