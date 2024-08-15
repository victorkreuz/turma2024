package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");
        int idade = entrada.nextInt();
        if (idade < 15) {
            System.out.println("Você está caracterizado no grupo 'criança'");
        }
        if ((idade > 15) && (idade < 60)) {
            System.out.println("Você está caracterizado no grupo 'adulto'");
        }
        if (idade >= 60) {
            System.out.println("Você está caracterizado no grupo 'idoso'");
        }

    }
}
