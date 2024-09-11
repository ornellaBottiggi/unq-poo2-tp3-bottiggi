package unq.poo2.tp3.bottiggi;

public class Multiplos {
	

	public int multiploSimultaneo(int x , int y) {
		int contadorDel000Al1 = 1000;
		while (contadorDel000Al1 >= 1) {
			if (contadorDel000Al1 % x == 0 && contadorDel000Al1 % y == 0) {
                return contadorDel000Al1;
			}
			contadorDel000Al1--;
		}
		return -1;
	}
}

