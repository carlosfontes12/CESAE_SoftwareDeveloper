package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        //ler o ficheiro
        File ficheiroAtual = new File("FicheirosFicha07/exercicio_03.txt");
        Scanner sc = new Scanner(ficheiroAtual);

        //escrever o ficheiro
        File ficheiroCopiado = new File("FicheirosFicha07/exercicio_03_copia.txt");
        PrintWriter pw = new PrintWriter(ficheiroCopiado);

        //ciclo para ler as linhas do ficheiro
        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            pw.println(linha);
        }

        // fechar o pw e o sc
        pw.close();
        sc.close();
    }
}