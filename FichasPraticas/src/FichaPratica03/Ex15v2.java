package FichaPratica03;

import java.util.Scanner;

public class Ex15v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial, soma = 0;
        int inicio = 1;
        int inicio2 = 0;
        int soma2 = 0;
        int soma3 = 0;

        System.out.print("Introduza o factorial: ");
        fatorial = input.nextInt();

        inicio = fatorial;
        soma2 = fatorial;

        while (inicio >= 1) {

            inicio = inicio -1 ;
            soma3=1;

            inicio2 = soma2;

            while (soma3 < inicio) {

                soma3 = soma3 +1;
                soma2 = soma2 + inicio2;
            }


        }
        System.out.println(soma2);

    }
}

