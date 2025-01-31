import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo médio do carro é: " + consumoMedio + " km/l");

        scanner.close();
    }
}
