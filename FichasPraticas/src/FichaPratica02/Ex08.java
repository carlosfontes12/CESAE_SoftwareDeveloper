package FichaPratica02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, mediaPonderada;

        System.out.print("Introduza a 1ª nota: ");
        num1 = input.nextDouble();

        System.out.print("Introduza a 2ª nota: ");
        num2 = input.nextDouble();

        System.out.print("Introduza a 3ª nota: ");
        num3 = input.nextDouble();

        mediaPonderada = (num1 * 0.25) + (num2 * 0.35) + (num3 * 0.4);

        if (mediaPonderada >= 9.5) {
            System.out.println("Está aprovado");
        } else {
            System.out.println("Está reprovado");
        }
    }
}
