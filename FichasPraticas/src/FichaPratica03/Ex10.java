package FichaPratica03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = 2, limite;

        System.out.print("Introduza um número: ");
        limite = input.nextInt();


        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + 2;
        }

    }
}

