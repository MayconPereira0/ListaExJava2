import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 43 - COMPETIÇÃO DE GINÁSTICA ===");
        
        System.out.print("Digite o nome do atleta: ");
        String nomeAtleta = scanner.nextLine();
        
        double[] notas = new double[7];
        double melhorNota = 0;
        double piorNota = 10;
        double soma = 0;
        
        // Ler as 7 notas
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            
            if (notas[i] > melhorNota) {
                melhorNota = notas[i];
            }
            if (notas[i] < piorNota) {
                piorNota = notas[i];
            }
            
            soma += notas[i];
        }
        
        // Calcular média (excluindo melhor e pior nota)
        double media = (soma - melhorNota - piorNota) / 5;
        
        // Exibir resultados
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Atleta: " + nomeAtleta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + String.format("%.2f", media));
        
        scanner.close();
    }
}
