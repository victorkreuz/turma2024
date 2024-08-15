package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor inteiro para 'A':");
        int a = entrada.nextInt();
        System.out.println("Informe um valor inteiro para 'B':");
        int b = entrada.nextInt();
        int c;
        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O valor de 'C' é:" + c);

    }
}
