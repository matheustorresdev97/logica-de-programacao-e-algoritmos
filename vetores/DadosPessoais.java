package vetores;

import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();
        
        double[] altura = new double[n];
        String[] genero = new String[n];
        double mediaAltura = 0;
        int quantidadeHomens = 0;
        double somaAlturaHomens = 0;
        double mediaAlturaMulheres = 0;
        int quantidadeMulheres = 0;
        double somaAlturaMulheres = 0;

        System.out.println("Digite as alturas e generos das pessoas: ");

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = scanner.nextDouble();

            System.out.print("Genero da " + (i+1) + "a pessoa (M/F): ");
            genero[i] = scanner.next();

            mediaAltura += altura[i];

            if (genero[i].equalsIgnoreCase("M")) {
                quantidadeHomens++;
                somaAlturaHomens += altura[i];
            } else {
                quantidadeMulheres++;
                somaAlturaMulheres += altura[i];
            }
        }   

        // Calculating statistics
        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        
        for (int i = 1; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        // Calculating averages
        mediaAltura = mediaAltura / n;
        mediaAlturaMulheres = quantidadeMulheres > 0 ? somaAlturaMulheres / quantidadeMulheres : 0;

        // Printing results
        System.out.printf("\nMenor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas = %.2f\n", mediaAltura);
        System.out.printf("Numero de homens = %d\n", quantidadeHomens);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Soma das alturas das mulheres = %.2f\n", somaAlturaHomens);

        scanner.close();
    }
}