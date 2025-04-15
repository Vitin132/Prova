

package AtividadesDaProva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class AT30 {

    public static void main(String[] args) {
        
        Set<String> frases1 = new HashSet<>(Arrays.asList("ola", "tudo", "bom"));
        Set<String> frases2 = new HashSet<>(Arrays.asList("nao", "esta", "tudo", "ruim"));
        
        
        System.out.println(frases1);
        System.out.println(frases2);
        
        
        frases1.addAll(frases2);
        
        System.out.println(frases1);
        
        
        
    }
    
    
    
}
