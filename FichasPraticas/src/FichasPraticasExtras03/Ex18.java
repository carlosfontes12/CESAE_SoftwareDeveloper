package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //pedir ao utilizador as dimensões da matriz
        System.out.print("Insira o número de linhas: ");
        int x = input.nextInt();
        System.out.print("Insira o número de colunas: ");
        int y = input.nextInt();

        int[][] matriz = new int[x][y];

        //ciclo de leitura
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        //ciclo de escrita da matriz original
        System.out.println("Matriz original:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        // matriz 2
        int[][] matriz2 = new int[y][x];

//trocar linhas por colunas (transpor a matriz)
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz2[coluna][linha] = matriz[linha][coluna];
            }
        }

        System.out.println("Matriz transposta:");
        //apresentar matriz transposta
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                System.out.print(matriz2[linha][coluna] + " ");
            }
            System.out.println();
        }

    }
}
