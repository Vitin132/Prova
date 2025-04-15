

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT27 {
    public static void main(String[] args) {
        
        ArrayList<String> frutas = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite 6 frutas: ");
        for (int i = 0; i < 6; i++) {
            frutas.add(tc.nextLine());
        }
        
        for(String comeca : frutas){
            if(comeca.startsWith("A") 
                    || comeca.startsWith("E") 
                    || comeca.startsWith("I") 
                    || comeca.startsWith("O") 
                    || comeca.startsWith("U")
                    || comeca.startsWith("a")
                    || comeca.startsWith("e")
                    || comeca.startsWith("i")
                    || comeca.startsWith("o")
                    || comeca.startsWith("u")){
                System.out.println(comeca);
                
            }
            
        }
        
    }
}
