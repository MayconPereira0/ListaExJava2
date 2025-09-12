import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 21 - MÉDIA DE NOTAS VÁLIDAS ===");
        
        double soma = 0;
        int contador = 0;
        double nota;
        
        do {
            System.out.print("Digite uma nota (0-10): ");
            nota = scanner.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }
        } while (nota >= 0 && nota <= 10);
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média das notas válidas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }
        
        scanner.close();
    }
}
