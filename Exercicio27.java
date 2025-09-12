import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 27 - MAIOR E MENOR NÚMERO ===");
        
        System.out.print("Digite um número inteiro: ");
        int primeiro = scanner.nextInt();
        
        if (primeiro < 0) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            int maior = primeiro;
            int menor = primeiro;
            int numero;
            
            do {
                System.out.print("Digite outro número inteiro: ");
                numero = scanner.nextInt();
                
                if (numero >= 0) {
                    if (numero > maior) {
                        maior = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }
            } while (numero >= 0);
            
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
        
        scanner.close();
    }
}
