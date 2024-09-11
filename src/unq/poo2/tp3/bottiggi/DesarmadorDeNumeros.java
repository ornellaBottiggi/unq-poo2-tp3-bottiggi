package unq.poo2.tp3.bottiggi;

import java.util.List;

public class DesarmadorDeNumeros {
	
	public int contadorDePares(int numero) {
		
		numero = Math.abs(numero);
		int contadorPares = 0;
		while (numero > 0) {
			 int digito = numero % 10;
	            if (digito % 2 == 0) {
	                contadorPares++;
	            }
	            numero /= 10;
	        }
	        return contadorPares;
		}
	
	public int numeroConMasCantDeDigitosPares(List<Integer> listaNros) {
		
		int nroConMayorCantidad	= listaNros.get(0);	
		int cantParesMax = contadorDePares(listaNros.get(0));

		for (int numero: listaNros) {
		int paresActuales = this.contadorDePares(numero);
			 if (paresActuales > cantParesMax) {
				 cantParesMax = paresActuales;
				 nroConMayorCantidad = numero;
			 }
		}
		return nroConMayorCantidad;
	}
}
