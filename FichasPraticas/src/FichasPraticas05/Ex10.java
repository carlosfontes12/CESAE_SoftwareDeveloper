package FichasPraticas05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numero, posicoes = 0;

        //ciclo de leitura

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }
        // pedir numero ao user
        System.out.println("Insira num numero para pesquisar: ");
        numero = input.nextInt();

        //ciclo de escrita
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {


                //comparar numero na matriz e contar
                if (numero == matriz[linha][coluna]) {
                    posicoes++;
                }
            }
        }


        // resultado
        System.out.println("Há " + posicoes + " na matriz com o numero " + numero);


    }
}

