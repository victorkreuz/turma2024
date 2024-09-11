package lacoWhile;

import java.util.Scanner;

public class att04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codA = 0;
        double alturaA = 0;
        double pesoA = 0;

        int codB = 0;
        double alturaB = 500;
        double pesoB = 0;

        int codG = 0;
        double alturaG = 0;
        double pesoG = 0;

        int codM = 0;
        double alturaM = 0;
        double pesoM = 10000;

        double pesoTotal = 0;
        double alturaTotal = 0;
        int cont = 0;

        int cod = -1;

        while (cod != 0) {
            System.out.println("Informe o código: ");
            int codigo = entrada.nextInt();
            System.out.println("Informe o peso: ");
            double peso = entrada.nextDouble();
            System.out.println("Informe a altura: ");
            double altura = entrada.nextDouble();

            if (altura > alturaA) {
                codA = codigo;
                alturaA = altura;
                pesoA = peso;
            }
            if (altura < alturaB) {
                codB = codigo;
                alturaB = altura;
                pesoB = peso;
            }
            if (peso > pesoG) {
                codG = codigo;
                pesoG = peso;
                alturaG = altura;
            }
            if (peso < pesoM) {
                codM = codigo;
                pesoM = peso;
                alturaM = altura;
            }

            pesoTotal += peso;
            alturaTotal += altura;
            cont++;

            System.out.println("Opções: "
                    + "\n0 - para sair."
                    + "\n1 - para um novo cadastro.");
            cod = entrada.nextInt();

        }
        System.out.println("Pessoa mais alta\n"
                + "Código: " + codA + "\n"
                + "Altura: " + alturaA + "\n"
                + "Peso: " + pesoA);
        System.out.println("Pessoa mais baixa\n"
                + "Código: " + codB + "\n"
                + "Altura: " + alturaB + "\n"
                + "Peso: " + pesoB);
        System.out.println("Pessoa mais obesa\n"
                + "Código: " + codG + "\n"
                + "Altura: " + alturaG + "\n"
                + "Peso: " + pesoG);
        System.out.println("Pessoa mais magra\n"
                + "Código: " + codM + "\n"
                + "Altura: " + alturaM + "\n"
                + "Peso: " + pesoM);
        System.out.println("Médias: \n"
                + "Altura: " + ((alturaM + alturaG + alturaA + alturaB) / 4) + "\n"
                + "Peso: " + (pesoM + pesoG + pesoA + pesoB) / 4);

    }

}
