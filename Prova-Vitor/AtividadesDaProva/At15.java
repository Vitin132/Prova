

package AtividadesDaProva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Aluno
 */
public class At15 {
     public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        String[] palavras = new String[5];
        
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite a "+(i+1)+" palavra:");
            palavras[i] = tc.nextLine();
            
            
            
        } 
        
        
        
        
        Set<String> conjunto = new HashSet<>();
        for(String contem : palavras){
            if(contem.contains("E") || contem.contains("e")){
            conjunto.add(contem);
            }
        }
        System.out.println("Array de palavras: "+Arrays.toString(palavras));
        System.out.println("Palavras que possuem a letra E:"+conjunto);
        
        
        
        
    }
}
