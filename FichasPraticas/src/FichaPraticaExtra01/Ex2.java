package FichaPraticaExtra01;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso, pesoLua;

        System.out.print("Introduza o seu peso em (Kg): ");
        peso = input.nextDouble();

        if (peso <= 0) {
            System.out.print("Peso inválido.");
            return;
        }

        if (peso > 0) {
            pesoLua = peso * 0.16;
            System.out.println("O seu peso na Lua é: " + pesoLua + " Kg.");

        }

    }
}
