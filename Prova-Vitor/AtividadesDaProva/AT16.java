

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT16 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        
        System.out.println("Digite o nome de 3 produtos: ");
        
        for (int i = 0; i < 3; i++) {
            nomes.add(tc.nextLine());
        }
        
        
        System.out.println("Digite os preços dos produtos: ");
        
        for (int i = 0; i < 3; i++) {
            precos.add(tc2.nextDouble());
            
            
        }
        
        for (int i = 0; i < 3; i++) {
            if(precos.get(i) < 50){
                System.out.println("Produto "+nomes.get(i)+" está com desconto.");
            }
        }
    }
    
    
    
}
