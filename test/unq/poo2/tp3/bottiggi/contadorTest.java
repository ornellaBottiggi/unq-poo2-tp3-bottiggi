package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class contadorTest {
	private Counter c ;
	
	@BeforeEach
	void setUp() throws Exception {
			c = new Counter();
			
			c.addNumber(1);
			c.addNumber(3);
			c.addNumber(5);
			c.addNumber(7);
			c.addNumber(9);
			c.addNumber(1);
			c.addNumber(1);
			c.addNumber(1);
			c.addNumber(1);
			c.addNumber(4);

	}

	@Test
	void testPares() {
			
			int amount = c.cantidadDePares();
			assertEquals(1, amount);

	}
	
	@Test
	void testImpares() {
			
			int amount = c.cantidadDeImpares();
			assertEquals(9, amount);

	}
	
	@Test
	void testMultiplos() {
			
			int amount = c.cantidadDeMultiplos(2);
			assertEquals(1, amount);

	}

}
