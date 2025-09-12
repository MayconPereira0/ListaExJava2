import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 30 - BUSCA EM VETOR ===");
        
        int[] vetor = new int[10];
        
        // Preencher o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor do vetor: ");
            vetor[i] = scanner.nextInt();
        }
        
        // Buscar valor
        System.out.print("Digite um valor para buscar no vetor: ");
        int valorBusca = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == valorBusca) {
                System.out.println("Valor " + valorBusca + " encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Valor " + valorBusca + " não encontrado no vetor.");
        }
        
        scanner.close();
    }
}
