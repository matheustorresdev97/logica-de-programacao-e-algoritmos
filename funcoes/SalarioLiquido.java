package funcoes;

import java.util.Scanner;

public class SalarioLiquido {
    public static double calcularSalarioLiquido(double salarioBruto, double inss, double ir, double cofins) {
        double salarioLiquido = salarioBruto - inss - ir - cofins;
        return salarioLiquido;
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o salário bruto: ");
                double salarioBruto = scanner.nextDouble();

                System.out.println("Digite a taxa de INSS (em %): ");
                double inss = scanner.nextDouble();

                System.out.println("Digite a taxa de IR (em %): ");
                double ir = scanner.nextDouble();

                System.out.println("Digite a taxa de COFINS (em %): ");
                double cofins = scanner.nextDouble();

                double salarioLiquido = calcularSalarioLiquido(salarioBruto, inss, ir, cofins);
                System.out.printf("O salário líquido é: %.2f%n", salarioLiquido);

                

                scanner.close();
    }
}
