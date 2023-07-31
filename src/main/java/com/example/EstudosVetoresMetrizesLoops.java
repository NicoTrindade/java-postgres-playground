package com.example;

import java.util.Arrays;

public class EstudosVetoresMetrizesLoops {
    public static void main(String[] args) {

        int vetor1[] = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = 100 * (i+1);
        }

        System.out.println("Valores do vetor: " + Arrays.toString(vetor1));

        double matriz1[][] = new double[3][4];

/*         System.out.println("");
        System.out.println("Tamanho matriz: " + matriz1.length);
        System.out.println("Quantidade de colunas: " + matriz1[0].length);
        System.out.println("");
 */
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (i * matriz1[i].length + (j+1)) * 10;                
            }
        }

        for(int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.printf("%5.1f ",matriz1[i][j]);
            }
            System.out.println("");
        }


 




        
    }
    
}
