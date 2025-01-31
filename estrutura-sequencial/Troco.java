import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        double totalAPagar = valorDoProduto * quantidadeComprada;
        
        System.out.println("Total a pagar: R$ " + totalAPagar);
        System.out.println("Digite o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        double trocoDevolvido = valorPago - totalAPagar;

        System.out.println("Troco: R$ " + trocoDevolvido);

        scanner.close();
    }
}