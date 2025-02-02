import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double plano = 50.00;
        double minutos = 100;

        System.out.println("Digite a quantidade de minutos: ");
        double quantidadeMinutos = scanner.nextDouble();

        if (quantidadeMinutos <= minutos) {
            System.out.println("Valor a pagar: R$ " + plano);
        } else {
            double valorExtra = quantidadeMinutos - minutos;
            double valorTotal = plano + (valorExtra * 2.00);
            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        }

        scanner.close();
    }
}
