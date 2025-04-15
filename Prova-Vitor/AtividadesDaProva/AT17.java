

package AtividadesDaProva;

/**
 *
 * @author Aluno
 */
public class AT17 {

     public static void main(String[] args) {
        int[][] matriz = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int somaSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            
            somaSecundaria += matriz[i][2 - i];
        }
        
        System.out.println("Soma da diagonal secundária: "+ somaSecundaria);
    }
    
    
}
