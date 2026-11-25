package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex07 {

    public static void main(String[] args) throws FileNotFoundException {

        int contadorLinhas = 0;
        int contadorPalavras = 0;

        //ler o ficheiro
        File ficheiro = new File("FicheirosFicha07/exercicio_07.txt");
        Scanner sc = new Scanner(ficheiro);


        //contar numero de linhas
        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            contadorLinhas++;
        }

        // novo scanner de leitura para usar no segundo while
        Scanner sc2 = new Scanner(ficheiro);

        //contar numero de palavras
        while (sc2.hasNext()) {
            sc2.next();
            contadorPalavras++;
        }
        // apresentação dos resultados
        System.out.println("Número de linhas:" + contadorLinhas);
        System.out.println("Numero de palavras:" + contadorPalavras);
        sc2.close();
        sc.close();
    }


}

