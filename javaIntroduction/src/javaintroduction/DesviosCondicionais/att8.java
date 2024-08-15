package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = entrada.nextDouble();
        double re = peso / Math.pow(altura, 2);
        if (re<18.5){
            System.out.println("Você está abaixo do peso.");
        }else if (re<25) {
            System.out.println("Você está com um peso ideal.");
        }else if (re<30) {
            System.out.println("Você está acima do peso.");
        }else {
            System.out.println("Você está caracterizado como 'obeso'.");
        }

    }}
