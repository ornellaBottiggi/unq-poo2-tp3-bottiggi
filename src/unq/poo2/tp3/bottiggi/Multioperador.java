package unq.poo2.tp3.bottiggi;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumaDeArray(ArrayList<Integer> listaNros) {
		
		int suma = 0;
		for (int numero: listaNros) {
			suma = suma + numero;
		}
		return suma;
		
	}
	
	public int restaDeArray(ArrayList<Integer> listaNros) {
		
		int resta = 0;
		for (int numero: listaNros) {
			resta = resta - numero;
		}
		return resta;
		
	}

	public int multiplicadorDeArray(ArrayList<Integer> listaNros) {
	
	int multiplicador = 1;
	for (int numero: listaNros) {
		multiplicador = multiplicador * numero;
	}
	return multiplicador;
	
}
}
