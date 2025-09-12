public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 2 - PRIMEIROS 5 NÚMEROS ÍMPARES ===");
        
        int contador = 0;
        int numero = 1;
        
        while (contador < 5) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
