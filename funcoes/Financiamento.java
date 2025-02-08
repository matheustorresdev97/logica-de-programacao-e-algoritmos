package funcoes;

import java.util.Scanner;

public class Financiamento {

    public static double calcularFinanciamento(double valorImovel, double valorEntrada, int numeroMeses) {
        double taxaJuros = 0.05; // Taxa de juros anual (5%)
        double financiamento = valorImovel - valorEntrada;

        double totalJuros = financiamento * taxaJuros * numeroMeses / 12;

        double totalAPagar = financiamento + totalJuros;

        return totalAPagar;
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Valor total do imovel: ");
                double valorImovel = scanner.nextDouble();

                System.out.println("Valor pago na entrada: ");
                double valorEntrada = scanner.nextDouble();

                System.out.println("Será financiado em quantos meses?");
                int numeroMeses = scanner.nextInt();


                double totalAPagar = calcularFinanciamento(valorImovel, valorEntrada, numeroMeses);
                System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
                


                scanner.close();
    }
}
