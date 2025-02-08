package funcoes;

import java.util.Scanner;

public class MenorDeTres {

    public static int menorDeTres(int x, int y, int z) {
        // Verifica se x é o menor
        if (x < y && x < z) {
            return x;
        } 
        // Verifica se y é o menor
        else if (y < x && y < z) {
            return y;
        } 
        // Se nem x nem y são os menores, então z é o menor
        else {
            return z;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três númeors inteiros: "); 
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        int terceiroNumero = scanner.nextInt();

        int menorNumero = menorDeTres(primeiroNumero, segundoNumero, terceiroNumero);

        //int menorNumero = Math.min(Math.min(primeiroNumero, segundoNumero), terceiroNumero);

        System.out.printf("O menor número é: %d%n", menorNumero);

        scanner.close();
    }
}
