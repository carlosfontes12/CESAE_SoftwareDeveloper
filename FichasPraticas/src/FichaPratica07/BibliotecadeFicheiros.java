package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** biblioteca para imprimir ficheiros

 *
 */

public class BibliotecadeFicheiros {

    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

}
