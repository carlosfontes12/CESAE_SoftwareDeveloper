package FichasPraticas05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int[][] matriz = new int[3][3];


        //ciclo de leitura

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        //iniciar as variaveis
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        System.out.println();
        System.out.println();

        //ciclo para imprimir maior e menor
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                // comparar maior e menor
                if (maior < matriz[linha][coluna]) {
                    maior = matriz[linha][coluna];
                }
                if (menor > matriz[linha][coluna]) {
                    menor = matriz[linha][coluna];
                }
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // apresentação resultados
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);


    }
}