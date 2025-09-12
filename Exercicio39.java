import java.util.Scanner;
import java.util.Random;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("=== EXERCÍCIO 39 - JOGO DE ADIVINHAÇÃO ===");
        
        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int tentativas = 0;
        int palpite;
        
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é menor que o número secreto.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é maior que o número secreto.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + "!");
                System.out.println("Número de tentativas: " + tentativas);
            }
            
        } while (palpite != numeroSecreto);
        
        scanner.close();
    }
}
