

package AtividadesDaProva;

/**
 *
 * @author Aluno
 */
public class AT34 {
    public static void main(String[] args) {

        int[][] matriz = { 
            {20, 76, 64,3},
            {25, 17, 43, 8},
            {45, 15, 7, 14},
            {1, 12, 51, 6}
        };
        
        int menor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("Menor elemento: " + menor);
    }
}
