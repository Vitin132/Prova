package AtividadesDaProva;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class At20 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();
        Set<Integer> idades = new HashSet<>();
        
        
        
        Clientes(nomes, idades);
        
        
        
    }

    public static void Clientes(Set<String> nomes, Set<Integer> idades) {

        Collections.addAll(nomes, "Júlio", "Marcelo", "Laura");
        System.out.println(nomes);

        Collections.addAll(idades, 17, 31, 40);
        
        
        for(int maiores : idades){
            if(maiores > 18){
                
                System.out.println(maiores);
                
            }
        }

    }

}
