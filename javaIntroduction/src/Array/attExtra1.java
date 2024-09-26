package Array;

import java.util.Scanner;

public class attExtra1 {

    Scanner entrada = new Scanner(System.in);
    double notasA[] = new double[10];
    double notasB[] = new double[10];
    double notasC[] = new double[10];
    double notasD[] = new double[10];
    double medias[] = new double[10];
    double maiorMedia = 0;
    int alunosCadastrados = 0;
    int notasCadastradas = 0;
    String alunos[] = new String[10];
    String alunoMaiorMedia[] = new String[10];

    public static void main(String[] args) {
        attExtra1 class01 = new attExtra1();
        int opcao = 0;
        do {
            opcao = class01.menuOpcoes();
            switch (opcao) {
                case 1:
                    class01.cadastrarAlunos();
                    break;
                case 2:
                    class01.cadastrarNotas();
                    break;
                case 3:
                    class01.calcularMédias();
                    break;
                case 4:
                    class01.exibirMedias();
                    break;
                case 5:
                    class01.exibirAlunoComMaiorMedia();
                    break;
                case 6:
                    class01.exibirAlunoComMaiorNotaEmDeterminadaDisciplina();
                    break;
                case 7:
                    class01.exibirListaDeAlunosComResultadoFinal();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 8);

    }

    public int menuOpcoes() {
        System.out.println("\n"
                + "\n"
                + "=== Menu de Opções ===\n"
                + "1. Cadastrar Alunos\n"
                + "2. Cadastrar Notas\n"
                + "3. Calcular Médias\n"
                + "4. Exibir Médias\n"
                + "5. Exibir Aluno com Maior Média\n"
                + "6. Exibir Aluno com Maior Nota em determinada Disciplina\n"
                + "7. Exibir lista de alunos com o resultado final (aprovado ou reprovado)\n"
                + "8. Sair do Programa\n"
                + "Escolha uma opção (1-8):");
        return entrada.nextInt();
    }

    public void cadastrarAlunos() {
        System.out.println("Digite o nome do aluno que deseja cadastrar: ");
        alunos[alunosCadastrados] = entrada.next();
        alunosCadastrados++;
    }

    public void cadastrarNotas() {
        System.out.println("Insira a nota que deseja cadastrar: ");
        do {
            System.out.println("Nota da disciplina A: ");
            notasA[notasCadastradas] = entrada.nextDouble();
        } while (notasA[notasCadastradas] < 0 || notasA[notasCadastradas] > 10);

        do {
            System.out.println("Nota da disciplina B: ");
            notasB[notasCadastradas] = entrada.nextDouble();
        } while (notasB[notasCadastradas] < 0 || notasB[notasCadastradas] > 10);

        do {
            System.out.println("Nota da disciplina C: ");
            notasC[notasCadastradas] = entrada.nextDouble();
        } while (notasC[notasCadastradas] < 0 || notasC[notasCadastradas] > 10);

        do {
            System.out.println("Nota da disciplina D: ");
            notasD[notasCadastradas] = entrada.nextDouble();
        } while (notasD[notasCadastradas] < 0 || notasD[notasCadastradas] > 10);
        notasCadastradas++;

    }

    public void calcularMédias() {
        for (int i = 0; i < 10; i++) {
            medias[i] = ((notasA[i] + notasB[i] + notasC[i] + notasD[i]) / 4);
        }
    }

    public void exibirMedias() {
        for (int i = 0; i < alunosCadastrados; i++) {
            System.out.println("Nome do aluno: " + alunos[i]);
            System.out.println("Média do aluno: " + medias[i]);
        }
    }

    public void exibirAlunoComMaiorMedia() {
        for (int i = 0; i < alunosCadastrados; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                System.out.println("O aluno com maior média é " + alunos[i] + " com " + maiorMedia + ".");

            }
        }

    }

    public void exibirAlunoComMaiorNotaEmDeterminadaDisciplina() {
        int posicao = 0;
        double maiorNotaEmDeterminadaDisciplina = 0;
        System.out.println("Escolha a disciplina que você deseja vizualizar a nota: \n"
                + "1 - Disciplina A\n"
                + "2 - Disciplina B\n"
                + "3 - Disciplina C\n"
                + "4 - Disciplina D");

        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                for (int i = 0; i < alunosCadastrados; i++) {
                    if (notasA[i] > maiorNotaEmDeterminadaDisciplina) {
                        notasA[i] = maiorNotaEmDeterminadaDisciplina;
                        posicao = i;
                    }
                }
                System.out.println("O aluno com maior média na desciplina A é: " + alunos[posicao] + " com " + maiorNotaEmDeterminadaDisciplina);

                break;
            case 2:
                for (int i = 0; i < alunosCadastrados; i++) {
                    if (notasB[i] > maiorNotaEmDeterminadaDisciplina) {
                        notasB[i] = maiorNotaEmDeterminadaDisciplina;
                        posicao = i;
                    }
                }
                System.out.println("O aluno com maior média na desciplina B é: " + alunos[posicao] + " com " + maiorNotaEmDeterminadaDisciplina);

                break;
            case 3:
                for (int i = 0; i < alunosCadastrados; i++) {
                    if (notasC[i] > maiorNotaEmDeterminadaDisciplina) {
                        notasC[i] = maiorNotaEmDeterminadaDisciplina;
                        posicao = i;
                    }
                }
                System.out.println("O aluno com maior média na desciplina C é: " + alunos[posicao] + " com " + maiorNotaEmDeterminadaDisciplina);

                break;
            case 4:
                for (int i = 0; i < alunosCadastrados; i++) {
                    if (notasD[i] > maiorNotaEmDeterminadaDisciplina) {
                        notasD[i] = maiorNotaEmDeterminadaDisciplina;
                        posicao = i;
                    }
                }
                System.out.println("O aluno com maior média na desciplina D é: " + alunos[posicao] + " com " + maiorNotaEmDeterminadaDisciplina);

                break;
        }
    }

    public void exibirListaDeAlunosComResultadoFinal() {
        for (int i = 0; i < alunosCadastrados; i++) {
            if (medias[i] < 6) {
                System.out.println("O aluno " + alunos[i] + " foi reprovado com a nota " + medias[i] + ".");
            } else {
                System.out.println("O aluno " + alunos[i] + " foi aprovado com a nota " + medias[i] + ".");
            }
        }
    }
}
