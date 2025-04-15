

package AtividadesDaProva;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT29 {
    public static void main(String[] args) {
        String palavras = null;
        Scanner tc = new Scanner(System.in);
        String frase = qtdDigitos(palavras);
        
        System.out.println(frase.length());
        
        
    }

    public static String qtdDigitos(String palavras) {
            Scanner tc = new Scanner(System.in);
            System.out.println("Digite uma frase:");
            palavras = tc.nextLine();
            
            
            
            
            return palavras;
        
        
    }
}
