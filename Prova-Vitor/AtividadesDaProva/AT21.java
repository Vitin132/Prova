package AtividadesDaProva;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Aluno
 */
public class AT21 {

    public static void main(String[] args) {

        Random rd = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(numeros));

        for (int mult : numeros) {

            if (mult % 4 == 0) {
                System.out.println(mult);
            }

        }

    }

}
