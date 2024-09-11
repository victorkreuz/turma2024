package lacoWhile;

import java.util.Scanner;

public class att02 {

    public static void main(String[] args) {
        double popPaisA = 80000;
        double popPaisB = 200000;
        int anos = 0;
        while (popPaisA < popPaisB) {
            popPaisA = popPaisA * 1.03;
            popPaisB = popPaisB * 1.015;
            anos++;
        }
        System.out.println("Anos: " + anos);
    }
}
