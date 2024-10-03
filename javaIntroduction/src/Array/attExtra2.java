package Array;

import java.util.Scanner;

public class attExtra2 {

    Scanner entrada = new Scanner(System.in);
    double valorProduto[] = new double[10];
    int estoqueProduto[] = new int[10];
    String produto[] = new String[10];
    double faturamento[] = new double[10];
    int tamanhoListaProdutos = 0;

    public static void main(String[] args) {
        attExtra2 class01 = new attExtra2();
        int opcao = 0;
        do {
            opcao = class01.menu();
            switch (opcao) {
                case 0:
                    class01.motrarRelatorioDeProdutos();
                    break;
                case 1:
                    class01.cadastroProdutos();
                    break;
                case 2:
                    class01.realizacaoVendas();
                    break;
                case 3:
                    class01.exibicaoFaturamento();
                    break;
                case 4:
                    class01.produtoMaisVendido();
                    break;
                case 5:
                    class01.produtoMaiorFaturamento();
                    break;
                case 6:
                    class01.relatorioEstoqueBaixo();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 7);

    }

    public int menu() {
        System.out.println("=== Menu de Opções ===\n"
                + "0. exibir relatório\n"
                + "1. Cadastrar Produto\n"
                + "2. Realizar Venda\n"
                + "3. Exibir Faturamento Total\n"
                + "4. Exibir Produto mais Vendido\n"
                + "5. Exibir Produto com Maior Faturamento\n"
                + "6. Relatório de Estoque Baixo\n"
                + "7. Sair do Programa\n"
                + "Escolha uma opção (1-7):");
        int opcaoMenu = entrada.nextInt();
        return opcaoMenu;
    }

    public void cadastroProdutos() {

        System.out.println("Insira o nome do produto: ");
        produto[tamanhoListaProdutos] = entrada.next();
        System.out.println("Insira o valor do produto: ");
        valorProduto[tamanhoListaProdutos] = entrada.nextDouble();
        System.out.println("Insira a quantidade do produto: ");
        estoqueProduto[tamanhoListaProdutos] = entrada.nextInt();
        tamanhoListaProdutos++;
    }

    public void realizacaoVendas() {
        
        System.out.println("Insira o produto vendido: ");
        String produtoVendido = entrada.next();

        System.out.println("Insira a quantidade vendida: ");
        int quantidadeVendida = entrada.nextInt();

        for (int i = 0; i < 10; i++) {
            if (produtoVendido.equalsIgnoreCase(produto[i])) {
                if (quantidadeVendida <= estoqueProduto[i]) {
                    estoqueProduto[i] = estoqueProduto[i] - quantidadeVendida;
                    faturamento[i] = faturamento[i] + (valorProduto[i] * quantidadeVendida);
                    System.out.println("Venda realizada com sucesso!");
                    return;
                } else {
                    System.out.println("A quantidade vendida excede o estoque.");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void exibicaoFaturamento() {
        for (int i = 0; i < tamanhoListaProdutos; i++) {
            System.out.println("O faturamento do produto " + produto[i] + " é de: " + faturamento[i] + ".");
        }
    }

    public void produtoMaisVendido() {
        double quantidadeMaisVendida = 0;
        String nomeProdutoMaisVendido = "";
        for (int i = 0; i < tamanhoListaProdutos; i++) {
            if (quantidadeMaisVendida < (faturamento[i] / valorProduto[i])) {
                quantidadeMaisVendida = faturamento[i] / valorProduto[i];
                nomeProdutoMaisVendido = produto[i];
            }
        }
        System.out.println("O produto mais vendido é: " + nomeProdutoMaisVendido);
    }

    public void produtoMaiorFaturamento() {
        double maiorFaturamentoProdutos = 0;
        String produtoMaiorFaturamento = "";

        for (int i = 0; i < tamanhoListaProdutos; i++) {
            if (maiorFaturamentoProdutos < faturamento[i]) {
                maiorFaturamentoProdutos = faturamento[i];
                produtoMaiorFaturamento = produto[i];
            }
        }
        System.out.println("O produto com maior faturamento é: " + produtoMaiorFaturamento + ".");
    }

    public void relatorioEstoqueBaixo() {
        for (int i = 0; i < tamanhoListaProdutos; i++) {
            if (estoqueProduto[i] < 10) {
                System.out.println("O estoque do produto " + produto[i] + " está baixo.");
            }
        }
    }

    public void motrarRelatorioDeProdutos() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < tamanhoListaProdutos; i++) {
            System.out.println(formatarSaida(produto[i], 20)
                    + formatarSaida("R$ " + valorProduto[i], 10)
                    + formatarSaida("" + estoqueProduto[i], 10));
        }
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }
}
