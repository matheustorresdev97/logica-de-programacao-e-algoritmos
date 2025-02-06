import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos de testes serão digitados? ");
        int n = scanner.nextInt();
        
        int ratos = 0, sapos = 0, coelhos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            int quantidade = scanner.nextInt();
            System.out.print("Tipo da cobaia (C para coelho, R para rato, S para sapo): ");
            char tipo = scanner.next().toUpperCase().charAt(0);

            switch (tipo) {
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'R':
                    ratos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
                default:
                    System.out.println("Tipo inválido. Ignorando entrada.");
                    break;
            }
        }

        int totalCobaias = coelhos + ratos + sapos;

        System.out.println("\nRELATÓRIO FINAL:");
        System.out.println("Total de cobaias: " + totalCobaias);
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        if (totalCobaias > 0) {
            System.out.printf("Percentual de coelhos: %.2f%%\n", (coelhos * 100.0) / totalCobaias);
            System.out.printf("Percentual de ratos: %.2f%%\n", (ratos * 100.0) / totalCobaias);
            System.out.printf("Percentual de sapos: %.2f%%\n", (sapos * 100.0) / totalCobaias);
        }

        scanner.close();
    }
}
