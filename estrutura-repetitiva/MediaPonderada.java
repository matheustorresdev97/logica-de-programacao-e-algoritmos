import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Quantos casos voce vai digitar? ");
                int n = scanner.nextInt();
                double somaPesos = 0, somaNotas = 0;
                double media;

                for (int i = 0; i < n; i++) {
                    System.out.print("Digite o peso do " + (i + 1) + "º caso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite a nota do " + (i + 1) + "º caso: ");
                    double nota = scanner.nextDouble();

                    somaPesos += peso;
                    somaNotas += peso * nota;
                }

                media = somaNotas / somaPesos;

                System.out.printf("A média ponderada das notas é %.2f%n", media);
                System.out.printf("A soma dos pesos dos casos é %.2f%n", somaPesos);
                System.out.printf("A soma das notas ponderadas dos casos é %.2f%n", somaNotas);
                System.out.printf("A diferença entre a soma dos pesos e a soma das notas ponderadas é %.2f%n", somaPesos - somaNotas);
                System.out.printf("A porcentagem da diferença em relação ao soma dos pesos é %.2f%%%n", (somaPesos - somaNotas) / somaPesos * 100);
                System.out.printf("A porcentagem da média ponderada em relação ao soma dos pesos é %.2f%%%n", media / somaPesos * 100);
                System.out.printf("A porcentagem da média ponderada em relação ao soma das notas ponderadas é %.2f%%%n", media / somaNotas * 100);
                System.out.printf("A porcentagem da média ponderada em relação ao total é %.2f%%%n", media / (somaPesos + somaNotas) * 100);
                System.out.printf("A porcentagem do soma dos pesos em relação ao total é %.2f%%%n", somaPesos / (somaPesos + somaNotas) * 100);
                System.out.printf("A porcentagem do soma das notas ponderadas em relação ao total é %.2f%%%n", somaNotas / (somaPesos + somaNotas) * 100);

                scanner.close();
    }
}
