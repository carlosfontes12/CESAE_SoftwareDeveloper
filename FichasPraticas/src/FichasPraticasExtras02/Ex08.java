package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numero2;
        int i, resultado = 1;

        System.out.print("Introduza o primeiro numero: ");
        numero = input.nextInt();

        System.out.print("Introduza o segundo numero: ");
        numero2 = input.nextInt();



        for (i =1 ; i <=numero2 ; i++) {
            resultado = resultado * numero;
            //System.out.println(i);
        }

       System.out.println(resultado);


    }
}
