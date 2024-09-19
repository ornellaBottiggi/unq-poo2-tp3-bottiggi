package unq.poo2.tp3.bottiggi;

import java.util.Date;

public class Persona {
	private String nombre;
	private Date fechaDeNacimiento;
	
	
		public Persona(String nombre, Date fechaDeNacimiento) {
			this.setNombre(nombre);
			this.setFechaDeNacimiento(fechaDeNacimiento);
		}


		public Date getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}


		public void setFechaDeNacimiento(Date fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
