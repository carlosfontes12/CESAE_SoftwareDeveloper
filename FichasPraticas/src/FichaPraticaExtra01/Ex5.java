package FichaPraticaExtra01;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        int numeroAcertar = 31;
        int numero;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número (entre 1 a 100): ");
        numero = input.nextInt();

        if (numero == numeroAcertar) {
            System.out.println("Boa! Ganhaste o jogo!");
        }

        if (numero != numeroAcertar) {
            if (numero < numeroAcertar) {
                System.out.println("Muito baixo.");
            }

            if (numero > numeroAcertar) {
                System.out.println("Muito alto.");
            }

            System.out.print("Introduza outro número: ");
            numero = input.nextInt();

            if (numero == numeroAcertar) {
                System.out.println("Boa! Ganhaste o jogo!");
            }

            if (numero < numeroAcertar) {
                System.out.println("Muito baixo. Ficaste sem tentativas!");
            }

            if (numero > numeroAcertar) {
                System.out.println("Muito alto. Ficaste sem tentativas!");
            }
        }
    }
}
