
package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe seu sexo: ");
        String sexo = entrada.next();
        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("seu peso ideal é: " + ((62.1 * altura)-44.7));
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("seu peso ideal é: " + ((72.7 * altura)-58));
        } else {
            System.out.println("Sexo inválido");

    
}}}
