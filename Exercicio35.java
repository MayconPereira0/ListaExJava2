import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 35 - SOMA DOS PRIMEIROS N NÚMEROS PRIMOS ===");
        
        System.out.print("Digite um inteiro não negativo n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Por favor, digite um número não negativo.");
        } else {
            int soma = 0;
            int contador = 0;
            int numero = 2;
            
            while (contador < n) {
                boolean ehPrimo = true;
                
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                
                if (ehPrimo) {
                    soma += numero;
                    contador++;
                }
                
                numero++;
            }
            
            System.out.println("A soma dos primeiros " + n + " números primos é: " + soma);
        }
        
        scanner.close();
    }
}
