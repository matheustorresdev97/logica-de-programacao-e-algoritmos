import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        double notaFinal = (primeiraNota + segundaNota) / 2;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO!");
        } else {
            System.out.println("APROVADO!");
        }

        scanner.close();
    }
}