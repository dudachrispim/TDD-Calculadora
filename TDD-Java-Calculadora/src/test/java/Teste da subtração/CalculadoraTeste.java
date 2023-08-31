import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTesteSub {
    @Test
    public void shouldBeAbleToSubtractTwoNumbers() throws Exception {
        int a = 10;
        int b = 5;

        Calculadora calculadora = new Calculadora();
        int sub = calculadora.sub(a, b);

        assertEquals(5, sub);
    }


}
