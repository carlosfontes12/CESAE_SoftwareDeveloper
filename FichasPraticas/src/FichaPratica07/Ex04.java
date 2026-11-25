package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex04 {

    public static void main(String[] args) throws FileNotFoundException {
        File ficheiro = new File("FicheirosFicha07/exercicio_04.csv");
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            System.out.println(linha);
        }

        sc.close();
    }
}
