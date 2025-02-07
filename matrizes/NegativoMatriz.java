import java.util.Scanner;

public class NegativoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a quantidade de linhas da matriz? ");
        int qtdLinhas = scanner.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz? ");
        int qtdColunas = scanner.nextInt();

        int[][] matriz = new int[qtdLinhas][qtdColunas];

        for (int i = 0; i < qtdLinhas; i++) {
            System.out.println("Digite os valores da " + (i + 1) + "º linha:");
            for (int j = 0; j < qtdColunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < qtdLinhas; i++) {
            for (int j = 0; j < qtdColunas; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
        scanner.close();
    }
}
