package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex08 {

    /**
     * Verifica se o caractere fornecido é uma vogal.
     *
     * @param caractere O caractere a ser verificado.
     * @return true se o caractere for uma vogal, false caso contrário.
     */
    public static boolean vogal(String caractere) {
        if (caractere.equals("A") || caractere.equals("E") || caractere.equals("I") || caractere.equals("O") || caractere.equals("U")
                || caractere.equals("a") || caractere.equals("e") || caractere.equals("i") || caractere.equals("o") || caractere.equals("u")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza um caractere: ");
        String caractere = input.next();
        if (vogal(caractere)) {
            System.out.println("é uma vogal.");
        } else {
            System.out.println("não é uma vogal.");
        }
    }
}
