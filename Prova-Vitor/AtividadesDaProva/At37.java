

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At37 {
    public static void main(String[] args) {
        
        int produtos = 0;
        int soma = 0;
        ArrayList<Double> precos = new ArrayList<>();
        
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de produtos: ");
        produtos = tc.nextInt();
        
        System.out.println("Digite o preço dos produtos: ");
        for (int i = 0; i < produtos; i++) {
            precos.add(tc2.nextDouble());
            soma += precos.get(i);
        }
        
        System.out.println("O total é: "+soma);
        
        
    }
    
    
    
}
