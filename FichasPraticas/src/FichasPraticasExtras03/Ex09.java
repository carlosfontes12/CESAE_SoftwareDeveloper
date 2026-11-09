package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] numeros = new int[10];

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();

        }
        //apresentar o array
        System.out.println("Array inserido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //ordem crescente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        //apresentar o array em ordem crescente
        System.out.println("Array em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
