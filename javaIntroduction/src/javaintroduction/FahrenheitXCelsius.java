
package javaintroduction;

import java.util.Scanner;

public class FahrenheitXCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em Fahreinheit:");
        double temp1 = entrada.nextDouble();
        
        System.out.println("Essa temperatura em Celsius é igual à:" + (temp1 - 32)*(5.0/9.0));
    
}}
