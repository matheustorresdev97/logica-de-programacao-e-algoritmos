import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sexo: ");
        String sexo = scanner.next();

        System.out.println("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();

        System.out.println("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();

        int ingresso;
        if (sexo.equalsIgnoreCase("M")) {
            ingresso = 10;
        } else {
            ingresso = 8;
        }

        double consumoCervejas = quantidadeCervejas * 5.0;
        double consumoRefrigerantes = quantidadeRefrigerantes * 3.0;
        double consumo = consumoCervejas + consumoRefrigerantes;
        
        double couvert = 0.0;
        if (consumo < 30.0) {
            couvert = 4.0;
            System.out.println("Você pagará couvert artístico pois o consumo não atingiu o mínimo de R$ 30,00");
        }
        
        double total = consumo + ingresso + couvert;
        
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        System.out.printf("Ingresso = R$ %d,00%n", ingresso);
        if (couvert > 0) {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Total = R$ %.2f%n", total);

        scanner.close();
    }
}
