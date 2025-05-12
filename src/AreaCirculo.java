import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite o Raio: ");
            float R = scanner.nextFloat();

            double A = R*R * 3.14;

            System.out.println(A);
        }
    }
}