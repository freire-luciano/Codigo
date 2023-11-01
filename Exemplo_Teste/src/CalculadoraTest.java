import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora c1 = new Calculadora(); 
        assertEquals(4.0, c1.soma(2,2), 0.1); 
    }

   }
