package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println("Seu número é par e foi somado com '5': " + (n + 5));
        } else {
            System.out.println((n + 8) + "Seu número é ímpar e foi somado com '8': ");
        }
    }
}
