package vetores;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você vai digitar? ");
        int n = scanner.nextInt();

        int[] notas = new int[n];
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            
            scanner.nextLine(); 
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine(); 

            System.out.print("Primeira nota: ");
            int primeiraNota = scanner.nextInt();
            System.out.print("Segunda nota: ");
            int segundaNota = scanner.nextInt();

            notas[i] = (primeiraNota + segundaNota) / 2; 
        }

        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (notas[i] >= 70) {
                System.out.println(nomes[i] + " - " + notas[i] + "%");
            }
        }

        System.out.println("\nAlunos reprovados:");
        for (int i = 0; i < n; i++) {
            if (notas[i] < 70) {
                System.out.println(nomes[i] + " - " + notas[i] + "%");
            }
        }

        scanner.close();
    }
}
