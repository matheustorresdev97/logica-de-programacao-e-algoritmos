package vetores;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        int contadorPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                contadorPares++;
            }
        }

        System.out.println("\n\nQuantidade de números pares: " + contadorPares);

        scanner.close();
    }
}

