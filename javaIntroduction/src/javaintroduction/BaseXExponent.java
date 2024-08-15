package javaintroduction;

import java.util.Scanner;

public class BaseXExponent {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a base: ");
        double base = entrada.nextDouble();

        System.out.println("Insira o expoente: ");
        double expoente = entrada.nextDouble();

        System.out.println("Resultado: " + Math.pow(base, expoente));

    }
}
