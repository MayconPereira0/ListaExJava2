import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 37 - RESISTÊNCIA EM PARALELO ===");
        
        double r1, r2;
        
        do {
            System.out.print("Digite o valor de R1 (0 para sair): ");
            r1 = scanner.nextDouble();
            
            if (r1 == 0) {
                break;
            }
            
            System.out.print("Digite o valor de R2 (0 para sair): ");
            r2 = scanner.nextDouble();
            
            if (r2 == 0) {
                break;
            }
            
            if (r1 > 0 && r2 > 0) {
                double resistenciaEquivalente = (r1 * r2) / (r1 + r2);
                System.out.println("Resistência equivalente: " + resistenciaEquivalente + " ohms");
            } else {
                System.out.println("Valores de resistência devem ser positivos.");
            }
            
        } while (true);
        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
