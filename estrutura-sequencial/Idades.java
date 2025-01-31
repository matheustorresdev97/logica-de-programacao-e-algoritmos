import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);

                         System.out.println("Digite o primeiro nome ");
                         String primeiroNome = scanner.next();
                         System.out.println("Digite a idade do primeiro nome ");
                         int idadePrimeiroNome = scanner.nextInt();

                         System.out.println("Digite o segundo nome ");
                         String segundoNome = scanner.next();
                         System.out.println("Digite a idade do segundo nome ");
                         int idadeSegundoNome = scanner.nextInt();

                         int somaDasIdades = idadePrimeiroNome + idadeSegundoNome;
                         double mediaDasIdades = (double) somaDasIdades / 2;
                         int diferencaDasIdades = Math.abs(idadePrimeiroNome - idadeSegundoNome);
                         int maiorIdade = Math.max(idadePrimeiroNome, idadeSegundoNome);
                         int menorIdade = Math.min(idadePrimeiroNome, idadeSegundoNome);

                         System.out.printf("Primeiro nome: %s%n", primeiroNome);
                         System.out.printf("Segundo nome: %s%n", segundoNome);
                         System.out.printf("Soma das idades: %d%n", somaDasIdades);
                         System.out.printf("Média das idades: %.2f%n", mediaDasIdades);

                         System.out.printf("Diferença das idades: %d%n", diferencaDasIdades);
                         System.out.printf("Maior idade: %d%n", maiorIdade);
                         System.out.printf("Menor idade: %d%n", menorIdade);

                        scanner.close();
    }
}
