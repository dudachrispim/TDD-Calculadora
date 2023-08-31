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

    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();

        // Teste para 2 elevado a 3
        int base1 = 2;
        int expoente1 = 3;
        int resultado1 = calculadora.potencia(base1, expoente1);
        assertEquals(8, resultado1);

        // Teste para 5 elevado a 0 (qualquer número elevado a 0 é 1)
        int base2 = 5;
        int expoente2 = 0;
        int resultado2 = calculadora.potencia(base2, expoente2);
        assertEquals(1, resultado2);

        // Teste para 4 elevado a 2
        int base3 = 4;
        int expoente3 = 2;
        int resultado3 = calculadora.potencia(base3, expoente3);
        assertEquals(16, resultado3);
    }
}
