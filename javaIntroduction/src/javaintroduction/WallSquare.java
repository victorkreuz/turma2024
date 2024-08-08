
package javaintroduction;

import java.util.Scanner;

public class WallSquare {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Insira o comprimento da parede 1: ");
        double parede1 = entrada.nextDouble();
        
        System.out.println("Insira o comprimento da parede 2: ");
        double parede2 = entrada.nextDouble();
        
        System.out.println("O comprimento de 'H' deve ser: " + Math.sqrt (Math.pow (parede1,2) + Math.pow (parede2,2)));
        
        
}}
