import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 22 - SOMA DOS DIVISORES ===");
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            int soma = 0;
            System.out.print("Divisores de " + numero + " (exceto ele mesmo): ");
            
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma += i;
                    System.out.print(i);
                    if (i < numero / 2) {
                        System.out.print(" + ");
                    }
                }
            }
            
            System.out.println(" = " + soma);
        } else {
            System.out.println("Por favor, digite um número positivo.");
        }
        
        scanner.close();
    }
}
