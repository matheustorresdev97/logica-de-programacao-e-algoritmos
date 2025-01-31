import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida A: ");
        double medidaA = scanner.nextDouble();

        System.out.println("Digite a medida B: ");
        double medidaB = scanner.nextDouble();

        System.out.println("Digite a medida C: ");
        double medidaC = scanner.nextDouble();

        double quadrado = medidaA * medidaA;
        System.out.printf("AREA DO QUADRADO = %.4f\n", quadrado);

        double triangulo = (medidaA * medidaB) / 2;
        System.out.printf("AREA DO TRIANGULO = %.4f\n", triangulo);

        double trapezio = ((medidaA + medidaB) * medidaC) / 2;
        System.out.printf("AREA DO TRAPEZIO = %.4f\n", trapezio);

        scanner.close();
    }
}
