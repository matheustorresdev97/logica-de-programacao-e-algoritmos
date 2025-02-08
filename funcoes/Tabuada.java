package funcoes;

import java.util.Scanner;

public class Tabuada {
    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        imprimirTabuada(numero);

        scanner.close();
    }
}
