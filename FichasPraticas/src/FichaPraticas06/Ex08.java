package FichaPraticas06;

import java.util.Scanner;

public class Ex08 {

    static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {

        int[][] matriz3 = new int[matriz1.length][matriz1[0].length];

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        return matriz3;
    }

    static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {

        int soma = 0, soma2 = 0;
        int soma3 = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(matriz1[linha][coluna] + " ");
                soma += matriz1[linha][coluna];
            }

            System.out.println();
        }

        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                System.out.print(matriz2[linha][coluna] + " ");
                soma2 += matriz2[linha][coluna];
            }

            System.out.println();
        }
        soma3 = soma + soma2;
        return soma3;

    }

    static int[][] pedirMatriz() {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }

            System.out.println();
        }
        return matriz;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;


        System.out.print("Introduza a primeira matriz: ");
        matriz1 = pedirMatriz();

        System.out.print("Introduza a segunda matriz: ");
        matriz2 = pedirMatriz();


        int[][] resultado = somarMatrizes(matriz1, matriz2);
        somatorio = somatorioMatrizes(matriz1, matriz2);


        System.out.println(somatorio);
        System.out.println(resultado);
    }
}
