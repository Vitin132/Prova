

package AtividadesDaProva;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At13 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite uma frase em que a palavra Java esteja presente: ");
        String frase = teclado.nextLine();
        
        
        if(frase.contains("java") || frase.contains("Java") || frase.contains("JAVA")){
            System.out.println("A frase digitada contém a palavra java.");
        }else{
            System.out.println("Não contém a palavra Java.");
        }
        
        
        
        
    }
    
    
}
