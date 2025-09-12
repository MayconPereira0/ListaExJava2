import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 28 - CÁLCULO DE SALÁRIO ===");
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        
        double salario = 4000.0; // Salário inicial em 2019
        double aumentoAnterior = 0.015; // 1.5% em 2020
        
        // Aplicar aumentos de 2020 até o ano atual
        for (int ano = 2020; ano <= anoAtual; ano++) {
            salario += salario * aumentoAnterior;
            aumentoAnterior *= 2; // Dobrar o aumento do ano anterior
        }
        
        System.out.println("Salário atual (" + anoAtual + "): R$ " + String.format("%.2f", salario));
        
        scanner.close();
    }
}
