package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex03 {

/**
 * Calcula a área de um rectângulo.
 * @param ladoA O comprimento de um lado do rectângulo.
 * @param ladoB O comprimento do outro lado do rectângulo.
 * @return A área do rectângulo.
 */
    static double calcularAreaRectangulo(double ladoA, double ladoB) {
        double area = ladoA * ladoB;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, altura, resultado;

        System.out.print("Introduza a base: ");
        base = input.nextDouble();

        System.out.print("Introduza a altura: ");
        altura = input.nextDouble();

        resultado = calcularAreaRectangulo(base, altura);
        System.out.println("A área do rectângulo é: " + resultado);


    }
}
