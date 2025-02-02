import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double precoDoProduto = scanner.nextDouble();
        
        if (precoDoProduto <= 0) {
            System.out.println("Preço do produto deve ser maior que zero!");
            scanner.close();
            return;
        }

        System.out.println("Quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();
        
        if (quantidadeComprada <= 0) {
            System.out.println("Quantidade deve ser maior que zero!");
            scanner.close();
            return;
        }

        double totalAPagar = precoDoProduto * quantidadeComprada;

        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
        System.out.println("Valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        double trocoDevolvido = valorPago - totalAPagar;

        if (trocoDevolvido >= 0) {
            System.out.printf("Troco: R$ %.2f%n", trocoDevolvido);
        } else {
            System.out.printf("Valor insuficiente! Falta R$ %.2f%n", Math.abs(trocoDevolvido));
        }

        scanner.close();
    }
}