package vetores;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.print("Nome: ");
            scanner.nextLine();
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        double mediaAltura = somaAlturas / n;
        System.out.println("Média das alturas: " + mediaAltura);

        int menoresDe16 = 0;
        System.out.println("Pessoas com menos de 16 anos:");
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
                menoresDe16++;
            }
        }

        double porcentagemMenores16 = ((double) menoresDe16 / n) * 100;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenores16);

        scanner.close();
    }
}
