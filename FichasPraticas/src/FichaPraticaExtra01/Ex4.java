package FichaPraticaExtra01;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Introduza uma letra: ");
        letra = input.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.print("A letra é uma vogal.");
        } else {
            System.out.print("A letra é uma consoante.");
        }
    }

}
