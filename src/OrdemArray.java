
import java.util.Arrays;
import java.util.Collections;

public class OrdemArray {
    public static void main(String[] args) {
        
        String[] nomes = {"Hello",  "world"};

        // Reverter a Array.
        Collections.reverse(Arrays.asList(nomes));

        // Imprimir a array revertida.
        System.out.println(Arrays.toString(nomes));        
    }

    
}
