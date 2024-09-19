package lacoDoWhile;

import java.util.Scanner;

public class att01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double valorTotal = 0;
        double kcalTotal = 0;

        do {
            exibirMenu();
            System.out.println("Insira o número do prato que deseja: ");
            int prato = entrada.nextInt();
            switch (prato) {
                case 1:
                    valorTotal += 65;
                    kcalTotal += 471;
                    break;
                case 2:
                    valorTotal += 105;
                    kcalTotal += 267;
                    break;
                case 3:
                    valorTotal += 105;
                    kcalTotal += 272;
                    break;
                case 4:
                    valorTotal += 95;
                    kcalTotal += 220;
                    break;
                case 5:
                    valorTotal += 55;
                    kcalTotal += 688;
                    break;

            }
            System.out.println("Deseja escolher mais alguma opção do cardápio?"
                    + "\nS - Sim"
                    + "\nN - Fechar pedido");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Pedido realizado com sucesso!"
                + "\nValor total: " + valorTotal+"\n"
                + "Kcal totais: " + kcalTotal);
    }

    public static void exibirMenu() {
        System.out.println("_____ MENU _____"
                + "\n1 - Macarrão (471 k/cal) 'porção de 300g'.........R$ 65,00 "
                + "\n2 - Filé bovino (267 k/cal) 'porção de 200g'......R$ 105,00 "
                + "\n3 - Filé suíno (272 k/cal) 'porção de 200g'.......R$ 105,00 "
                + "\n4 - Filé de frango (220 k/cal) 'porção de 200g'...R$ 95,00 "
                + "\n5 - Batata rústica (688 k/cal) 'porção de 400g'...R$ 55,00 ");

    }
}
