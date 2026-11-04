package FichasPraticas05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int[] numeros = new int[10];
        int i;

        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira numeros: ");
            numeros[i] = input.nextInt();
        }

        // iniciar a variavel maior com um valor do array (numeros[0]

        int menor = numeros[0];

        //ciclo de escrita

        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }


        }
        System.out.println(menor);
}
}