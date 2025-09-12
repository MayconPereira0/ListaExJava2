import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 42 - CONTAGEM DE VOTOS ===");
        
        int[] votosCandidatos = new int[4]; // Candidatos 1, 2, 3, 4
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        int voto;
        
        System.out.println("Códigos dos candidatos:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Finalizar votação");
        
        do {
            System.out.print("Digite o código do voto: ");
            voto = scanner.nextInt();
            
            if (voto >= 1 && voto <= 4) {
                votosCandidatos[voto - 1]++;
                totalVotos++;
            } else if (voto == 5) {
                votosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                votosBrancos++;
                totalVotos++;
            } else if (voto != 0) {
                System.out.println("Código inválido!");
            }
            
        } while (voto != 0);
        
        // Exibir resultados
        System.out.println("\n=== RESULTADOS DA ELEIÇÃO ===");
        System.out.println("Votos para José (1): " + votosCandidatos[0]);
        System.out.println("Votos para João (2): " + votosCandidatos[1]);
        System.out.println("Votos para Maria (3): " + votosCandidatos[2]);
        System.out.println("Votos para Ana (4): " + votosCandidatos[3]);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosBrancos);
        
        if (totalVotos > 0) {
            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualBrancos = (double) votosBrancos / totalVotos * 100;
            
            System.out.println("Percentual de votos nulos: " + String.format("%.2f", percentualNulos) + "%");
            System.out.println("Percentual de votos em branco: " + String.format("%.2f", percentualBrancos) + "%");
        }
        
        scanner.close();
    }
}
