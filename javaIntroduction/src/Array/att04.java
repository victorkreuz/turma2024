package Array;

import java.util.Scanner;

public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        double numMaiorMedia = 0;

        double num[] = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Insira o número " + i + ":");
            num[i] = entrada.nextDouble();
            soma = num[i] + soma;
            media = soma / 8;
        }

        System.out.println("A média dos números é: " + media);
        System.out.println("Seguem os números maiores que a média: ");

        for (int i = 0; i < 8; i++) {
            if (num[i] > media) {
                System.out.println(num[i]);
            }

        }
    }
}
