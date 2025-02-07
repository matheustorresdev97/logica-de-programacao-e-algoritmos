package vetores;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Quantos elementos vai ter o vetor? ");
          int n = scanner.nextInt();

          int[] numeros = new int[n];
          int soma = 0;
          double media;

          for (int i = 0; i < n; i++) {
              System.out.println("Digite o " + (i + 1) + "º número: ");
              numeros[i] = scanner.nextInt();
              soma += numeros[i];
          }

          media = (double) soma / n;
          System.out.println("Média dos valores: " + media);
          System.out.println("Números abaixo da média:");
          for (int numero : numeros) {
              if (numero < media) {
                  System.out.print(numero + " ");
              }
          }
          System.out.println("\nNúmeros acima da média:");
          for (int numero : numeros) {
              if (numero > media) {
                  System.out.print(numero + " ");
              }
          }

          

          scanner.close();
    }
}
