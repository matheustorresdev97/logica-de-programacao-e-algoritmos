package funcoes;

import java.util.Scanner;

public class Retangulo {
    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static double diagonalRetangulo(double base, double altura) {
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return diagonal;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularArea(base, altura);
        
        double diagonal = diagonalRetangulo(base, altura);

        System.out.printf("A área do retângulo é: %.2f%n", area);

        System.out.printf("A diagonal do retângulo é: %.2f%n", diagonal);

        scanner.close();
    }
}
