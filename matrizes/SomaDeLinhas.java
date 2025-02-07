import java.util.Scanner;

public class SomaDeLinhas {
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
        
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < qtdLinhas; i++) {
            int somaLinha = 0;
            for (int j = 0; j < qtdColunas; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }
        
        scanner.close();
    }
}