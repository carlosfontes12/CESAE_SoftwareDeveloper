package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int numero, digito = 0;
        int numeroRevertido = 0;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        while (numero != 0) {
            digito = numero % 10;
            numeroRevertido = numeroRevertido * 10 + digito;
            numero /= 10;
        }


        System.out.println("Numero revertido: " + numeroRevertido);
    }
}

