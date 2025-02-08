package funcoes;

import java.util.Scanner;

public class Triangulo {

    public static double calcularArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xa, xb, xc;
        int ya, yb, yc;
        double areaX, areaY;

        System.out.println("Entre com as medidas do triângulo X: ");
        xa = scanner.nextInt();
        xb = scanner.nextInt();
        xc = scanner.nextInt();

        System.out.println("Entre com as medidas do triângulo Y: ");
        ya = scanner.nextInt();
        yb = scanner.nextInt();
        yc = scanner.nextInt();

        areaX = calcularArea(xa, xb, xc);
        areaY = calcularArea(ya, yb, yc);

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        scanner.close();
    }
}
