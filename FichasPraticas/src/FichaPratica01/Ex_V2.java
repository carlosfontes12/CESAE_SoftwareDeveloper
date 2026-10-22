package FichaPratica01;

import java.util.Scanner;

public class Ex_V2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, resultado;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        resultado = num1 + num2;
        System.out.println("Soma: " + resultado);
        resultado = num1 - num2;
        System.out.println("Subtração: " + resultado);
        resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);
        resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);

    }
}
