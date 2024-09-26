package Array;

import java.util.Scanner;

public class att06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[6];
        String nomeBuscar = "";
        boolean nomeDesconhecido = true;
        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o nome " + (i+1) + ": ");
            nomes[i] = entrada.next();
        }
        System.out.println("Informe o nome que você deseja buscar: ");
        nomeBuscar = entrada.next();
        for (int i = 0; i < 6; i++) {
            if (nomeBuscar.equalsIgnoreCase(nomes[i])) {
                System.out.println("O nome já está registrado na posição " + (i + 1));
                nomeDesconhecido = false;
            }
        }
        if (nomeDesconhecido) {
            System.out.println("O nome não está no sistema.");
        }
    }
}
