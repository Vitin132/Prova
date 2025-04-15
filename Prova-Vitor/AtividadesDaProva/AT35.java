package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT35 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite nomes de pessoas:");
        System.out.println("Digite 'fim' para parar:");

        while (!tc.nextLine().equalsIgnoreCase("fim")) {

            nomes.add(tc.nextLine());

        }

        System.out.println("Lista de nomes \n" + nomes);

    }
}
