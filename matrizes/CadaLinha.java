import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz? ");
        int ordem = scanner.nextInt();
        int maiorElementoCadaLinha;

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            System.out.println("Digite os valores da " + (i + 1) + "º linha:");
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int i = 0; i < ordem; i++) {
            maiorElementoCadaLinha = matriz[i][0]; 

            for (int j = 1; j < ordem; j++) {
                if (matriz[i][j] > maiorElementoCadaLinha) {
                    maiorElementoCadaLinha = matriz[i][j];
                }
            }

            System.out.println(maiorElementoCadaLinha);
        }

        scanner.close();
    }
}
