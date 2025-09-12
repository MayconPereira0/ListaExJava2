import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 38 - PROPRIEDADES DE NÚMEROS ===");
        
        double numero;
        
        do {
            System.out.print("Digite um número (negativo ou zero para sair): ");
            numero = scanner.nextDouble();
            
            if (numero > 0) {
                double quadrado = numero * numero;
                double cubo = numero * numero * numero;
                double raizQuadrada = Math.sqrt(numero);
                
                System.out.println("Número: " + numero);
                System.out.println("Quadrado: " + quadrado);
                System.out.println("Cubo: " + cubo);
                System.out.println("Raiz quadrada: " + raizQuadrada);
                System.out.println();
            }
            
        } while (numero > 0);
        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
