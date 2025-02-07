import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Qual a ordem da matriz? ");
              int ordem = scanner.nextInt();
              int cont = 0;

              int[][] matriz = new int[ordem][ordem];

              for (int i = 0; i < ordem; i++) {
                 for (int j = 0; j < ordem; j++) {
                     System.out.println("Digite o valor da posição [" + i + "][" + j + "]: ");
                     matriz[i][j] = scanner.nextInt();
                 }
              }

              System.out.println("Diagonal Principal:");
              for (int i = 0; i < ordem; i++) {
                 System.out.print(matriz[i][i] + " ");
              }

              System.out.println("");


              for (int i = 0; i < ordem; i++) {
                for (int j = 0; j < ordem; j++) {
                    if(matriz[i][j] < 0) {
                        cont++;
                    }
                }
              }

              System.out.println("Quantidade de valores negativos: " + cont);


              scanner.close();
    }
}
