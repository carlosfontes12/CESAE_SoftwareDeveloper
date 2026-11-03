package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numeroMaior = 0, numeroMenor = 0;

        do {
            System.out.print("Introduza um numero (0 para sair): ");
            numero = input.nextInt();

           
            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }

        } while (numero != 0);

        System.out.println("Maior numero: " + numeroMaior);
        System.out.println("Menor numero: " + numeroMenor);
    }
}
