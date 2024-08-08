
package javaintroduction;

import java.util.Scanner;

public class SalaryAdjustment {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Informe o salário atual: ");
        double salarioAtual = entrada.nextInt();
        
        System.out.println("Informe a porcentagem de reajuste(%): ");
        double porcentagemDeReajuste = entrada.nextInt();
        
        double total = porcentagemDeReajuste / 100 * salarioAtual + salarioAtual;
        System.out.println("Salário com o reajuste: " + total);
        
        
                
   }
}
