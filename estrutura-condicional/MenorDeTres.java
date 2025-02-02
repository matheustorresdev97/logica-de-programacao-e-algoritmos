import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número: ");
                int primeiroNumero = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int segundoNumero = scanner.nextInt();

                System.out.println("Digite o terceiro número: ");
                int terceiroNumero = scanner.nextInt();

                int menorNumero = Math.min(Math.min(primeiroNumero, segundoNumero), terceiroNumero);

                System.out.printf("O menor número é: %d%n", menorNumero);

                scanner.close();
    }
}
