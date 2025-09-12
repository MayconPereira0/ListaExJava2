import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 19 - CONTAR PARES E ÍMPARES ===");
        
        int totalLidos = 0;
        int pares = 0;
        int numero;
        
        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                totalLidos++;
                if (numero % 2 == 0) {
                    pares++;
                }
            }
        } while (numero != 0);
        
        System.out.println("Total de números lidos: " + totalLidos);
        System.out.println("Quantidade de números pares: " + pares);
        
        scanner.close();
    }
}
