import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores das coordenadas X e Y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Ponto (X, Y) está no quadrante I");
            } else if (x < 0 && y > 0) {
                System.out.println("Ponto (X, Y) está no quadrante II");
            } else if (x < 0 && y < 0) {
                System.out.println("Ponto (X, Y) está no quadrante III");
            } else if (x > 0 && y < 0) {
                System.out.println("Ponto (X, Y) está no quadrante IV");
            }

            else if (x == 0 && y != 0) {
                System.out.println("Ponto (X, Y) está na vertical");
            }

            else if (x != 0 && y == 0) {
                System.out.println("Ponto (X, Y) está na horizontal");
            }

            else {
                System.out.println("Ponto (X, Y) está na origem");
            }

            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
        }
        scanner.close();
    }
}
