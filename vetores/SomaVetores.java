package vetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor ? ");

        int n = scanner.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSoma = new int[n];

        System.out.println("Valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("Vetor soma: ");
        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
            System.out.print(vetorSoma[i] + " ");
        }

        scanner.close();
    }
}
