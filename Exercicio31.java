import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 31 - SEPARAÇÃO PARES E ÍMPARES ===");
        
        ArrayList<Integer> listaPrincipal = new ArrayList<>();
        ArrayList<Integer> listaPares = new ArrayList<>();
        ArrayList<Integer> listaImpares = new ArrayList<>();
        
        // Ler 20 inteiros
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º inteiro: ");
            int numero = scanner.nextInt();
            listaPrincipal.add(numero);
            
            if (numero % 2 == 0) {
                listaPares.add(numero);
            } else {
                listaImpares.add(numero);
            }
        }
        
        // Exibir as listas
        System.out.println("\nLista Principal: " + listaPrincipal);
        System.out.println("Lista de Pares: " + listaPares);
        System.out.println("Lista de Ímpares: " + listaImpares);
        
        scanner.close();
    }
}
