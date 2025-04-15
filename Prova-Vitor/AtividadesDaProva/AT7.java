

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT7 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Random rd = new Random();
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = rd.nextInt(100);
        }
        
        ArrayList<Integer> impares = new ArrayList<>();
        
        for(int imp : numeros){
            if(imp % 2 != 0){
                impares.add(imp);
            }
        }
        System.out.println("Numeros ímpares: "+impares);
        System.out.println("Números ímpares em reverso: "+impares.reversed());
        
    }
    
    
    
}
