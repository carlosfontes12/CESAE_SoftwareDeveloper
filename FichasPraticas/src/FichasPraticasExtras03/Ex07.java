package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//pedir ao utilizador o tamanho do array
        System.out.print("Introduza o tamanho do array:");
        int x = input.nextInt();

        //declarar array de inteiros
        int[] numeros = new int[x];

        //pedir ao utilizador os elementos do array
        for (int i = 0; i < x; i++) {
            System.out.print("Introduza o elemento " + (i + 1) + ":");
            numeros[i] = input.nextInt();
        }

        //pedir ao utilizador o valor a remover
        System.out.print("Qual o valor a remover?");
        int valor = input.nextInt();

        //remover o valor do array
        for (int i = 0; i < x; i++) {
            //verificar se o elemento atual é igual ao valor a remover
            if (numeros[i] == valor) {
                //deslocar os elementos seguintes uma posição para a esquerda
                for (int j = i; j < x - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }

                x--;
                i--;
            }
        }
        //apresentar o array após a remoção do valor
        System.out.println("Array após remover o valor " + valor + ":");
        for (int i = 0; i < x; i++) {
            System.out.println(numeros[i]);
        }
    }
}
