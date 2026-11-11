package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex16 {

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
//apresentaçao dos resultados
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
