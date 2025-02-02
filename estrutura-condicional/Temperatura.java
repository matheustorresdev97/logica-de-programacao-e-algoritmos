import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Você vai digitar a temperatura em qual escala (C/F)? ");

                String escala = scanner.next();

                System.out.println("Digite a temperatura: ");
                double temperatura = scanner.nextDouble();

                if (escala.equalsIgnoreCase("C")) {
                    double fahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.printf("A temperatura em Fahrenheit é: %.2f%n", fahrenheit);
                }
                if (escala.equalsIgnoreCase("F")) {
                    double celsius = (temperatura - 32) * 5 / 9;
                    System.out.printf("A temperatura em Celsius é: %.2f%n", celsius);
                }

                scanner.close();
    }
}
