package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.contarLinhasFicheiro;

public class Ex09 {

    /**
     * função para contar colunas do ficheiro
     *
     * @param caminho
     * @param separador
     * @return tamanho da coluna
     * @throws FileNotFoundException qnd nao encontra
     */
    public static int contarColunasFicheiro(String caminho, String separador) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String cabecalho = sc.nextLine();
        String[] cabecalhoSeparado = cabecalho.split(separador);

        return cabecalhoSeparado.length;
    }

    /**
     * funçao para ler ficheiro de matriz
     *
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */

    public static String[][] lerFicheiroParaMatriz(String caminho) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarLinhasFicheiro(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, ",");

        String[][] matrizMusicas = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];


        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizMusicas[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matrizMusicas;
    }


    /**
     * imprimir matriz
     *
     * @param matriz
     */
    public static void imprimirMatriz(String[][] matriz) {

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t | ");
            }
            System.out.println();
        }
    }


    /**
     * pesquisar musicas por genero
     *
     * @param matriz
     * @param genero
     */
    public static void pesquisarMusicasGenero(String[][] matriz, String genero) {

        System.out.println("Músicas de " + genero);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][2].equals(genero)) {
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }
        }
    }


    /**
     * pesquisar musicas por artista
     *
     * @param matriz
     * @param artista
     */
    public static void pesquisarMusicasArtista(String[][] matriz, String artista) {

        System.out.println("Músicas de " + artista);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][1].equals(artista)) {
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }
        }
    }


    public static int musicaMaiorDuracao(String[][] matriz, int duracao) {

        int maior = matriz[0][3];

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][3] > maior) {
                maior = matriz[linha][3];
            }
            System.out.println(matriz[linha][1] + " | " + matriz[linha][3]);
        }
    }


    /**
     * menu
     *
     * @param matrizMusicas
     */
    public static void menu(String[][] matrizMusicas) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n-+-+-+-+-+-+-+-+- PROGRAMA DE ANÁLISE DE PLAYLIST -+-+-+-+-+-+-+-+-\n");
            System.out.println("1. Pesquisa por Género");
            System.out.println("2. Pesquisa por Artista");
            System.out.println("3. Música mais longa");
            System.out.println("4. Músicas com duração superior");
            System.out.println("5. Número de músicas");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÉNERO -+-+-+-+-");
                    System.out.print("Género a pesquisar (ex: Rock, Pop, Folk): ");
                    input.nextLine(); // Limpar o buffer
                    String generoPesquisar = input.nextLine();

                    pesquisarMusicasGenero(matrizMusicas, generoPesquisar);
                    break;

                case 2: // Pesquisa por Artista
                    System.out.println("\n-+-+-+-+- PESQUISA POR ARTISTA -+-+-+-+-");
                    System.out.print("Artista:");
                    input.nextLine(); // Limpar o buffer
                    String artistaPesquisar = input.nextLine();
                    pesquisarMusicasArtista(matrizMusicas, artistaPesquisar);
                    break;

                case 3: // Música mais longa
                    System.out.println("\n-+-+-+-+- MÚSICA MAIS LONGA -+-+-+-+-");
                    break;

                case 4: // Músicas com duração superior
                    System.out.println("\n-+-+-+-+- MÚSICAS COM DURAÇÃO SUPERIOR A -+-+-+-+-");
                    break;

                case 5: // Número de músicas
                    System.out.println("\n-+-+-+-+- NÚMERO DE MÚSICAS -+-+-+-+-");
                    System.out.println(matrizMusicas.length);
                    break;

                case 0:
                    System.out.println("\n-+-+-+-+- A SAIR -+-+-+-+-");
                    break;

                default:
                    System.out.println("\nOpção Inválida: " + opcao);
                    break;

            }

        } while (opcao != 0);

    }


    public static void main(String[] args) throws FileNotFoundException {
        String[][] matrizMusicas = lerFicheiroParaMatriz("FicheirosFicha07/exercicio_09.csv");
        menu(matrizMusicas);


    }
}