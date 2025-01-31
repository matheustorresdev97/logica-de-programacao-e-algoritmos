import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Digite o nome do funcionário(a): ");
           String nomeFuncionario = scanner.nextLine();

           System.out.println("Digite o valor por hora: ");
           double valorHora = scanner.nextDouble();

           System.out.println("Digite a quantidade de horas trabalhadas: ");
           double quantidadeHoras = scanner.nextDouble();

           double salarioBruto = valorHora * quantidadeHoras;

           System.out.println("O pagamento para "+ nomeFuncionario + "deve ser " + salarioBruto);

           scanner.close();
    }
}
