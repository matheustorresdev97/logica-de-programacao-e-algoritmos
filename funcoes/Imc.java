package funcoes;

import java.util.Scanner;

public class Imc {

    public static double calcularImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Entre com seu peso (em kg): ");
                double peso = scanner.nextDouble();

                System.out.print("Entre com sua altura (em metros): ");
                double altura = scanner.nextDouble();

                double imc = calcularImc(peso, altura);

                System.out.printf("Seu IMC é: %.2f%n", imc);

                scanner.close();
    }
}
