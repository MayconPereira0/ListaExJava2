import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 25 - EXPONENCIAÇÃO ===");
        
        System.out.print("Digite a base (x): ");
        int base = scanner.nextInt();
        
        System.out.print("Digite o expoente (y): ");
        int expoente = scanner.nextInt();
        
        if (expoente >= 0) {
            long resultado = 1;
            
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
            
            System.out.println(base + "^" + expoente + " = " + resultado);
        } else {
            System.out.println("Por favor, digite um expoente não negativo.");
        }
        
        scanner.close();
    }
}
