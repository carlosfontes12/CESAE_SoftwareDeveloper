package FichasPraticas05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int i;
        boolean encontrarPar = false;


        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira numeros [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        int par = numeros[0];

        //ciclo de escrita
        for (i = 1; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 && numeros[i] > par) {
                par = numeros[i];
                if (encontrarPar || numeros[i] > par) {
                    encontrarPar = true;
                }

            }

        }

        if (encontrarPar == true) {
            System.out.println("O maior número par é: " + par);
        } else {
            System.out.println("Não tem números pares");
        }


    }
}


