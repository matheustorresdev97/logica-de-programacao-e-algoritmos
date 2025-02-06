import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Informe um código (1, 2, 3) ou 4 para parar: ");
                int codigo = scanner.nextInt();
                
                int alcool = 0;
                int gasolina = 0;
                int diesel = 0;

                while (codigo != 4) {
                    switch (codigo) {
                        case 1:
                           alcool += 1;
                            break;
                        case 2:
                            gasolina += 1;
                            break;
                        case 3:
                            diesel += 1;
                            break;
                        case 4:
                            break;
                        default:
                        System.out.println("Código inválido! Tente novamente");
                    }

                    System.out.println("Informe um código (1, 2, 3) ou 4 para parar: ");
                    codigo = scanner.nextInt();
                }

                System.out.println("MUITO OBRIGADO!");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);

                scanner.close();
    }
}
