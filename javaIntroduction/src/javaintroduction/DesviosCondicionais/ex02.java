
package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor 1: ");
        int n1 = entrada.nextInt();
        System.out.println("Informe o valor 2: ");
        int n2 = entrada.nextInt();
        if(n1>n2){
            System.out.println("O maior valor é n1: "+n1);
        }else{
            System.out.println("O maior valor é n2: "+n2);
        }
        
   
}}
