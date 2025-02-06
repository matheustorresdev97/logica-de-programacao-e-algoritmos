package vetores;

import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("VALORES = ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("SOMA = " + soma);

        int media = soma / n;
        System.out.println("MÉDIA = " + media);

        scanner.close();
    }
}
