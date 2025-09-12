import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 16 - SOMA DOS PRIMEIROS N NÚMEROS NATURAIS ===");
        
        System.out.print("Digite um inteiro positivo n: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            int soma = 0;
            for (int i = 1; i <= n; i++) {
                soma += i;
            }
            System.out.println("A soma dos primeiros " + n + " números naturais é: " + soma);
        } else {
            System.out.println("Por favor, digite um número positivo.");
        }
        
        scanner.close();
    }
}
