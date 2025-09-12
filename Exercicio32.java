import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 32 - CONTADOR DE CONSOANTES ===");
        
        char[] vetor = new char[10];
        int contadorConsoantes = 0;
        String consoantes = "";
        
        // Ler 10 caracteres
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            vetor[i] = scanner.next().charAt(0);
            
            char c = Character.toLowerCase(vetor[i]);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contadorConsoantes++;
                consoantes += vetor[i] + " ";
            }
        }
        
        System.out.println("Quantidade de consoantes: " + contadorConsoantes);
        System.out.println("Consoantes encontradas: " + consoantes);
        
        scanner.close();
    }
}
