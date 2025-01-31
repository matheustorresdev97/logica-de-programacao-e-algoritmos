import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Digite a duração em segundos : ");
          int duracaoEmSegundos = scanner.nextInt();

          int horas = duracaoEmSegundos / 3600;
          int minutos = (duracaoEmSegundos % 3600) / 60;
          int segundos = duracaoEmSegundos % 60;

          System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

          scanner.close();
    }
}
