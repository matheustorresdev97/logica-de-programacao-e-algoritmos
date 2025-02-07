import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz? ");
        int ordem = scanner.nextInt();

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            System.out.println("Digite os valores da " + (i + 1) + "º linha:");
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValores acima da diagonal principal:");
        for (int i = 0; i < ordem; i++) {
            for (int j = i + 1; j < ordem; j++)  {
                System.out.print(matriz[i][j] + " ");
            }
        }

        scanner.close();
    }
}
