package vetores;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos nomes você vai digitar? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        int posicaoMaisVelho = 0;
        int idadeMaisVelha = 0;

        System.out.println("Digite os nomes e idades: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();

            if (idade[i] > idadeMaisVelha) {
                idadeMaisVelha = idade[i];
                posicaoMaisVelho = i;
            }
        }

        System.out.println("O nome mais velho é " + nomes[posicaoMaisVelho] + " e tem " + idadeMaisVelha + " anos.");


        scanner.close();
    }
}
