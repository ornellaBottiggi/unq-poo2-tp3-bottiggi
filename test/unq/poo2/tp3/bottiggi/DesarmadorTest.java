package unq.poo2.tp3.bottiggi;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTest {

        @Test
        public void testNumeroConMasCantDeDigitosParesPositivos() {
            DesarmadorDeNumeros desarmador = new DesarmadorDeNumeros();

            List<Integer> numeros = Arrays.asList(1234, 2468, 1357, 999, 22222);
            
            int resultado = desarmador.numeroConMasCantDeDigitosPares(numeros);
            
            assertEquals(22222, resultado);
        
    
}
        @Test
        public void testNumeroConMasCantDeDigitosParesNegativos() {
            DesarmadorDeNumeros desarmador = new DesarmadorDeNumeros();

            List<Integer> numeros = Arrays.asList(-1234, -2468, -1357, -999, -22222);
            
            int resultado = desarmador.numeroConMasCantDeDigitosPares(numeros);
            
            assertEquals(-22222, resultado);
        
    
}
}