

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class At8 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        ArrayList<String> interseccao = new ArrayList<>();

        Collections.addAll(nomes, "Vitor", "Roberta", "Lucas", "Igor", "Mariana");
        Collections.addAll(nomes2, "Laís", "Giovana", "Lucas", "Caio", "Mariana");

        System.out.println("1ª lista de nomes:");
        System.out.println(nomes);

        System.out.println("2ª lista de nomes:");
        System.out.println(nomes2);

        System.out.println("Intersecção das listas:");

        for (String nome : nomes) {
            if (nomes2.contains(nome)) {
                interseccao.add(nome);
            }
        }
        
        System.out.println(interseccao);

    }
    
    
}
