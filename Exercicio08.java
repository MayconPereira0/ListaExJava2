import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 8 - MÉDIA DE 10 INTEIROS POSITIVOS ===");
        
        int soma = 0;
        int contador = 0;
        
        while (contador < 10) {
            System.out.print("Digite um inteiro positivo: ");
            int valor = scanner.nextInt();
            
            if (valor > 0) {
                soma += valor;
                contador++;
            } else {
                System.out.println("Valor ignorado (não é positivo)");
            }
        }
        
        double media = (double) soma / 10;
        System.out.println("A média dos 10 inteiros positivos é: " + media);
        scanner.close();
    }
}
