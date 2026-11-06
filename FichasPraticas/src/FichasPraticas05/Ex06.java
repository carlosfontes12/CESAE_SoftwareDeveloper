package FichasPraticas05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int i, anterior = 0;
        boolean crescente = true;

        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira numeros [" + i + "]: ");
            numeros[i] = input.nextInt();


            // flag para ver quando o vetor deixa de ser crescente
            if (numeros[i] < anterior) {
                crescente = false;
            }

            anterior = numeros[i];
        }

        // ver se é crescente e escrever
        if (crescente == true) {
            System.out.println("Crescente.");
        } else {
            System.out.println("Não crescente.");
        }
    }
}
