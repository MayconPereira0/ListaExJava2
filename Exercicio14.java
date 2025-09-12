import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 14 - NÚMEROS PARES DE 0 A N (DECRESCENTE) ===");
        
        System.out.print("Digite um inteiro par positivo N: ");
        int n = scanner.nextInt();
        
        if (n > 0 && n % 2 == 0) {
            for (int i = n; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, digite um número par positivo.");
        }
        
        scanner.close();
    }
}
