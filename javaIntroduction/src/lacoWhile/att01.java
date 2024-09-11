package lacoWhile;

import java.util.Scanner;

public class att01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o valor da material radioativo em gramas");
        double massa = entrada.nextDouble();
        double massaInicial = massa;
        int tempo = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa);
        System.out.println("Tempo em horas: " + tempo / 3600);
        System.out.println("Tempo em minutos; " + tempo % 3600 / 60);
        System.out.println("Tempo em segundos; " + tempo % 60);

    }
}
