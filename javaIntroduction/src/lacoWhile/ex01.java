package lacoWhile;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor entre 0 e 10:");
        double nota = entrada.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota informada não é válida!");
            System.out.println("Informe um valor entre 0 e 10:");
            nota = entrada.nextDouble();
        }
        System.out.println("Nota informada -> "+ nota);
    }
}