import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scanner.nextDouble();
        double aumento;

        if (salario <= 1000) {
            aumento = salario * 0.20; // 20% de aumento
            System.out.printf("O aumento é de %.2f%n", aumento);
            System.out.printf("Novo salário: %.2f%n", salario + aumento);
        }
        else if (salario <= 3000) {
            aumento = salario * 0.15; // 15% de aumento
            System.out.printf("O aumento é de %.2f%n", aumento);
            System.out.printf("Novo salário: %.2f%n", salario + aumento);
        }
        else if (salario <= 8000) {
            aumento = salario * 0.10; // 10% de aumento
            System.out.printf("O aumento é de %.2f%n", aumento);
            System.out.printf("Novo salário: %.2f%n", salario + aumento);
        }
        else {
            aumento = salario * 0.05; // 5% de aumento
            System.out.printf("O aumento é de %.2f%n", aumento);
            System.out.printf("Novo salário: %.2f%n", salario + aumento);
        }

        scanner.close();
    }
}