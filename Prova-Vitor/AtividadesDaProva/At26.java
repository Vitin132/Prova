

package AtividadesDaProva;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At26 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        
        
        String login = null;
        
        System.out.println("Digite o nome de usuario:");
        String user = tc.nextLine();
        
        System.out.println("Digite a senha: ");
        login = tc2.nextLine();
        if(login.equalsIgnoreCase("1234")){
            System.out.println("Bem vindo "+user);
        }else {
            for (int i = 0; i < 2; i++) {
                
                System.out.println("Senha incorreta! ");
                System.out.println((2-i)+" tentativas restantes: ");
                login = tc2.nextLine();
            }
            System.out.println("Login inválido!");
            
        }
        
        
        
    }
}
