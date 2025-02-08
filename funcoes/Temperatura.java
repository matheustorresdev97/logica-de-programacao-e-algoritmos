package funcoes;

import java.util.Scanner;

public class Temperatura {

    public static double converterCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = converterCelsius(fahrenheit);

        System.out.printf("A temperatura em Celsius é: %.2f%n", celsius);

        scanner.close();
    }
}
