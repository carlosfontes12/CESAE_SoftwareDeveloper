package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int contador1, contador2;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        contador1 = numero - 5;
        contador2 = numero + 5;

        while (contador1 <= contador2) {
            System.out.println(contador1);
            contador1 = contador1 + 1;
        }
    }
}
