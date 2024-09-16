package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Punto4test {


	@Test
	void expresion1test() {
		Punto4 punto = new Punto4();
		int resultado = punto.expresion1();
		assertEquals(3,resultado);
	}
	
	/* NO SE PUEDE INVOCAR "STRING.LENGTH() PORQUE T ES NULL"
	 @Test
	void expresion2test() {
		Punto4 punto = new Punto4();
		int resultado = punto.expresion2();
		assertEquals("?",resultado);
	}
	*/
	
	@Test
	void expresion3test() {
		Punto4 punto = new Punto4();
		String resultado = punto.expresion3();
		assertEquals("1abc",resultado);
	}
	
	@Test
	void expresion4test() {
		Punto4 punto = new Punto4();
		String resultado = punto.expresion4();
		assertEquals("ABC",resultado);
	}

	@Test
	void expresion5test() {
		Punto4 punto = new Punto4();
		int resultado = punto.expresion5();
		assertEquals(4,resultado);
	}

	@Test
	void expresion6test() {
		Punto4 punto = new Punto4();
		int resultado = punto.expresion6();
		assertEquals(7,resultado);
	}
	
	@Test
	void expresion7test() {
		Punto4 punto = new Punto4();
		String resultado = punto.expresion7();
		assertEquals("il",resultado);
	}
	
	@Test
	void expresion8test() {
		Punto4 punto = new Punto4();
		boolean resultado = punto.expresion8();
		assertEquals(false,resultado);
	}
	
	@Test
	void expresion10test() {
		Punto4 punto = new Punto4();
		boolean resultado = punto.expresion10();
		assertEquals(true,resultado);
	}
}
