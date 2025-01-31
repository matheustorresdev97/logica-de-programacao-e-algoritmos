import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();

                double area = Math.PI * Math.pow(raio, 2);
                double perimetro = 2 * Math.PI * raio;

                System.out.printf("A área do circulo é %.2f%n", area);
                System.out.printf("O perimetro do circulo é %.2f%n", perimetro);


                scanner.close();
    }
}
