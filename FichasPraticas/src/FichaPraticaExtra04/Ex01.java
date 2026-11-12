package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex01 {

    public static int numeroMaisPequeno(int numero1, int numero2, int numero3) {
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(numero1);
            return numero1;
        }
        if (numero2 < numero1 && numero2 < numero3) {
            System.out.println(numero2);
            return numero2;

        }
        if (numero3 < numero1 && numero3 < numero2) {
            System.out.println(numero3);
            return numero3;
        }

        return 0;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextInt();

        System.out.print("Introduza o terceiro numero: ");
        num3 = input.nextInt();

        System.out.print("Menor: ");
        menor = numeroMaisPequeno(num1, num2, num3);


    }
}
