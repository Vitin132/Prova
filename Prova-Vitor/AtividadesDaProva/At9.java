

package AtividadesDaProva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class At9 {

   public static void main(String[] args) {
        
        HashSet<String> animais = new HashSet<>(Arrays.asList("Jaguar", "Onça", "Leão", "Javali"));
        
        
        
        System.out.println("A lista de animais é: ");
        
        
        
        System.out.println(animais);
        
        
        Iterator<String> iterator = animais.iterator();
        
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
            
            
            
        
        
        
        
    }
    
    
    
}
