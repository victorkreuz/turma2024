package Array;

import java.util.Scanner;

public class att01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o número " + i + ":");
            num[i] = entrada.nextInt();
            soma = num[i] + soma;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
