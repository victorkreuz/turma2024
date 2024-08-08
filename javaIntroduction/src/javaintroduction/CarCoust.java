
package javaintroduction;

import java.util.Scanner;

public class CarCoust {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor original do carro:");
        double precoOriginal = entrada.nextDouble();
        
        double total = precoOriginal * 1.28 + precoOriginal * 0.45;
        System.out.println("Preço com reajuste: "+total);
        


}}
