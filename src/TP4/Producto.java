package TP4;

public class Producto {
	public String nombre;
	public double precio;
	public boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		double precioAntiguo = this.getPrecio();
		this.setPrecio(precioAntiguo + aumento);
	
		
	}
}

