package FichasPraticas05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int soma = 0;

        //ciclo de leitura

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //ciclo de escrita


        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
                soma += matriz[linha][coluna];
            }

            System.out.println();
        }

        //apresentação do resultado
        System.out.println("A soma de todos os valores é: " + soma);

    }
}


