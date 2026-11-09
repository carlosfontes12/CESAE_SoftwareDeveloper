package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][3];
        int[][] matriz2 = new int[4][3];

        //ciclo de leitura
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //ciclo de leitura da matriz2
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz2[linha][coluna] = input.nextInt();
            }
        }

        //ciclo de escrita
        System.out.println(" ");
        System.out.println("Matriz 1:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        //ciclo de escrita da matriz2
        System.out.println(" ");
        System.out.println("Matriz 2:");
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                System.out.print(matriz2[linha][coluna] + " ");
            }
            System.out.println();
        }

        //ciclo de escrita da matriz resultante da soma
        System.out.println(" ");
        System.out.println("Matriz Soma:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print((matriz[linha][coluna] + matriz2[linha][coluna]) + " ");
            }
            System.out.println();
        }

    }
}
