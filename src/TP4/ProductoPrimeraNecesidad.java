package TP4;

public class ProductoPrimeraNecesidad extends Producto {

	 public ProductoPrimeraNecesidad(String nombre, double precio) {
	        super(nombre, precio);
	    }

	    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
	        super(nombre, precio, esPrecioCuidado);
	    }


	    @Override
	    public double getPrecio() {
	    	return precio * 0.9; 
	    }
}
