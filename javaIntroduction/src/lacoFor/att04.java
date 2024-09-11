package lacoFor;

import java.util.Scanner;

public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o valor " + i + ":");
            valor = valor + entrada.nextDouble();

        }
        System.out.println("Soma:" + valor);
        System.out.println("Média" + valor / 5);
    }
}
