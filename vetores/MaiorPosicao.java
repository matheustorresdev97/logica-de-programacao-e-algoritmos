package vetores;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Quantos números você vai digitar? ");
                int n = scanner.nextInt();

                int[] numeros = new int[n];

                System.out.println("Digite os números: ");
                for (int i = 0; i < n; i++) {
                    numeros[i] = scanner.nextInt();
                }

                int maior = numeros[0];
                int posicaoMaior = 0;
                for (int i = 1; i < n; i++) {
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                        posicaoMaior = i;
                    }
                }

                System.out.println("O maior número é " + maior + " e está na posição " + (posicaoMaior + 1) + ".");
                

                scanner.close();
    }
}
