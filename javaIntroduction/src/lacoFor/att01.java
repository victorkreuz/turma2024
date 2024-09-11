package lacoFor;

import java.util.Scanner;

public class att01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número");
        int numero = entrada.nextInt();
        for (int i = 1; i < 100000; i++) {
            System.out.println(i + " x " + numero + " = " + i * numero);
        }
    }
}
