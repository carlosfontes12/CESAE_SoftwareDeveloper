package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//pedir ao utilizador o tamanho do array
        System.out.print("Introduza o tamanho do array:");
        int X = input.nextInt();

        //declarar array de inteiros
        int[] numeros = new int[X];

//pedir ao utilizador os elementos do array
        for (int i = 0; i < X; i++) {
            System.out.print("Introduza o elemento " + (i + 1) + ":");
            numeros[i] = input.nextInt();
        }
        System.out.println(" ");

        //apresentar os elementos do array
        System.out.println("Os elementos do array são:");
        for (int i = 0; i < X; i++) {
            System.out.println(numeros[i]);
        }
    }
}
