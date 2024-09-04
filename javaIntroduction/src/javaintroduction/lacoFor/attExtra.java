package lacoFor;

import java.util.Scanner;

public class attExtra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 1000;
        for (int i = 1; i <= 10; i++) {
            valor = valor * 1.05;
            System.out.printf("valor: %.2f %n", valor);
            
        }
    }
}
