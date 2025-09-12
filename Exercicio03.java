public class Exercicio03 {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIO 3 - PRIMEIROS 10 NÚMEROS PARES ===");
        
        int contador = 0;
        int numero = 1;
        
        while (contador < 10) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
