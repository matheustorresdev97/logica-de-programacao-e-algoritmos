import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
       
        if(a == 0 || delta < 0) {
            System.out.println("Esta equação nao possui raizes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("As raizes reais da equacao %.0fx^2 + %.0fx + %.0f = 0 sao: %.2f e %.2f%n", a, b, c, x1, x2);
        }


        scanner.close();
    }
}