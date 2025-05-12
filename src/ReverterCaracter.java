
import java.util.Arrays;

public class ReverterCaracter {
    public static void main(String[] args) {
        
        
        String[] nomes = {"Hello", "World"};

        // Reverter cada caracter dentro da Array.
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = new StringBuilder(nomes[i]).reverse().toString();
        }

        // Imprimir a array com os caracteres revertidos
        System.out.println(Arrays.toString(nomes));
    }
}
