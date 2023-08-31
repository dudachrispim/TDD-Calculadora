package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
	@Test
    public void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(30, calc.multiplicacao(5, 6));
    }

	@Test
    public void testDiviso(){
      Calculadora calc = new Calculadora();
        assertEquals(20, calc.divisao(100,5));
    }
}
