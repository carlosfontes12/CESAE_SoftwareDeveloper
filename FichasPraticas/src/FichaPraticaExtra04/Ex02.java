package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex02 {

    /**
     * função para calcular a media de 3 valores
     * @param num1 valor pedido
     * @param num2
     * @param num3
     * @return media
     */
    static double media(double num1, double num2, double num3) {
        double media = 0;

        media = (num1 + num2 + num3) / 3;

        return media;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numero1, numero2, numero3;
        double resultado;

        System.out.print("Introduza um número: ");
        numero1 = input.nextDouble();

        System.out.print("Introduza o segundo número: ");
        numero2 = input.nextDouble();

        System.out.print("Introduza o terceiro número: ");
        numero3 = input.nextDouble();

        resultado = media(numero1, numero2, numero3);

        System.out.println("A média é: " + resultado);

    }
}
