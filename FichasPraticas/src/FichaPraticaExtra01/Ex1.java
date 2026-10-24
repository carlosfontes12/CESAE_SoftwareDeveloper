package FichaPraticaExtra01;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Introduza a sua idade: ");
        idade = input.nextInt();

        if (idade < 18) {
            System.out.println("É menor de idade.");
        } else {
            System.out.println("É maior de idade.");
        }

    }
}
