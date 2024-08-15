package javaintroduction;

import java.util.Scanner;

public class MoneyCounter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a quantidade de notas de dois reais: ");
        int reais2 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de cinco reais: ");
        int reais5 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de dez reais: ");
        int reais10 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de vinte reais: ");
        int reais20 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de cinquenta reais: ");
        int reais50 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de cem reais: ");
        int reais100 = entrada.nextInt();

        System.out.println("Insira a quantidade de notas de duzentos reais: ");
        int reais200 = entrada.nextInt();

        System.out.println("Sua quantia total é de: " + (reais2 * 2 + reais5 * 5 + reais10 * 10 + reais20 * 20 + reais50 * 50 + reais100 * 100 + reais200 * 200));

    }
}
