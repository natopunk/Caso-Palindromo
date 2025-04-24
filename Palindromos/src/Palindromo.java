import java.text.Normalizer;

public class Palindromo {
    //metodo basico
    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
    //metodo mejorado
    public static boolean esPalindromoMejorado(String cadena) {
        if (cadena == null) return false;
        String sinTildes = Normalizer.normalize(cadena, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        String normalizada = sinTildes.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertida = new StringBuilder(normalizada).reverse().toString();
        return normalizada.equals(invertida);
    }
}

