package FichasPraticas05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numeros = new double[10];
        int i;
        double media = 0, soma = 0;

        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira numeros [" + i + "]: ");
            numeros[i] = input.nextDouble();

        }
        for (i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.println("A média é: " + media);

    }
}
