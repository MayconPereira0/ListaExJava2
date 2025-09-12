import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 29 - SOMA DE 5 NÚMEROS ===");
        
        double[] numeros = new double[5];
        double soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("Os números digitados foram:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        
        scanner.close();
    }
}
