package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	 @Test
     public void testMultioperadorSuma() {
         Multioperador multioperador = new Multioperador();
         ArrayList<Integer> numerosArrayList = new ArrayList<Integer>();
         
         numerosArrayList.add(1);
         numerosArrayList.add(1);
         numerosArrayList.add(1);
         numerosArrayList.add(1);
         
         int resultado = multioperador.sumaDeArray(numerosArrayList);
         
         assertEquals(4, resultado);
	 }
	 
	 @Test
	 public void testMultioperadorResta() {
         Multioperador multioperador = new Multioperador();
         ArrayList<Integer> numerosArrayList = new ArrayList<Integer>();
         
         numerosArrayList.add(1);
         numerosArrayList.add(2);
         numerosArrayList.add(3);
         numerosArrayList.add(1);
         
         int resultado = multioperador.restaDeArray(numerosArrayList);
         
         assertEquals(-7, resultado);
	 }
	 
	 @Test
	 public void testMultioperadorMultiplicacion() {
         Multioperador multioperador = new Multioperador();
         ArrayList<Integer> numerosArrayList = new ArrayList<Integer>();
         
         numerosArrayList.add(2);
         numerosArrayList.add(2);
         numerosArrayList.add(2);
         numerosArrayList.add(2);
         
         int resultado = multioperador.multiplicadorDeArray(numerosArrayList);
         
         assertEquals(16, resultado);
	 }
}