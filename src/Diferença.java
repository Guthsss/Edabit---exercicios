
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Diferença { // Declaração da classe principal
    public static void main(String[] args) { // Método principal, ponto de entrada do programa

        // Lê quatro valores inteiros chamados A, B, C e D. Calcula e imprime a diferença do produto de A e B pelo produto de C e D (A * B - C * D).
        
        try (Scanner diferenca = new Scanner(System.in)) { // Cria um objeto Scanner para capturar a entrada do usuário

            System.out.print("Digite valor para A: "); // Solicita ao usuário o valor de A
            byte a = diferenca.nextByte(); // Lê o valor de A como um byte

            System.out.print("Digite valor para B: "); // Solicita ao usuário o valor de B
            byte b = diferenca.nextByte(); // Lê o valor de B como um byte

            System.out.print("Digite valor para C: "); // Solicita ao usuário o valor de C
            byte c = diferenca.nextByte(); // Lê o valor de C como um byte

            System.out.print("Digite valor para D: "); // Solicita ao usuário o valor de D
            byte d = diferenca.nextByte(); // Lê o valor de D como um byte

            // Calcula a diferença entre o produto de A e B e o produto de C e D

            int x = (a * b) - (c * d);

            // Exibe o resultado da diferença calculada

            System.out.println(x);
        } // O bloco try-with-resources fecha automaticamente o Scanner após o uso
    }
}
