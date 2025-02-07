package vetores;

import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos você vai cadastrar? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] precoDeCompra = new double[n];
        double[] precoDeVenda = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome, preço de compra e preço de venda do " + (i + 1) + "º produto: ");

            scanner.nextLine();
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Preço de compra: ");
            precoDeCompra[i] = scanner.nextDouble();

            System.out.print("Preço de venda: ");
            precoDeVenda[i] = scanner.nextDouble();

            System.out.println();
            double lucro = precoDeVenda[i] - precoDeCompra[i];
            System.out.printf("Lucro do %s: R$ %.2f\n", nomes[i], lucro);
            double fatorDeLucro = (lucro / precoDeCompra[i]) * 100;
            System.out.printf("Fator de lucro do %s: %.2f%%\n", nomes[i], fatorDeLucro);
            System.out.println();

            System.out.println("Lucro < 10%");
            if (fatorDeLucro < 10) {
                System.out.println("Alerta: Produto com fator de lucro baixo!");
            }
            if(fatorDeLucro <= 10 && fatorDeLucro <=20) {
                System.out.println("Atenção: Produto com fator de lucro próximo de 20%!");
            }
            if(fatorDeLucro > 20) {
                System.out.println("Parabéns: Produto com fator de lucro elevado!");
            }
        }

        scanner.close();
    }
}
