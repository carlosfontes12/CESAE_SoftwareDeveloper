package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int[] numeros = new int[14];

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        //ciclo de escrita
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
