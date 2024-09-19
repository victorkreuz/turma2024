package lacoDoWhile;

import java.util.Scanner;

public class att02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorTotalF = 0;
        double valorTotalP = 0;
        String opcao = "";
        int numFilmes = 0;
        int numPedidos = 0;

        do {
            menuFilmes();

            System.out.println("Insira qual filme deseja assistir: ");
            int filme = entrada.nextInt();
            switch (filme) {
                case 1:
                    valorTotalF += 25;
                    numFilmes++;
                    break;
                case 2:
                    valorTotalF += 30;
                    numFilmes++;
                    break;
                case 3:
                    valorTotalF += 30;
                    numFilmes++;
                    break;
                case 4:
                    valorTotalF += 35;
                    numFilmes++;
                    break;
                case 5:
                    valorTotalF += 25;
                    numFilmes++;
                    break;
                default:
                    System.out.println("Você optou por não escolher um filme");
                    break;
            }

            cardapio();

            System.out.println("Insira qual item do cardápio você deseja: ");
            int pedido = entrada.nextInt();
            switch (pedido) {
                case 1:
                    valorTotalP += 5;
                    numPedidos++;
                    break;
                case 2:
                    valorTotalP += 10;
                    numPedidos++;
                    break;
                case 3:
                    valorTotalP += 8;
                    numPedidos++;
                    break;
                case 4:
                    valorTotalP += 10;
                    numPedidos++;
                    break;
                case 5:
                    valorTotalP += 15;
                    numPedidos++;
                    break;
                case 6:
                    valorTotalP += 20;
                    numPedidos++;
                    break;
                default:
                    System.out.println("Você optou por não consumir nenhum item.");
                    break;
            }
            System.out.println("Deseja escolher mais alguma opção do cardápio/catálogo?"
                    + "\nS - Sim"
                    + "\nN - Fechar pedido");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Pedido realizado com sucesso!"
                + "\n_-_-_- Volte Sempre! -_-_-_"
                + "\nNúmero de ingressos adquiridos: " + numFilmes + "\n"
                + "Valor total de ingressos: " + valorTotalF + "\n"
                + "Número de pedidos feitos: " + numPedidos + "\n"
                + "Valor total de pedidos: " + valorTotalP + "\n"
                + "Total a pagar: " + valorTotalF + valorTotalP);

    }

    public static void menuFilmes() {
        System.out.println("-_-_-_| FILMES EM CATÁLOGO |_-_-_-"
                + "\n1 - A festa da Salsicha.................R$25,00"
                + "\n2 - Clube da Luta.......................R$30,00"
                + "\n3 - Django Livre........................R$30,00"
                + "\n4 - O Lobo de Wall Street...............R$35,00"
                + "\n5 - O touro Ferdinando..................R$25,00"
                + "\n6 - Não desejo escolher nenhum filme");
    }

    public static void cardapio() {
        System.out.println("-_-_-_| CARDÁPIO |_-_-_-"
                + "\n1 - Refrigerante lata '350ml'.......R$5,00"
                + "\n2 - Cerveja longneck................R$10,00"
                + "\n3 - Cerveja lata '473ml'............R$8,00"
                + "\n4 - Pipoca 'P' (salgada/doce).......R$10,00"
                + "\n5 - Pipoca 'm' (salgada/doce).......R$15,00"
                + "\n6 - Pipoca 'g' (salgada/doce........R$20,00"
                + "\n7 - Não desejo consumir nada.");
    }
}
