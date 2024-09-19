package lacoDoWhile;

import java.util.Random;
import java.util.Scanner;

public class att03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tentativas = 0;
        int num = 0;
        Random r = new Random();
        int s = r.nextInt(1000) + 1;
        do {
            System.out.println("Insira o Número: ");
            num = entrada.nextInt();
            if (num != s) {
                tentativas++;
                System.out.println("Você errou, tente novamente: ");
            }
            if (num > s) {
                System.out.println("O número digitado é maior que o sorteado.");
            } else if (num < s) {
                System.out.println("Seu número digitado é menor que o sorteado.");
            }
        } while (num != s);
        System.out.println("Parabéns, você acertou! Seu total de tentativas é: " + tentativas);
        if (tentativas < 3) {
            System.out.println("P.A.R.A.B.É.N.S\n"
                    + " você teve um ecxelente desempenho!");
        }
        if (tentativas < 9){
            System.out.println("Desempenho médio");
        } else {
            System.out.println("SEU ANIMAL!");
        }

    }
}
