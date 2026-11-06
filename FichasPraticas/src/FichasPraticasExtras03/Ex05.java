package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] numeros = new int[12];
        boolean existeNoArray = true;

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }


        //procurar numero e apresentar resultados
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numeros[i - 1]) {
                existeNoArray = true;
                System.out.println(numeros[i]);


            }

        }

        if (existeNoArray == false) {
            System.out.println(" Não está no array");
        }


    }
}
