package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {

        double valorTotal = 0;

        //ler o ficheiro
        File ficheiro = new File("FicheirosFicha07/exercicio_08.csv");
        Scanner sc = new Scanner(ficheiro);

        //salta o cabeçalho
        sc.nextLine();


        // percorre o ficheiro e faz o somatorio do total
        while (sc.hasNextLine()) {

            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");
            valorTotal += Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);

        }

        // Apresentação de resultados
        System.out.println("Total: " + valorTotal);

    }
}
