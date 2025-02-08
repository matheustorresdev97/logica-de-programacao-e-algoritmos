package funcoes;

import java.util.Scanner;

public class Exame {

    public static String calcularGlicose(double glicose) {
        if (glicose <= 100) {
            return "Glicose normal";
        } else if (glicose <= 140) {
            return "Glicose Elevada";
        } else {
            return "Glicose Muito Elevada";
        }
    }

    public static String calcularTriglicerideos(double triglicerideos) {
        if(triglicerideos <= 200) {
            return"Triglicerídeos desejável";
        } else {
            return"Triglicerídeos elevados";
        }
    }

    public static String calcularColesterol(double colesterol) {
        if(colesterol <= 200) {
            return "Colesterol normal";
        } else if(colesterol <= 240) {
            return "Colesterol elevado";
        } else {
            return"Colesterol muito elevado";
        }
    }

    public static void calcularExame(double glicose, double triglicerideos, double colesterol) {
        System.out.println("\nResultados dos exames:");
        System.out.println(calcularGlicose(glicose));
        System.out.println(calcularTriglicerideos(triglicerideos));
        System.out.println(calcularColesterol(colesterol));
    }

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.println("Digite a medida de glicose: ");
             double glicose = scanner.nextDouble();

             System.out.println("Digite a medida de triglicerídeos: ");
             double triglicerideos = scanner.nextDouble();

             System.out.println("Digite a medida de colesterol: ");
             double colesterol = scanner.nextDouble();

             calcularExame(glicose, triglicerideos, colesterol);

             scanner.close();
    }
}
