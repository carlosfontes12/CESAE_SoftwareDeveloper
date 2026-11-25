package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) throws FileNotFoundException {

        int idadeMaisAlta = 0;
        String nomeMaisVelho = "";

        File ficheiro = new File("FicheirosFicha07/exercicio_06.txt");
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {

            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            if (Integer.parseInt(linhaSeparada[1]) > idadeMaisAlta) {
                idadeMaisAlta = Integer.parseInt(linhaSeparada[1]);
                nomeMaisVelho = linhaSeparada[0];
            }
        }
        System.out.println(nomeMaisVelho + " com " + idadeMaisAlta + " anos!");

    }
}
