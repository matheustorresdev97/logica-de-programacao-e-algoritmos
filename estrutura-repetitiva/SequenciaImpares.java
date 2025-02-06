import java.util.Scanner;

public class SequenciaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
