public class Exercicio23 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 23 - SOMA DE MÚLTIPLOS DE 3 OU 5 ABAIXO DE 1000 ===");
        
        int soma = 0;
        
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma de todos os números naturais abaixo de 1000 que são múltiplos de 3 ou 5 é: " + soma);
    }
}
