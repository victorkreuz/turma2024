
package lacoWhile;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o usuário: ");
        String usuario = entrada.next();
        System.out.println("Informe a senha: ");
        String senha = entrada.next();
        int tentativas = 1;
                
        while (usuario.equals(senha) && tentativas < 3) {
            System.out.println("Usuário não pode ser igual a senha!");
            System.out.println("Informe o usuário: ");
            usuario = entrada.next();
            System.out.println("Informe a senha: ");
            senha = entrada.next();
            tentativas++;
        }
        if(tentativas==3 && usuario.equals(senha)){
            System.out.println("Acesso negado!");
        }else{
            System.out.println("Acesso Permitido!");
        }
    }
}
