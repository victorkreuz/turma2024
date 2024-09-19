package Array;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] idades = new int[10000];
        Random aleatorio = new Random();
        for (int i = 0; i < 10000; i++) {
            idades[i] = aleatorio.nextInt(101);
        }
        int pcmd60 = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > 60) {
                pcmd60++;
            }
        }
        int pmv = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > pmv) {
                pmv = idades[i];
            }
        }
        int pcmd18 = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] < 18) {
                pcmd18++;
            }
        }
        int mediaIdades = 0;
        int totalIdades = 0;
        for (int i = 0; i < 10000; i++) {
            totalIdades = totalIdades + idades[i];
            mediaIdades = totalIdades / 10000;

        }
        System.out.println("Pessoas com mais de 60 anos: " + pcmd60);
        System.out.println("Pessoas com menos de 18 anos: " + pcmd18);
        System.out.println("Pessoa mais velha: " + pmv);
        System.out.println("Média de idade: " + mediaIdades);
    }
}
