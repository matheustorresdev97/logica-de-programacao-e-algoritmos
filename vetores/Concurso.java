package vetores;

import java.util.Scanner;

public class Concurso {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Quantos candidatos foram eleitos? ");
                int n = scanner.nextInt();

                String[] nomes = new String[n];
                double[] notaEtapa1 = new double[n];
                double[] notaEtapa2 = new double[n];

                int totalAprovados = 0;
                double somaAprovados = 0;
                double maiorNota = 0;
                String nomeMaiorNota = "";

                for (int i = 0; i < n; i++) {
                    System.out.println("Digite o nome e as notas do " + (i + 1) + "º candidato: ");

                    scanner.nextLine();
                    System.out.print("Nome: ");
                    nomes[i] = scanner.nextLine();

                    System.out.print("Nota na etapa 1: ");
                    notaEtapa1[i] = scanner.nextDouble();

                    System.out.print("Nota na etapa 2: ");
                    notaEtapa2[i] = scanner.nextDouble();

                    System.out.println();
                }

                for (int i = 0; i < n; i++) {
                    double media = (notaEtapa1[i] + notaEtapa2[i]) / 2;
                    System.out.printf("Nome: %s | Média: %.2f\n", nomes[i], media);

                    if (media >= 70) {
                        System.out.printf("Status: Aprovado\n");
                        System.out.println(nomes[i] + " - " + media + "%");
                        totalAprovados++;
                        somaAprovados+= media;
                    } else {
                        System.out.printf("Status: Reprovado\n");
                        System.out.println(nomes[i] + " - " + media + "%");
                    }

                    if (media > maiorNota) {
                        maiorNota = media;
                        nomeMaiorNota = nomes[i];
                    }
                }

                double percentualAprovados = ((double) totalAprovados / n) * 100;
                System.out.printf("Porcentagem de aprovação: %.2f%%\n", percentualAprovados);


                if (totalAprovados > 0) {
                    double mediaAprovados = somaAprovados / totalAprovados;
                    System.out.printf("Média das notas dos aprovados: %.2f\n", mediaAprovados);
                } else {
                    System.out.println("Nenhum candidato foi aprovado.");
                }

                System.out.printf("Candidato com a maior nota: %s | Média: %.2f\n", nomeMaiorNota, maiorNota);

                scanner.close();
    }
}
