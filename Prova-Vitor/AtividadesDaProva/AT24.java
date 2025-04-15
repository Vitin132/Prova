

package AtividadesDaProva;

import java.util.Scanner;

/**
 
 * @author Aluno
 */
public class AT24 {

    public static void main(String[] args) {
        
        String palavra = null;
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Digite uma palavra: ");
        palavra = tc.nextLine();
        
        String vogaisAlteradas = palavra.replaceAll("[AEIOUaeiou]", "*");
        
        System.out.println("Vogais alteradas: "+vogaisAlteradas);
        
        
    }
    
    
    
}
