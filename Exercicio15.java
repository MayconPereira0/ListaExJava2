import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 15 - NÚMEROS ÍMPARES DE 1 A N (CRESCENTE) ===");
        
        System.out.print("Digite um inteiro ímpar positivo N: ");
        int n = scanner.nextInt();
        
        if (n > 0 && n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, digite um número ímpar positivo.");
        }
        
        scanner.close();
    }
}
