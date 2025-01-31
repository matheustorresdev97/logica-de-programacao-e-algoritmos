import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite a base do retangulo ");
                double baseDoRetangulo = scanner.nextDouble();

                System.out.println("Digite a altura do retangulo ");
                double alturaDoRetangulo = scanner.nextDouble();

                double areaDoRetangulo = baseDoRetangulo * alturaDoRetangulo;
                double perimetroDoRetangulo = 2 * (baseDoRetangulo + alturaDoRetangulo);
                double diagonalDoRetangulo = Math.sqrt(Math.pow(baseDoRetangulo, 2) + Math.pow(alturaDoRetangulo, 2));

                System.out.printf("A área do retangulo é %.2f%n", areaDoRetangulo);
                System.out.printf("O perímetro do retangulo é %.2f%n", perimetroDoRetangulo);
                System.out.printf("A diagonal do retangulo é %.2f%n", diagonalDoRetangulo);

                scanner.close();
    }
}
