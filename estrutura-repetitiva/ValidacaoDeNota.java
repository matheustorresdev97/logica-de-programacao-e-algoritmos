import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite a primeira nota: ");
                double primeiraNota = scanner.nextDouble();

                while (primeiraNota < 0 || primeiraNota > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10: ");
                    primeiraNota = scanner.nextDouble();
                }

                System.out.println("Digite a segunda nota: ");
                double segundaNota = scanner.nextDouble();

                while (segundaNota < 0 || segundaNota > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10: ");
                    segundaNota = scanner.nextDouble();
                }

                double media = (primeiraNota + segundaNota) / 2;

                System.out.printf("Média das notas: %.1f%n", media);

                scanner.close();
    }
}
