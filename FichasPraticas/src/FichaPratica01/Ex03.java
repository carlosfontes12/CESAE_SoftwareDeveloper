package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int ladoA, ladoB, area, perimetro;

        System.out.print ("Introduza o valor do Lado A:" );
        ladoA = input.nextInt();
        System.out.print ("Introduza o valor do lado B: ");
        ladoB = input.nextInt();

        perimetro = ladoA + ladoA + ladoB + ladoB;
        area = ladoA * ladoB;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
