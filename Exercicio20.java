import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 20 - SOMA DE PARES E MULTIPLICAÇÃO DE ÍMPARES ===");
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);
        
        int somaPares = 0;
        long multiplicacaoImpares = 1;
        
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                multiplicacaoImpares *= i;
            }
        }
        
        System.out.println("Soma dos números pares no intervalo: " + somaPares);
        System.out.println("Multiplicação dos números ímpares no intervalo: " + multiplicacaoImpares);
        
        scanner.close();
    }
}
