package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor 1: ");
        double v1 = entrada.nextDouble();
        System.out.println("Insira o valor 2: ");
        double v2 = entrada.nextDouble();
        System.out.println("Insira o valor 3: ");
        double v3 = entrada.nextDouble();

        if ((v1 > v2) && (v2 > v3)) {
            System.out.println(v1 + "; " + v2 + "; " + v3);
        } else if (v1 > v3 && v3 > v2) {
            System.out.println(v1 + "; " + v3 + "; " + v2);
        } else if (v2 > v1 && v1 > v3) {
            System.out.println(v2 + "; " + v1 + "; " + v3);
        } else if (v2 > v3 && v3 > v1) {
            System.out.println(v2 + "; " + v2 + "; " + v1);
        } else if (v3 > v1 && v1 > v2) {
            System.out.println(v3 + "; " + v1 + "; " + v2);
        } else if (v3 > v2 && v2 > v1) {
            System.out.println(v3 + "; " + v2 + "; " + v1);
        }
    }
}
