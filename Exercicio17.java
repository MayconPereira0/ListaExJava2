import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 17 - MAIOR NÚMERO ===");
        
        System.out.print("Digite a quantidade de números a serem lidos: ");
        int quantidade = scanner.nextInt();
        
        if (quantidade > 0) {
            System.out.print("Digite o 1º número: ");
            double primeiro = scanner.nextDouble();
            double maior = primeiro;
            
            for (int i = 2; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = scanner.nextDouble();
                
                if (numero > maior) {
                    maior = numero;
                }
            }
            
            System.out.println("O maior número é: " + maior);
        } else {
            System.out.println("Por favor, digite uma quantidade positiva.");
        }
        
        scanner.close();
    }
}
