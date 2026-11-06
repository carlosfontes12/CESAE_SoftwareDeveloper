package FichasPraticas05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];


        //ciclo de leitura

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um numero ao vetor 1[" + i + "]: ");
            vetor1[i] = input.nextInt();
        }

        System.out.println();

        for (int j = 0; j < vetor2.length; j++) {
            System.out.print("Insira um numero ao vetor 2[" + j + "]: ");
            vetor2[j] = input.nextInt();
        }
        //ciclo para montar a matriz
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            matriz[coluna][0] = vetor1[coluna];
            matriz[coluna][1] = vetor2[coluna];

        }
        System.out.println();

        //ciclo de escrita
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");

            }

            System.out.println();
        }


    }
}
