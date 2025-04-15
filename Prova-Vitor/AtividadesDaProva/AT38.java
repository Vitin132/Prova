

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT38 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosFiltrados = new ArrayList<>();
        
        System.out.println("Digite 10 números:");
        
        
        for (int i = 0; i < 10; i++) {
            numeros.add(tc.nextInt());
        }
        for(int entre : numeros){
            
            if(entre > 20 && entre < 70){
                numerosFiltrados.add(entre);
            }
            
        }
        System.out.println("Quantidade de números entre 20 e 70: \n"+numerosFiltrados.size());
        
        
        
        
    }
}
