import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Quantas linhas vai ter cada matriz? ");
                int qtdLinhas = scanner.nextInt();

                System.out.println("Quantas colunas vai ter cada matriz? ");
                int qtdColunas = scanner.nextInt();

                int[][] matriz1 = new int[qtdLinhas][qtdColunas];
                int[][] matriz2 = new int[qtdLinhas][qtdColunas];
                int[][] matrizSoma = new int[qtdLinhas][qtdColunas];

                System.out.println("\nDigite os valores da primeira matriz:");
                for (int i = 0; i < qtdLinhas; i++) {
                    for (int j = 0; j < qtdColunas; j++) {
                        matriz1[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("\nDigite os valores da segunda matriz:");
                for (int i = 0; i < qtdLinhas; i++) {
                    for (int j = 0; j < qtdColunas; j++) {
                        matriz2[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("\nSoma das matrizes:");
                for (int i = 0; i < qtdLinhas; i++) {
                    for (int j = 0; j < qtdColunas; j++) {
                        matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
                        System.out.print(matrizSoma[i][j] + " ");
                    }
                    System.out.println();
                }

                scanner.close();
    }
}
