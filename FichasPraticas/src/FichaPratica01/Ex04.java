package FichaPratica01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        final double PI = 3.14;
        int raio;
        double area;

        System.out.print("Introduza o valor do Raio: ");
        raio = input.nextInt();

        area = PI * raio * raio;

        System.out.println("A area é:" + area);

    }
}
