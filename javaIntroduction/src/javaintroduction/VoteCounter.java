package javaintroduction;

import java.util.Scanner;

public class VoteCounter {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe os votos brancos:");
        int votosBrancos = entrada.nextInt();
        System.out.println("Informe os votos nulos:");
        int votosNulos = entrada.nextInt();
        System.out.println("Informe os votos válidos:");
        int votosVálidos = entrada.nextInt();
        int total = votosBrancos + votosNulos + votosVálidos;
        System.out.println("Total de votos:"+total);
        
        double porcentagemB = votosBrancos*100/total;
        System.out.println("Porcentagem de votos brancos:"+porcentagemB+"%");
        
        double porcentagemN = votosNulos*100/total;
        System.out.println("Porcentagem de votos nulos:"+porcentagemN+"%");
        
        double porcentagemV = votosVálidos*100/total;
        System.out.println("Porcentagem de votos válidos:"+porcentagemV+"%");
        
        
        

    }
}
