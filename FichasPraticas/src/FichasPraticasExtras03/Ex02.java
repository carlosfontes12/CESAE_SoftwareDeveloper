package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int[] numeros = new int[10];

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }
        //ciclo de escrita
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
