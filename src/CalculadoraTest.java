import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        assertEquals(127, Calculadora.sumar(5, 122));
        assertEquals(14109, Calculadora.sumar(8431, 5678));
    }

    @Test
    void restar() {
        assertEquals(-117, Calculadora.restar(5, 122));
        assertEquals(2753, Calculadora.restar(8431, 5678));
    }

    @Test
    void multiplicar() {
        assertEquals(610, Calculadora.multiplicar(5, 122));
        assertEquals(-101172, Calculadora.multiplicar(8431, -12));
    }

    @Test
    void dividir() {
        assertEquals(-1.25, Calculadora.dividir(-5, 4));
        assertEquals(1053.75, Calculadora.dividir(8430, 8));
    }

    @Test
    void potencias() {
        assertEquals(625, Calculadora.potencias(-5, 4));
        assertEquals(2097152, Calculadora.potencias(8, 7));
    }
}