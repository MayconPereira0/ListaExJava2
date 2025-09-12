import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 7 - MÉDIA DE 10 INTEIROS ===");
        
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º inteiro: ");
            int valor = scanner.nextInt();
            soma += valor;
        }
        
        double media = (double) soma / 10;
        System.out.println("A média dos 10 inteiros é: " + media);
        scanner.close();
    }
}
