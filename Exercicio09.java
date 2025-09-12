import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 9 - MAIOR E MENOR VALOR ===");
        
        System.out.print("Digite o 1º número: ");
        double primeiro = scanner.nextDouble();
        double maior = primeiro;
        double menor = primeiro;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double valor = scanner.nextDouble();
            
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        scanner.close();
    }
}
