package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex11 {

    /**
     * Inicializa uma matriz 3x3 com espaços em branco.
     *
     * @return matriz 3x3 inicializada com espaços em branco.
     */
    public static String[][] inicializarMatriz() {

        String[][] matriz = new String[3][3];
        System.out.println("-+-+-+-+-Jogo do Galo -+-+-+-+-");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = " ";
            }
        }
        return matriz;
    }

    /**
     * Imprime a matriz do jogo do galo no ecrã.
     *
     * @param matriz matriz do jogo do galo a ser impressa no ecrã.
     */
    public static void imprimirMatriz(String[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (coluna == 0) {
                    System.out.print("| ");
                }
                System.out.print(matriz[linha][coluna] + " | ");
            }
            System.out.println("\n_____________");
        }
    }

    /**
     * Lê a jogada do jogador 1 (linha e coluna) e retorna um array com a linha,
     * coluna e identificador do jogador.
     *
     * @return array com a linha, coluna e identificador do jogador 1.
     */
    public static int[] lerJogadaJogador1() {
        Scanner input = new Scanner(System.in);
        int[] jogadaJogador1 = new int[3];

        do {
            System.out.print("Jogador 1 (X), introduza a linha (0-2): ");
            jogadaJogador1[0] = input.nextInt();
            System.out.print("Jogador 1 (X), introduza a coluna (0-2): ");
            jogadaJogador1[1] = input.nextInt();
            if (jogadaJogador1[0] < 0 || jogadaJogador1[0] > 2 || jogadaJogador1[1] < 0 || jogadaJogador1[1] > 2) {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        } while (jogadaJogador1[0] < 0 || jogadaJogador1[0] > 2 || jogadaJogador1[1] < 0 || jogadaJogador1[1] > 2);
        jogadaJogador1[2] = 1; // Representa o jogador 1 com o valor 1
        return jogadaJogador1;
    }

    /**
     * Lê a jogada do jogador 2 (linha e coluna) e retorna um array com a linha,
     * coluna e identificador do jogador.
     *
     * @return array com a linha, coluna e identificador do jogador 2.
     */
    public static int[] lerJogadaJogador2() {

        Scanner input = new Scanner(System.in);
        int[] jogadaJogador2 = new int[3];

        do {
            System.out.print("Jogador 2 (O), introduza a linha (0-2): ");
            jogadaJogador2[0] = input.nextInt();
            System.out.print("Jogador 2 (O), introduza a coluna (0-2): ");
            jogadaJogador2[1] = input.nextInt();
            if (jogadaJogador2[0] < 0 || jogadaJogador2[0] > 2 || jogadaJogador2[1] < 0 || jogadaJogador2[1] > 2) {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        } while (jogadaJogador2[0] < 0 || jogadaJogador2[0] > 2 || jogadaJogador2[1] < 0 || jogadaJogador2[1] > 2);
        jogadaJogador2[2] = 2; // Representa o jogador 2 com o valor 2
        return jogadaJogador2;
    }

    /**
     * Escreve a jogada do jogador 1 (X) na matriz, se a posição estiver vazia.
     *
     * @param matriz tabuleiro do jogo do galo.
     * @param jogadaJogador1 array com a linha [0] e a coluna [1] escolhidas.
     * @return true se a jogada foi escrita, false se a posição já estava
     * ocupada.
     */
    public static boolean escreverJogadaJogador1(String[][] matriz, int[] jogadaJogador1) {
        int linha = jogadaJogador1[0];
        int coluna = jogadaJogador1[1];

        if (matriz[linha][coluna].equals(" ")) {
            matriz[linha][coluna] = "X";
            return true;
        }

        System.out.println("Posição ocupada. Tente novamente.");
        return false;
    }

    /**
     * Escreve a jogada do jogador 2 (O) na matriz, se a posição estiver vazia.
     *
     * @param matriz tabuleiro do jogo do galo.
     * @param jogadaJogador2 array com a linha [0] e a coluna [1] escolhidas.
     * @return true se a jogada foi escrita, false se a posição já estava
     * ocupada.
     */
    public static boolean escreverJogadaJogador2(String[][] matriz, int[] jogadaJogador2) {
        int linha = jogadaJogador2[0];
        int coluna = jogadaJogador2[1];

        if (matriz[linha][coluna].equals(" ")) {
            matriz[linha][coluna] = "O";
            return true;
        }

        System.out.println("Posição ocupada. Tente novamente.");
        return false;
    }

    /**
     * Verifica se o jogador especificado venceu o jogo.
     *
     * @param matriz tabuleiro do jogo do galo.
     * @param jogador número do jogador (1 ou 2).
     * @return true se o jogador venceu, false caso contrário.
     */
    public static boolean verificarVitoria(String[][] matriz, int jogador) {
        String simbolo;

        if (jogador == 1) {
            simbolo = "X";
        } else {
            simbolo = "O";
        }

        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((matriz[i][0].equals(simbolo) && matriz[i][1].equals(simbolo) && matriz[i][2].equals(simbolo))
                    || (matriz[0][i].equals(simbolo) && matriz[1][i].equals(simbolo) && matriz[2][i].equals(simbolo))) {
                return true;
            }
        }

        // Verificar diagonais
        if ((matriz[0][0].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][2].equals(simbolo))
                || (matriz[0][2].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][0].equals(simbolo))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        String[][] matriz = inicializarMatriz();

        imprimirMatriz(matriz);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                int[] jogadaJogador1 = lerJogadaJogador1();
                while (!escreverJogadaJogador1(matriz, jogadaJogador1)) {
                    jogadaJogador1 = lerJogadaJogador1();
                }
            } else {
                int[] jogadaJogador2 = lerJogadaJogador2();
                while (!escreverJogadaJogador2(matriz, jogadaJogador2)) {
                    jogadaJogador2 = lerJogadaJogador2();
                }
            }
            imprimirMatriz(matriz);
            if (verificarVitoria(matriz, (i % 2) + 1)) {
                System.out.println("Jogador " + ((i % 2) + 1) + " venceu!");
                break;

            }
        }
        if (!verificarVitoria(matriz, 1) && !verificarVitoria(matriz, 2)) {
            System.out.println("Empate!");
        }
    }

}
