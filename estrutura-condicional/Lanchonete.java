import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código do produto comprado: ");
        int codigoDoProduto = scanner.nextInt();

        System.out.println("Quantidade comprada");
        int quantidadeComprada = scanner.nextInt();

        switch (codigoDoProduto) {
            case 1:
                System.out.println("Preço unitário: R$ 5.00");
                System.out.printf("Total: R$ %.2f%n", quantidadeComprada * 5.00);
                break;
            case 2:
                System.out.println("Preço unitário: R$ 3.50");
                System.out.printf("Total: R$ %.2f%n", quantidadeComprada * 3.50);
                break;
            case 3:
                System.out.println("Preço unitário: R$ 4.80");
                System.out.printf("Total: R$ %.2f%n", quantidadeComprada * 4.80);
                break;
            case 4:
                System.out.println("Preço unitário: R$ 8.90");
                System.out.printf("Total: R$ %.2f%n", quantidadeComprada * 8.90);
                break;
            case 5:
                System.out.println("Preço unitário: R$ 7.32");
                System.out.printf("Total: R$ %.2f%n", quantidadeComprada * 7.32);
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }

        scanner.close();
    }
}
