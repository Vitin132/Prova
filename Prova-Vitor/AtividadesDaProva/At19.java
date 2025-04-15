package AtividadesDaProva;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At19 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = tc.nextLine();

        String[] palavras = frase.split("\\s+");

        System.out.println("Número de palavras: " + palavras.length);

    }

}
