package SwitchCase;

import java.util.Scanner;

//author: Victor Kreuz
public class att02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor:");
        int valor = entrada.nextInt();
        int un = valor % 10;
        int dez = valor % 100 / 10;
        int cen = valor % 1000 / 100;
        int uM = valor / 1000;
        String ext = "";
        switch (uM) {
            case 1:
                ext = ext + "mil ";
                break;
            case 2:
                ext = ext + "dois mil ";
                break;
            case 3:
                ext = ext + "três mil ";
                break;
            case 4:
                ext = ext + "quatro mil ";
                break;
            case 5:
                ext = ext + "cinco mil ";
                break;
            case 6:
                ext = ext + "seis mil ";
                break;
            case 7:
                ext = ext + "sete mil ";
                break;
            case 8:
                ext = ext + "oito mil ";
                break;
            case 9:
                ext = ext + "nove mil ";
                break;
        }
        switch (cen) {
            case 1:
                if (un == 0 && dez == 0) {
                    ext = ext + "cem";
                } else {
                    ext = ext + "cento ";
                }
                break;
            case 2:
                ext = ext + "duzentos ";
                break;
            case 3:
                ext = ext + "trezentos ";
                break;
            case 4:
                ext = ext + "quatrocentos ";
                break;
            case 5:
                ext = ext + "quinhentos ";
                break;
            case 6:
                ext = ext + "seiscentos ";
                break;
            case 7:
                ext = ext + "setecentos ";
                break;
            case 8:
                ext = ext + "oitocentos ";
                break;
            case 9:
                ext = ext + "nevecentos ";
                break;
        }
        switch (dez) {
            case 1:
                switch (un) {
                    case 0:
                        ext = ext + "dez";
                        break;
                    case 1:
                        ext = ext + "onze";
                        break;
                    case 2:
                        ext = ext + "doze";
                        break;
                    case 3:
                        ext = ext + "treze";
                        break;
                    case 4:
                        ext = ext + "quatorze";
                        break;
                    case 5:
                        ext = ext + "quinze";
                        break;
                    case 6:
                        ext = ext + "desesseis";
                        break;
                    case 7:
                        ext = ext + "desessete";
                        break;
                    case 8:
                        ext = ext + "dezoito";
                    case 9:
                        ext = ext + "dezenove";
                        break;
                }
                break;
            case 2:
                ext = ext + "vinte ";
                break;
            case 3:
                ext = ext + "trinta ";
                break;
            case 4:
                ext = ext + "quarenta ";
                break;
            case 5:
                ext = ext + "cinquenta ";
                break;
            case 6:
                ext = ext + "sessenta ";
                break;
            case 7:
                ext = ext + "setenta ";
                break;
            case 8:
                ext = ext + "oitenta ";
                break;
            case 9:
                ext = ext + "noventa ";
                break;
        }
        switch (un) {
            case 1:
                ext = ext + "um";
                break;
            case 2:
                ext = ext + "dois";
                break;
            case 3:
                ext = ext + "três";
                break;
            case 4:
                ext = ext + "quatro";
                break;
            case 5:
                ext = ext + "cinco";
                break;
            case 6:
                ext = ext + "seis";
                break;
            case 7:
                ext = ext + "sete";
                break;
            case 8:
                ext = ext + "oito";
                break;
            case 9:
                ext = ext + "nove";
                break;
        }
        System.out.println(ext);
    }

}
