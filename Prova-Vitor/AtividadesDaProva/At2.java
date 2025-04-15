

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class At2 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        Collections.addAll(nomes, "Vitor", "Igor", " Bryan", "Carlos", "Isabelle", "Marcelo", "João", "Marcia", "Luis", "Gabriel");
        
        ArrayList<String> palavrasFiltradas = new ArrayList<>();
        
        
        System.out.println("Array-list sem filtro: "+nomes);
        
        
        for(String palavra : nomes){
            if(palavra.length() > 6){
                
                palavrasFiltradas.add(palavra);
            }
            
        }
        System.out.println("Palavras com mais de 6 letras."+palavrasFiltradas);
        
        
    }
}
