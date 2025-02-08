package funcoes;

import java.util.Scanner;

public class ClassificarImc {
    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (severa)";
        }
    }

    public static void calcularImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificarImc(imc));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        calcularImc(peso, altura);

        scanner.close();
    }
}
