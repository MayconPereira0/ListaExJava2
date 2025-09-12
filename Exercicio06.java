import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 6 - SOMA DE 10 VALORES ===");
        
        double soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
        }
        
        System.out.println("A soma dos 10 valores é: " + soma);
        scanner.close();
    }
}
