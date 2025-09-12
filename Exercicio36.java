import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 36 - SOMA DE ÍMPARES EM INTERVALO ===");
        
        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();
        
        System.out.print("Digite o valor final: ");
        int valorFinal = scanner.nextInt();
        
        if (valorInicial > valorFinal) {
            System.out.println("Intervalo de valores inválido");
        } else {
            int soma = 0;
            
            for (int i = valorInicial; i <= valorFinal; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            
            System.out.println("Soma dos ímpares neste intervalo: " + soma);
        }
        
        scanner.close();
    }
}
