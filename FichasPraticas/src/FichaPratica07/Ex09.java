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
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, ";");

        String[][] matrizMusicas = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];


        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(";");

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


    /**
     * converter uma duração em texto ("6:06") para segundos (366)
     *
     * @param duracao duração no formato minutos:segundos
     * @return duração em segundos
     */
    public static int converterDuracaoParaSegundos(String duracao) {

        String[] partes = duracao.split(":");   // "6:06" -> ["6", "06"]

        int minutos = Integer.parseInt(partes[0]);
        int segundos = Integer.parseInt(partes[1]);

        return minutos * 60 + segundos;
    }


    /**
     * pesquisar a música com maior duração
     *
     * @param matriz
     */
    public static void pesquisarMusicaMaiorDuracao(String[][] matriz) {

        // Começamos por assumir que a primeira música é a maior
        int linhaMaior = 0;
        int maiorDuracao = converterDuracaoParaSegundos(matriz[0][3]);

        for (int linha = 1; linha < matriz.length; linha++) {

            int duracaoAtual = converterDuracaoParaSegundos(matriz[linha][3]);

            if (duracaoAtual > maiorDuracao) {
                maiorDuracao = duracaoAtual;
                linhaMaior = linha;
            }
        }

        System.out.println(formatarMusica(matriz, linhaMaior));
    }


    /**
     * pesquisar músicas com duração acima de um valor
     *
     * @param matriz
     * @param duracaoMinima duração no formato minutos:segundos (ex: 5:00)
     */
    public static void pesquisarMusicasDuracaoSuperior(String[][] matriz, String duracaoMinima) {

        int segundosMinimos = converterDuracaoParaSegundos(duracaoMinima);

        System.out.println("Músicas com mais de " + duracaoMinima);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (converterDuracaoParaSegundos(matriz[linha][3]) > segundosMinimos) {
                System.out.println(formatarMusica(matriz, linha));
            }
        }
    }


    /**
     * juntar os dados de uma música num só texto
     *
     * @param matriz
     * @param linha linha da música na matriz
     * @return texto no formato "Artista | Música | Duração"
     */
    public static String formatarMusica(String[][] matriz, int linha) {
        return matriz[linha][1] + " | " + matriz[linha][0] + " | " + matriz[linha][3];
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
                    pesquisarMusicaMaiorDuracao(matrizMusicas);
                    break;

                case 4: // Músicas com duração superior
                    System.out.println("\n-+-+-+-+- MÚSICAS COM DURAÇÃO SUPERIOR A -+-+-+-+-");
                    System.out.print("Duração mínima (minutos:segundos, ex: 5:00): ");
                    String duracaoMinima = input.next();
                    pesquisarMusicasDuracaoSuperior(matrizMusicas, duracaoMinima);
                    break;

                case 5: // Número de músicas
                    System.out.println("\n-+-+-+-+- NÚMERO DE MÚSICAS -+-+-+-+-");
                    System.out.println(matrizMusicas.length + " músicas");
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