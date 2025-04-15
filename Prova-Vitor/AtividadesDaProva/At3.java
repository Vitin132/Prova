package AtividadesDaProva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At3 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        Produtos(tc, tc2);

    }

    public static void Produtos(Scanner tc, Scanner tc2) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        System.out.println("Digite o nome de 5 produtos: ");
        for (int i = 0; i < 5; i++) {
            nomes.add(tc.nextLine());
        }
        //System.out.println(nomes);

        System.out.println("Digite os respectivos preços: ");
        for (int i = 0; i < 5; i++) {
            precos.add(tc2.nextDouble());
        }
        //System.out.println(precos);

        for (int i = 0; i < 5; i++) {
            if (precos.get(i) > 100) {
                System.out.println(nomes.get(i) + " tem o valor de " + precos.get(i));
            }
        }

    }

}
