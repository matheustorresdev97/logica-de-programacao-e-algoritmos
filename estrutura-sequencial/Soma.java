import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        double soma = x + y;
        
        System.out.printf("A soma de X e Y é %.2f%n", soma);

        scanner.close();
    }
}
