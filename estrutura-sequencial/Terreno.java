import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do terreno ");
        double larguraDoTerreno = scanner.nextDouble();

        System.out.println("Digite a altura do terreno ");
        double alturaDoTerreno = scanner.nextDouble();

        System.out.println("Digite o valor do metro quadrado");
        double valorDoMetroQuadrado = scanner.nextDouble();

        double areaDoTerreno = larguraDoTerreno * alturaDoTerreno;

        double custoDoTerreno = areaDoTerreno * valorDoMetroQuadrado;

        System.out.printf("A área do terreno é %.2f m²%n", areaDoTerreno);
        System.out.printf("O custo do terreno é R$ %.2f%n", custoDoTerreno);
        
        scanner.close();
    }
}
