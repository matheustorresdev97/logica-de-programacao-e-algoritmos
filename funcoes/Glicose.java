package funcoes;

import java.util.Scanner;

public class Glicose {

    public static String calcularGlicose(double glicose) {
        double glicoseNormal = 100;

        double glicosePercentual = (glicose / glicoseNormal) * 100;

        if (glicosePercentual <= 100 && glicosePercentual >= 70) {
            return "Glicose normal";
        } else if (glicosePercentual > 100) {
            return "Glicose alta";
        } else {
            return "Glicose baixa";
        }
    }
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

              System.out.println("Digite a quantidade de glicose no sangue: ");
              double glicose = scanner.nextDouble();

              String classificacaoGlicose = calcularGlicose(glicose);

              System.out.printf("Classificação da glicose: %s%n", classificacaoGlicose);

              scanner.close();
    }
}
