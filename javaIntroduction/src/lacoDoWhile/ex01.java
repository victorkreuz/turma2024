package lacoDoWhile;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cand1 = "Altair Peixoto";
        String cand2 = "Brunilda Teixeira";
        String cand3 = "Altíssimo Fontoura";
        String opcao = "";
        int votosCand1 = 0;
        int votosCand2 = 0;
        int votosCand3 = 0;
        int nulos = 0;

        do {
            System.out.println("Candidatos:");
            System.out.println("1 - Altair Peixoto");
            System.out.println("2 - Brunilda Teixeira");
            System.out.println("3 - Altíssimo Fontoura");
            System.out.println("Insira seu voto:");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    votosCand1++;
                    break;
                case 2:
                    votosCand2++;
                    break;
                case 3:
                    votosCand3++;
                    break;
                default:
                    nulos++;
            }
            System.out.println("Continuar votação?"
                    + "\nS - Sim"
                    + "\nN - Não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        if (votosCand1 > votosCand2 && votosCand1 > votosCand3) {
            System.out.println(cand1 + " foi o vencedor!");
        } else if (votosCand2 > votosCand1 && votosCand2 > votosCand3) {
            System.out.println(cand2 + " foi o vencedor!");
        } else {
            System.out.println(cand3 + " foi o vencedor!");
        }
        System.out.println(cand1 + " = " + votosCand1 + " votos");
        System.out.println(cand2 + " = " + votosCand2 + " votos");
        System.out.println(cand3 + " = " + votosCand3 + " votos");
    }
}
