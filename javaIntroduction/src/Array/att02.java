package Array;

import java.util.Scanner;

public class att02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];
        int numNeg = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o número " + i + ":");
            num[i] = entrada.nextInt();
            if (num[i] < 0) {
                numNeg++;
            }
        }
        System.out.println("Numero de algarismos negativos: " + numNeg);
    }
}
