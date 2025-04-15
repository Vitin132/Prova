

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT5 {
   public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Integer> idadesFiltradas = new ArrayList<>();
        
        System.out.println("Digite a idade de 5 pessoas:");
        
        
        for (int i = 0; i < 5; i++) {
            idades.add(tc.nextInt());
        }
        for(int entre : idades){
            
            if(entre > 18 && entre < 30){
                idadesFiltradas.add(entre);
            }
            
        }
        System.out.println("Quantidade de pessoas entre 18 e 30: \n"+idadesFiltradas.size());
        
        
        
        
    }
       
}
