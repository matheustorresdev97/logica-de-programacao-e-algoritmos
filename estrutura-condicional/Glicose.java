import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de glicose no sangue: ");
        double glicose = scanner.nextDouble();

        if (glicose <= 100) {
            System.out.println("Classificacao: Normal");
        } else if (glicose > 100 && glicose <= 140) {
            System.out.println("Classificacao: Elevada");
        } else {
            System.out.println("Classificacao: Diabetes");
        }

        scanner.close();
    }
}
