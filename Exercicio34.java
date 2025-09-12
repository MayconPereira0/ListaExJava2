import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 34 - VERIFICAÇÃO DE NÚMERO PRIMO ===");
        
        System.out.print("Digite um inteiro maior que 1: ");
        int numero = scanner.nextInt();
        
        if (numero <= 1) {
            System.out.println("Por favor, digite um número maior que 1.");
        } else {
            boolean ehPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
        
        scanner.close();
    }
}
