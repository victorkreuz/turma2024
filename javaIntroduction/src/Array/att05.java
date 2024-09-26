package Array;

import java.util.Scanner;

public class att05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira os números para o vetor 1: ");
            a[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira os números para o vetor 2: ");
            b[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            resultado = a[i] * b[i];
            System.out.println("Multiplicações entre os vetores na posição " + i + ": " + resultado);
        }

    }

}
