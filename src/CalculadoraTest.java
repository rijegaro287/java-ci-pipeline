import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    public void sumar() {
        assertEquals(127, Calculadora.sumar(5, 122), 0);
        assertEquals(14109, Calculadora.sumar(8431, 5678),0);
    }
    @Test
    public void restar() {
        assertEquals(-117, Calculadora.restar(5, 122),0);
        assertEquals(2753, Calculadora.restar(8431, 5678),0);
    }
    @Test
    public void multiplicar() {
        assertEquals(610, Calculadora.multiplicar(5, 122),0);
        assertEquals(-101172, Calculadora.multiplicar(8431, -12),0);
    }
    @Test
    public void dividir() {
        assertEquals(-1.25, Calculadora.dividir(-5, 4),0);
        assertEquals(1053.75, Calculadora.dividir(8430, 8),0);
    }
    @Test
    public void potencias() {
        assertEquals(625, Calculadora.potencias(-5, 4),0);
        assertEquals(2097152, Calculadora.potencias(8, 7),0);
    }
}