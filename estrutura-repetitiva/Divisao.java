import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos casos você vai digitar? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Entre com o denominador: ");
            int denominador = scanner.nextInt();

            if (denominador == 0) {
                System.out.println("Denominador não pode ser zero.");
            } else {
                System.out.printf("Resultado da divisão: %.2f%n", (float) numerador / denominador);
            }

            System.out.println(); 
        }


        scanner.close();
    }
}
