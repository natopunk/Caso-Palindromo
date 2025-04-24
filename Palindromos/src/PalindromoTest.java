import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    // Pruebas para el metodo basico

    @Test
    public void testSimplePalindromo() {
        assertTrue(Palindromo.esPalindromo("aca"));
        assertTrue(Palindromo.esPalindromo("reconocer"));
    }

    @Test
    public void testNoPalindromo() {
        assertFalse(Palindromo.esPalindromo("acas"));
        assertFalse(Palindromo.esPalindromo("hola"));
    }

    @Test
    public void testUnCaracter() {
        assertTrue(Palindromo.esPalindromo("h"));
    }

    @Test
    void testCadenaVacia() {
        assertTrue(Palindromo.esPalindromo(""));
    }

    // Pruebas para el metodo mejorado

    @Test
    void testFraseMejorada() {
        assertTrue(Palindromo.esPalindromoMejorado("La tele letal"));
        assertTrue(Palindromo.esPalindromoMejorado("Anita lava la tina"));
        assertTrue(Palindromo.esPalindromoMejorado("A mamá Roma le aviva el amor a mamá"));
    }

    @Test
    void testFraseNoPalindroma() {
        assertFalse(Palindromo.esPalindromoMejorado("ahabccbaaa"));
        assertFalse(Palindromo.esPalindromoMejorado("No es un palindromo"));
    }

    @Test
    void testNumerosComoPalindromos() {
        assertTrue(Palindromo.esPalindromoMejorado("2002"));
        assertTrue(Palindromo.esPalindromoMejorado("12321"));
        assertFalse(Palindromo.esPalindromoMejorado("12345"));
    }

    @Test
    void testCaracteresEspeciales() {
        assertTrue(Palindromo.esPalindromoMejorado("¿Acaso hubo búhos acá?"));  // Típico ejemplo
    }

    @Test
    void testEntradaNull() {
        assertFalse(Palindromo.esPalindromoMejorado(null));
    }
}
