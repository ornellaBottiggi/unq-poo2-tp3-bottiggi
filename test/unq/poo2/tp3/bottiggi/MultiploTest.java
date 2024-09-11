package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {


        @Test
        public void testNumeroMultiploSimultaneo() {
           
        	Multiplos multiplo = new Multiplos();
            
            int resultado = multiplo.multiploSimultaneo(3 , 9);
            
            assertEquals(999, resultado);
        
    
}

}
