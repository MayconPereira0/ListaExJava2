public class Exercicio26 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 26 - SÉRIE S ===");
        
        double soma = 0;
        
        for (int i = 1; i <= 50; i++) {
            double numerador = 2 * i - 1; // 1, 3, 5, 7, ..., 99
            double denominador = i;       // 1, 2, 3, 4, ..., 50
            soma += numerador / denominador;
        }
        
        System.out.println("O valor de S = 1/1 + 3/2 + 5/3 + ... + 99/50 é: " + soma);
    }
}
