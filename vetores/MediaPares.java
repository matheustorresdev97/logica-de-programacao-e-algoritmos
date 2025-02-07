package vetores;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Quantos elementos vai ter o vetor? ");
                int n = scanner.nextInt();

                int[] numeros = new int[n];

                System.out.println("Digite os elementos do vetor: ");
                for (int i = 0; i < n; i++) {
                    numeros[i] = scanner.nextInt();
                }

                int somaPares = 0;
                int contadorPares = 0;
                for (int numero : numeros) {
                    if (numero % 2 == 0) {
                        somaPares += numero;
                        contadorPares++;
                    }
                }

                double mediaPares = (double) somaPares / contadorPares;
                System.out.println("Média dos elementos pares: " + mediaPares);
                System.out.println("Quantidade de elementos pares: " + contadorPares);
                System.out.println("Percentual dos elementos pares: " + ((double) contadorPares / n) * 100 + "%");
                System.out.println("Elemento mais próximo de zero: " + (mediaPares > 0? -1 : 1));
                System.out.println("Elemento mais distante de zero: " + (mediaPares > 0? numeros[0] : numeros[n - 1]));
                

                scanner.close();
    }
}
