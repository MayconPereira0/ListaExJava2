public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 4 - NÚMEROS DE 1 A 100 ===");
        
        System.out.println("Usando FOR:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("\nUsando WHILE:");
        int contador = 1;
        while (contador <= 100) {
            System.out.print(contador + " ");
            if (contador % 10 == 0) {
                System.out.println();
            }
            contador++;
        }
    }
}
