import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 18 - SEPARAR DÍGITOS ===");
        
        System.out.print("Digite um inteiro entre 100 e 9999: ");
        int numero = scanner.nextInt();
        
        if (numero >= 100 && numero <= 9999) {
            String numeroStr = String.valueOf(numero);
            System.out.println("Os dígitos do número são:");
            
            for (int i = 0; i < numeroStr.length(); i++) {
                System.out.println(numeroStr.charAt(i));
            }
        } else {
            System.out.println("Por favor, digite um número entre 100 e 9999.");
        }
        
        scanner.close();
    }
}
