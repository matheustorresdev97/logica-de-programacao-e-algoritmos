import java.util.Scanner;

public class OperacoesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz: ");
        int ordem = scanner.nextInt();

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaPositivos = 0;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }
        System.out.println("\na) Soma dos elementos positivos: " + somaPositivos);

        System.out.print("\nb) Digite o índice da linha: ");
        int linha = scanner.nextInt();
        System.out.print("Elementos da linha " + linha + ": ");
        for (int j = 0; j < ordem; j++) {
            System.out.print(matriz[linha][j] + " ");
        }

        System.out.print("\n\nc) Digite o índice da coluna: ");
        int coluna = scanner.nextInt();
        System.out.print("Elementos da coluna " + coluna + ": ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }

        System.out.print("\n\nd) Diagonal principal: ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
            }
        }

        System.out.println("\n\ne) Matriz com números negativos elevados ao quadrado:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}