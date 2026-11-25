package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {


    /**
     * Função que imprime um ficheiro na consola
     *
     * @param caminho Caminho para o ficheiro a ser impresso (com extensão: .txt, .csv, etc)
     * @throws FileNotFoundException O ficheiro não existe
     */
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    /**
     * Função que escreve, num ficheiro, algum conteúdo
     *
     * @param caminho  Caminho para o ficheiro a ser escrito
     * @param conteudo Conteúdo que queremos escrever
     * @throws FileNotFoundException Se o ficheiro existir apaga e escreve de novo | Se o ficheiro não existir, cria um novo
     */
    public static void escreverFicheiro(String caminho, String conteudo) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        PrintWriter pw = new PrintWriter(ficheiro);

        pw.println(conteudo);

        pw.close();
    }

    /**
     * Função que copia o conteúdo de um ficheiro para outro ficheiro
     *
     * @param caminhoOriginal Caminho do ficheiro original (que contém a informação)
     * @param caminhoCopia    Caminho do ficheiro cópia (onde queremos colocar a informação)
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void copiarFicheiro(String caminhoOriginal, String caminhoCopia) throws FileNotFoundException {

        File ficheiroOriginal = new File(caminhoOriginal);
        Scanner sc = new Scanner(ficheiroOriginal);

        File ficheiroCopia = new File(caminhoCopia);
        PrintWriter pw = new PrintWriter(ficheiroCopia);

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            pw.println(linhaAtual);
        }

        pw.close();

    }


    public static int somarNumerosFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int total = 0;

        while (sc.hasNextInt()){
            int numeroAtual = sc.nextInt();
            total+=numeroAtual;
        }

        return total;

    }
}
