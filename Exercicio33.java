import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 33 - MÉDIAS DE ESTUDANTES ===");
        
        double[] medias = new double[10];
        int alunosAprovados = 0;
        
        // Calcular média de cada estudante
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudante " + (i + 1) + ":");
            double soma = 0;
            
            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a " + j + "ª nota: ");
                double nota = scanner.nextDouble();
                soma += nota;
            }
            
            medias[i] = soma / 4;
            
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }
        
        System.out.println("Número de estudantes com média >= 7.0: " + alunosAprovados);
        
        scanner.close();
    }
}
