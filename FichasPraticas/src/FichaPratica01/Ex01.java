package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print ("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print ("Introduza outro número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println ("Soma: " + soma);
    }
}
