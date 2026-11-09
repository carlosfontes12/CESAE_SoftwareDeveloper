package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] numeros = new int[15];

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        System.out.print("Valores pares do array inicial:");
        System.out.println(" ");
        
//valores pares do array inicial    
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores impares do array inicial:");
        //valores impares do array inicial
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

    }
}
