package FichaPratica03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroInicial, numeroFinal;
        int contador = 0;

        System.out.print("Introduza o número inicial: ");
        numeroInicial = input.nextInt();

        System.out.print("Introduza o número final: ");
        numeroFinal = input.nextInt();

        contador = numeroInicial;

        while (contador >= numeroInicial && contador <= numeroFinal) {
            System.out.println(contador);
            contador = contador + 1;
        }

    }
}
