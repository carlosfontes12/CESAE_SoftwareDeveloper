package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex03 {


    static double calcularAreaRectangulo(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largura, altura, resultado;

        System.out.print("Introduza a largura: ");
        largura = input.nextDouble();

        System.out.print("Introduza a altura: ");
        altura = input.nextDouble();

        resultado = calcularAreaRectangulo(largura, altura)


    }
}
