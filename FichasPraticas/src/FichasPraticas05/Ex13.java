package FichasPraticas05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;

        //ciclo de leitura

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        System.out.println();

        //ciclo de escrita
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();


        }
        System.out.println();


        //somatorio da diagonal
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (linha == coluna) {
                    soma += matriz[linha][coluna];
                }
            }
            System.out.println();


        }
        System.out.println();


        //apresentar resultado
        System.out.println("A soma na diagonal é: " + soma);
    }
}