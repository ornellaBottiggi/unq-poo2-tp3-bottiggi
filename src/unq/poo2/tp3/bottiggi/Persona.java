package unq.poo2.tp3.bottiggi;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	
		public Persona(String nombre, LocalDate fechaDeNacimiento) {
			this.setNombre(nombre);
			this.setFechaDeNacimiento(fechaDeNacimiento);
		}


		public LocalDate getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}


		public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getEdad() { 
		// no se conoce como se obtiene este resultado gracias al encapsulamiento..
			
			        LocalDate fechaActual = LocalDate.now();
			        
			        Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);
			        
			        return periodo.getYears();
		}
		
		public boolean menorQue (Persona persona) {
			
			int edadPersona = persona.getEdad();
			
			return (this.getEdad() < edadPersona);
		}
}

		

