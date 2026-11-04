package FichasPraticas05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int i;


        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array: ");
            numeros[i] = input.nextInt();
        }

        //ciclo de escrita

        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }



    }
}
