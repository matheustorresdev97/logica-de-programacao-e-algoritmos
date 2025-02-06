import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int soma;

        while (numero != 0) {
            if (numero % 2 != 0) {
                numero = numero + 1;
            }

            soma = 5 * numero + 20;
            System.out.println("SOMA = " + soma);

            System.out.println("Digite um número inteiro: ");
            numero = scanner.nextInt();

        }

        scanner.close();
    }
}
