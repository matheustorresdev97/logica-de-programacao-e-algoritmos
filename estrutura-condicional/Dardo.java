import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três distâncias: ");
        double distancia1 = scanner.nextDouble();
        double distancia2 = scanner.nextDouble();
        double distancia3 = scanner.nextDouble();

        double maiorDistancia = Math.max(distancia1, Math.max(distancia2, distancia3));

        System.out.printf("MAIOR DISTÂNCIA = %.2f%n", maiorDistancia);

        scanner.close();
    }
}