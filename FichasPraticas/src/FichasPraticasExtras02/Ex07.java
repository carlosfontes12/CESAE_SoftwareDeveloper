package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numeroMaior, numeroMenor;
        int contadorPositivo=1, contadorNegativo=0;

        System.out.print("Introduza um numero (0 para sair): ");
        numero = input.nextInt();

        numeroMaior = numero;
        numeroMenor = numero;


        while (numero != 0) {
            System.out.print("Introduza um numero (0 para sair): ");
            numero = input.nextInt();


            if (numero > numeroMaior && numero !=0) {
                contadorPositivo++;
            }
            if (numero < numeroMenor && numero !=0) {
                contadorNegativo++;
            }

        }

        System.out.println("Foram introduzidos: " + contadorPositivo + " numeros positivos");
        System.out.println("Foram introduzidos: " + contadorNegativo + " numeros negativos");
    }
}