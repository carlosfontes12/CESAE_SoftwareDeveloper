package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 1, soma = 0, i;
        int partirNumeros = 10;
        int digito;

        System.out.print("Introduza um numero inteiro: ");
        numero = input.nextInt();


        for (i = numero; i > 0; i /= 10) {


            digito = numero % partirNumeros;
            soma = soma + digito / (partirNumeros / 10);
            partirNumeros *= 10;



           /* System.out.println("Digito: " + digito);
            System.out.println("Partir numeros: " + partirNumeros);
            System.out.println("numero: " + numero);
            System.out.println("Soma: " + soma);*/


        }
        System.out.println("Soma: " + soma);


    }
}
