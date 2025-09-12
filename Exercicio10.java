import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 10 - PRIMEIROS N NÚMEROS ÍMPARES ===");
        
        System.out.print("Digite um inteiro N: ");
        int n = scanner.nextInt();
        
        int contador = 0;
        int numero = 1;
        
        while (contador < n) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
        
        scanner.close();
    }
}
