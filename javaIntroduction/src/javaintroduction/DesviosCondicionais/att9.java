package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class att9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do produto:");
        double valor = entrada.nextDouble();
        System.out.println("Informe o meio de pagamento: ");
        System.out.println("Pagamento á vista ou cheque = 10% de desconto\n"
                + "Pagamento á vista no cartão de crédito = 15% de desconto\n"
                + "Pagamento em 2x = preço de etiqueta sem juros\n"
                + "Pagamento em 10x = preço de etiqueta mas juros de 10%");
        String mp = entrada.next();
        if (mp.equalsIgnoreCase("cheque")) {
            System.out.println("Total a pagar: " + (valor * 0.9));
        } else if (mp.equalsIgnoreCase("cartão")) {
            System.out.println("Total a pagar: " + (valor * 0.85));
        } else if (mp.equalsIgnoreCase("2x")) {
            System.out.println("Total a pagar; " + valor);
        } else if (mp.equalsIgnoreCase("10x")) {
            System.out.println("Total a pagar: " + (valor * 1.1));
        }

    }
}
