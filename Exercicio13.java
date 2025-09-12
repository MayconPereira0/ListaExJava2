import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 13 - NÚMEROS PARES DE 0 A N (CRESCENTE) ===");
        
        System.out.print("Digite um inteiro par positivo N: ");
        int n = scanner.nextInt();
        
        if (n > 0 && n % 2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, digite um número par positivo.");
        }
        
        scanner.close();
    }
}
