package vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        System.out.println("Digite os números: ");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int negativos = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                negativos++;
                System.out.println(numero);
            }
        }

        System.out.println("Números negativos: " + negativos);
       
        scanner.close();
    }
}
