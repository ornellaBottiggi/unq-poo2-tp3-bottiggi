package unq.poo2.tp3.bottiggi;
/*PUNTO 1*/

import java.util.ArrayList;
import java.util.List;

public class Counter {

		private List<Integer> ns;

		public Counter() {
			this.ns = new ArrayList<Integer>();
		}
		
		public void addNumber (int x) {
			this.ns.add(x);
		}
		
		public int cantidadDePares() {
			
			int contadorPar = 0;
			
			for (int numero: ns) {
				 if (numero % 2 == 0) {
					contadorPar++; 
			}
		
		}
			return contadorPar;
		}
		public int cantidadDeImpares() {
			
			int contadorImpar = 0;
			
			for (int numero: ns) {
				 if (numero % 2 != 0) {
					contadorImpar++; 
				 }
			}
			return contadorImpar ;
		}
		public int cantidadDeMultiplos(int numeroDivisor) {
						
			int contadorMultiplos = 0;
						
			for (int numero: ns) {
				if (numero % numeroDivisor == 0) {
					contadorMultiplos++; 
				}
			}
			return contadorMultiplos ;
		}
}