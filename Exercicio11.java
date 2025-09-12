public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 11 - SOMA DOS PRIMEIROS 50 PARES (0-100) ===");
        
        int soma = 0;
        int contador = 0;
        
        for (int i = 0; i <= 100 && contador < 50; i++) {
            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
        }
        
        System.out.println("A soma dos primeiros 50 números pares de 0 a 100 é: " + soma);
    }
}
