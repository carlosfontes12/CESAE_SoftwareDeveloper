package FichaPratica03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 0;
        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        while (numero >= 0) {

            System.out.print("Introduza um número: ");
            numero = input.nextInt();

            if (numero > 0 && numero <= 25) {
                intervalo1 = intervalo1 + 1;
            }
            if (numero >= 26 && numero <= 50) {
                intervalo2 = intervalo2 + 1;
            }
            if (numero >= 51 && numero <= 75) {
                intervalo3 = intervalo3 + 1;
            }
            if (numero >= 76 && numero <= 100) {
                intervalo4 = intervalo4 + 1;
            }




        }
        System.out.println("0:25:" + " " + intervalo1);
        System.out.println("26:50:" + " " + intervalo2);
        System.out.println("51:75:" + " " + intervalo3);
        System.out.println("76:100:" + " " + intervalo4);
    }
}


