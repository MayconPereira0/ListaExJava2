import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 24 - MÉDIA DE IDADES ===");
        
        int soma = 0;
        int contador = 0;
        int idade;
        
        do {
            System.out.print("Digite uma idade (0 para sair): ");
            idade = scanner.nextInt();
            
            if (idade > 0) {
                soma += idade;
                contador++;
            } else if (idade < 0) {
                System.out.println("Por favor, digite uma idade válida.");
            }
        } while (idade != 0);
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }
        
        scanner.close();
    }
}
