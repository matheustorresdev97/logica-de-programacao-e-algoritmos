import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int senha;

        System.out.println("Digite a senha: ");
        senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida! Tente novamente: " + senha);
            senha = scanner.nextInt();
        }

        System.out.println("Acesso Permitido!");

        scanner.close();
    }
}
