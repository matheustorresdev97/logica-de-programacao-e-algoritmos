import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Quantos números você vai digitar? ");
           int n = scanner.nextInt();

           for (int i = 0; i < n; i++) {
             System.out.print("Digite um número: ");
             int numero = scanner.nextInt();
             if (numero % 2 == 0) {
               System.out.println(numero + " é par.");
             } else {
               System.out.println(numero + " é ímpar.");
             }

           }

           scanner.close();
    }
}
