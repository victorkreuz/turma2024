package javaintroduction.DesviosCondicionais;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o sexo:"
                + "\n F para feminino"
                + "\n M para masculino");
        String sexo = entrada.next();
        if (sexo.equals("F")) {
            System.out.println("Feminino.");
        } else if (sexo.equals("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo inválido");

        }
    }
}
