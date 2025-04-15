

package AtividadesDaProva;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class At12 {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        int[] numeros = {1,4,5,7,9,3};
        
        double media = calcularMedia(numeros);
        
        
        System.out.println("Media das notas é: "+media);
        
        double maior = 5;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>maior){
                System.out.println("O número "+numeros[i]+" é maior que a média.");
                
            }
        }
        
    }

    public static double calcularMedia(int[] numeros) {
                
        double soma = 0;
        for(double num : numeros){
            if(num > 5){
            soma+=num;
            }
        }return soma/2;
        
       
        
    }
    
    
    
}
