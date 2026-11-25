package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws FileNotFoundException {
        int total = 0;

        File ficheiro = new File("FicheirosFicha07/exercicio_05_31.txt");
        Scanner sc = new Scanner(ficheiro);


        while (sc.hasNextInt()) {

            int numero = sc.nextInt();

            total += numero;

        }
        System.out.println(total);
        sc.close();
    }
}