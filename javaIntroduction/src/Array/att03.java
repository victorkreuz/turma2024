package Array;

import java.util.Scanner;

public class att03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[5];
        String nomeMaisCarac = "";
        int caracteres = 0;
        int Mcaracteres = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome" + (i + 1) + ":");
            nomes[i] = entrada.next();
            caracteres = nomes[i].length();
            if (caracteres > Mcaracteres) {
                Mcaracteres = caracteres;
                nomeMaisCarac = nomes[i];
            }
        }
        System.out.println("O nome com maior quantidade de caracteres é " + nomeMaisCarac + " que contém " + Mcaracteres + " caracteres.");
    }
}
