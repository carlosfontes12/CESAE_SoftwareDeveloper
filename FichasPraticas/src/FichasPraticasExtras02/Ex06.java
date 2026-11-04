package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numeroMaior, numeroMenor;

        System.out.print("Introduza um numero (0 para sair): ");
        numero = input.nextInt();

        numeroMaior = numero;
        numeroMenor = numero;


        while (numero != 0) {
            System.out.print("Introduza um numero (0 para sair): ");
            numero = input.nextInt();


            if (numero > numeroMaior && numero !=0) {
                numeroMaior = numero;
            }
            if (numero < numeroMenor && numero !=0) {
                numeroMenor = numero;
            }

        }

        System.out.println("Maior numero: " + numeroMaior);
        System.out.println("Menor numero: " + numeroMenor);
    }
}
