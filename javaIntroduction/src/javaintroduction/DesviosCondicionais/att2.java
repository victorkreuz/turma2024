package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n1 = entrada.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Seu número é par: ");
        } else {
            System.out.println("Seu número é ímpar: ");
        }

    }
}
