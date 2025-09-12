public class Exercicio41 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 41 - DIFERENÇA ENTRE SOMA DE QUADRADOS E QUADRADO DA SOMA ===");
        
        long somaQuadrados = 0;
        long soma = 0;
        
        // Calcular soma dos quadrados e soma simples
        for (int i = 1; i <= 100; i++) {
            somaQuadrados += (long) i * i;
            soma += i;
        }
        
        long quadradoSoma = soma * soma;
        long diferenca = quadradoSoma - somaQuadrados;
        
        System.out.println("Soma dos quadrados dos primeiros 100 números naturais: " + somaQuadrados);
        System.out.println("Quadrado da soma dos primeiros 100 números naturais: " + quadradoSoma);
        System.out.println("Diferença: " + diferenca);
    }
}
