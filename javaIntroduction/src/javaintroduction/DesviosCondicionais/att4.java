package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int n = entrada.nextInt();
        System.out.println("O resultado é: ");
        if (n > 0) {
            System.out.println(n * 2);
        } else {
            System.out.println(n * 3);
        }

    }
}
