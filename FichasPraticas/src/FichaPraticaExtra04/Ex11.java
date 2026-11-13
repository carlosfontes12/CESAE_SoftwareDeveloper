package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        String[][] matriz = new String[3][3];


        //ciclo para inicializar a matriz com ' ' (livre)
        System.out.println("-+-+-+-+-Jogo do Galo -+-+-+-+-");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = " ";
            }
        }

        //ler matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (coluna == 0) {
                    System.out.print("| ");
                }
                System.out.print(matriz[linha][coluna] + " | ");
            }
            System.out.println("\n_____________");
        }

        // ler jogadas dos utilizador 1
        System.out.println("Escolha uma posiçao da matriz: ");


    }
}


//atualizar user 1


// ver se as jogadas estao disponivel na matriz (ver se esta entre 0 e 2 && que nao esteja ocupada)


//ver se a jogada  é valida


//colocar a jogada no espaço livre


//colocar as opçoes de vitoria


//caso empate, voltar a repetir


//anunciar resultados

//ler jogadas user 2

//update user 2

            }
                    }