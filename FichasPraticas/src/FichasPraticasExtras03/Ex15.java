package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        double media = 0;

        //ciclo de leitura
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print("Insira numeros [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }

        }

        //ciclo  de calculo da média
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                media += matriz[linha][coluna];
            }
            System.out.println();
        }

        //apresentaçao da media
        media /= (matriz[0].length * matriz.length);
        System.out.println("Média: " + media);
    }

}
