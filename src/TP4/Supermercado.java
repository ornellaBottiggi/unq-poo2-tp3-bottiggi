package TP4;

import java.util.HashSet;
import java.util.Set;

public class Supermercado {
	private String nombre;
	private String direccion;
	private Set<Producto> productos; 
	
	public Supermercado (String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.productos = new HashSet<>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeProductos() {

		return productos.size();
	}

	public void agregarProducto(Producto productoAAgregar) {
		productos.add(productoAAgregar);
	}

	public Double getPrecioTotal() {
		Double suma = 0d;
		for(Producto producto: productos) {
				
			double precioProducto = producto.getPrecio();
				
			suma = (suma + precioProducto);
		}
		return suma;
	}
	
	
	
	
	
}
