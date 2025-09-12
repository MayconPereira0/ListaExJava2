import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 12 - NÚMEROS NATURAIS DE 0 A N ===");
        
        System.out.print("Digite um inteiro positivo N: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, digite um número positivo.");
        }
        
        scanner.close();
    }
}
