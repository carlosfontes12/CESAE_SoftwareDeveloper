package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        //ciclo de leitura
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();

            }
        }

        //iniciar as variáveis para o maior e menor elemento da matriz
        int maior = matriz[0][0];
        int menor = matriz[0][0];

// calculo do maior e menor elemento da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }
            }
        }

        int segundoMaior = menor;
        int segundoMenor = maior;

        //calculo do segundo maior e segundo menor elemento da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (matriz[linha][coluna] > segundoMaior && matriz[linha][coluna] < maior) {
                    segundoMaior = matriz[linha][coluna];
                }
                if (matriz[linha][coluna] < segundoMenor && matriz[linha][coluna] > menor) {
                    segundoMenor = matriz[linha][coluna];
                }
            }
        }
        //apresentar os resultados
        System.out.println("Segundo Maior: " + segundoMaior);
        System.out.println("Segundo Menor: " + segundoMenor);

    }
}
