import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora inicial: ");
        int horaInicial = scanner.nextInt();

        System.out.println("Hora final: ");
        int horaFinal = scanner.nextInt();

        int duracao;
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        scanner.close();
    }
}