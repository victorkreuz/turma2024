package javaintroduction;

import java.util.Scanner;

public class StudantGrades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double primeiraNota = entrada.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double segundaNota = entrada.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double terceiraNota = entrada.nextDouble();

        double notaFinal = (primeiraNota * 2 + segundaNota * 3 + terceiraNota * 5) / 10;
        System.out.println("Sua média final é: " + notaFinal);

    }
}
