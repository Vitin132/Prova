

package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT31 {
    public static void main(String[] args) {
        
        ArrayList<String> filmes = new ArrayList<>();
        ArrayList<Integer> ano = new ArrayList<>();
        
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        
        Filme(tc, tc2);
        
        
        
    }

    public static void Filme(Scanner tc, Scanner tc2) {
        ArrayList<String> filmes = new ArrayList<>();
        ArrayList<Integer> ano = new ArrayList<>();
        
        System.out.println("Digite o nome de 5 filmes: ");
        
        for (int i = 0; i < 5; i++) {
            filmes.add(tc.nextLine());
        }
        
        System.out.println("Digite as respectivas datas de lançamento dos filmes:");
        
        
        for (int i = 0; i < 5; i++) {
            ano.add(tc2.nextInt());
        }
        
        for (int i = 0; i <5; i++) {
            if(ano.get(i) > 2010){
                System.out.println("O "+filmes.get(i)+" foi lançado em "+ano.get(i));
            }
        }
        
    }
}
