import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 44 - ANÁLISE DE DADOS DA ACADEMIA ===");
        
        int idadeMaisVelha = 0;
        double alturaMaisAlto = 0;
        double maiorPeso = 0;
        double somaAltura = 0;
        double somaIMC = 0;
        int contadorMasculino = 0;
        int contadorFeminino = 0;
        
        // Coletar dados de 25 pessoas
        for (int i = 1; i <= 25; i++) {
            System.out.println("\nPessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Digite a altura (metros): ");
            double altura = scanner.nextDouble();
            
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();
            
            // Atualizar estatísticas
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }
            
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
            }
            
            if (peso > maiorPeso) {
                maiorPeso = peso;
            }
            
            somaAltura += altura;
            
            double imc = peso / (altura * altura);
            somaIMC += imc;
            
            if (sexo == 'M') {
                contadorMasculino++;
            } else if (sexo == 'F') {
                contadorFeminino++;
            }
        }
        
        // Calcular médias e percentuais
        double mediaAltura = somaAltura / 25;
        double mediaIMC = somaIMC / 25;
        double percentualMasculino = (double) contadorMasculino / 25 * 100;
        double percentualFeminino = (double) contadorFeminino / 25 * 100;
        
        // Exibir resultados
        System.out.println("\n=== RESULTADOS DA ANÁLISE ===");
        System.out.println("Idade da pessoa mais velha: " + idadeMaisVelha + " anos");
        System.out.println("Altura do mais alto: " + String.format("%.2f", alturaMaisAlto) + " metros");
        System.out.println("Maior peso: " + String.format("%.2f", maiorPeso) + " kg");
        System.out.println("Média de altura: " + String.format("%.2f", mediaAltura) + " metros");
        System.out.println("Média de IMC: " + String.format("%.2f", mediaIMC));
        System.out.println("Percentual de sexo masculino: " + String.format("%.1f", percentualMasculino) + "%");
        System.out.println("Percentual de sexo feminino: " + String.format("%.1f", percentualFeminino) + "%");
        
        scanner.close();
    }
}
