
import java.util.Random;
import java.util.Scanner;
public class PedraPapelTesoura {
    public static void main(String[] args) throws InterruptedException { // Declara que o método pode lançar InterruptedException

        // Declaração da variável para armazenar a escolha do jogador
        String escolha;
        
        // Bloco try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner jogo = new Scanner(System.in)) {
            // Solicita ao jogador que escolha entre Pedra, Papel ou Tesoura
            System.out.print("Escolha: Pedra, Papel ou Tesoura): ");
            escolha = jogo.next(); // Quando declaranos uma variável dentro do Scanner ela só poder ser usada aqui, por isso declaramos ela fora,// Captura a entrada do jogador
        }

        // Array contendo as opções possíveis para o computador
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Gera uma escolha aleatória para o computador
        String escolhaComputador = opcoes [new Random().nextInt(opcoes.length)];

        // Simula o computador "pensando" com um efeito de carregamento
        System.out.println("O oponente está escolhendo");
        for (byte i = 0; i < 3; i ++) { // Loop que executa 3 vezes
            Thread.sleep(1000); // Pausa o programa por 1 segundo
            System.out.print("."); // Imprime um ponto na mesma linha
        }

        // Exibe a escolha do computador após o "carregamento"
        System.out.println("\nO oponente escolheu: " + escolhaComputador);

        // Verifica o resultado do jogo com base nas escolhas do jogador e do computador
        if (escolhaComputador.equals("Pedra") && escolha.equals("Tesoura")) {
            // Pedra vence Tesoura
            System.out.println("Você Perdeu.");
        } else if (escolhaComputador.equals("Papel") && escolha.equals("Tesoura")) {
            // Tesoura vence Papel
            System.out.println("Você Ganhou.");
        } else if (escolhaComputador.equals("Pedra") && escolha.equals("Papel")) {
            // Papel vence Pedra
            System.out.println("Você Ganhou.");
        } else if (escolhaComputador.equals("Tesoura") && escolha.equals("Papel")) {
            // Tesoura vence Papel
            System.out.println("Você Perdeu.");
        } else if (escolhaComputador.equals("Papel") && escolha.equals("Pedra")) {
            // Papel vence Pedra
            System.out.println("Você Perdeu.");
        } else if (escolhaComputador.equals("Tesoura") && escolha.equals("Pedra")) {
            // Pedra vence Tesoura
            System.out.println("Você Ganhou."); 
        } else if (escolhaComputador.equals(escolha)) {
            // Caso as escolhas sejam iguais, é um empate
            System.out.println("Empate");
        } else {
            // Caso o jogador insira algo inválido
            System.out.println("Escolha inválida.");
        }
    }
}
