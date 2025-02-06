import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int numeros = scanner.nextInt();
        int numerosDentro = 0;
        int numerosFora = 0;

        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 20) {
                System.out.println("O número " + numero + " está dentro do intervalo de 10 a 20.");
                numerosDentro++;
            } else {
                System.out.println("O número " + numero + " não está dentro do intervalo de 10 a 20.");
                numerosFora++;
            }
        }

        System.out.println("Foram digitados " + numerosDentro + " números dentro do intervalo.");
        System.out.println("Foram digitados " + numerosFora + " números fora do intervalo.");

        scanner.close();
    }
}
