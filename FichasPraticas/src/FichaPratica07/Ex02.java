package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.BibliotecadeFicheiros.*;

public class Ex02 {

    public static void main(String[] args) throws FileNotFoundException {

        String FileContent = "Olá";
        File ficheiro = new File("FicheirosFicha07/exercicio_02.txt");
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.println(FileContent);
        printWriter.println("Criar ficheiro e escrever algo");
        printWriter.close();

        imprimirFicheiro("FicheirosFicha07/exercicio_02.txt");
        System.out.println();
    }
}