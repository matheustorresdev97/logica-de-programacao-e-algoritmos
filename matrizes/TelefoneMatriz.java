import java.util.Locale;
import java.util.Scanner;

public class TelefoneMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de clientes: ");
        int quantidade = sc.nextInt();

        String[][] clientes = new String[quantidade][4];
        double[][] assinaturas = new double[3][2];
        double[] contas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Dados do " + (i + 1) + "o. cliente: ");
            System.out.print("Nome: ");
            clientes[i][0] = sc.next();
            sc.nextLine();
            System.out.print("Telefone: ");
            clientes[i][1] = sc.next();
            System.out.print("Tipo: ");
            clientes[i][2] = sc.next();
            System.out.print("Minutos: ");
            clientes[i][3] = sc.next();
            System.out.println();
        }

        System.out.println("Informe o preco basico e excedente de cada tipo de conta: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Tipo " + i + ": ");
            for (int j = 0; j < 2; j++) {
                assinaturas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < quantidade; i++) {
            int tipo = Integer.parseInt(clientes[i][2]);
            int minutos = Integer.parseInt(clientes[i][3]);
            
            if (minutos <= 90) {
                contas[i] = assinaturas[tipo][0];
            } else {
                contas[i] = assinaturas[tipo][0] + ((minutos - 90) * assinaturas[tipo][1]);
            }
        }
        
        System.out.println("\nRelatório dos clientes:");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%s, %s, Tipo %s, Minutos: %s, Conta= R$ %.2f%n", 
                clientes[i][0], clientes[i][1], clientes[i][2], clientes[i][3], contas[i]);
        }

        sc.close();
    }
}