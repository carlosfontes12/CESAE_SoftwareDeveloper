package FichaPratica02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorLido;
        int notas200, notas100, notas50, notas20, notas10, notas5;

        System.out.print("Insira um valor: ");
        valorLido = input.nextInt();

        if (valorLido % 5 != 0) {
            System.out.print("O valor inserido não é múltiplo de 5.");
            return;
        }

        notas200 = valorLido / 200;
        valorLido = valorLido % 200;

        notas100 = valorLido / 100;
        valorLido = valorLido % 100;

        notas50 = valorLido / 50;
        valorLido = valorLido % 50;

        notas20 = valorLido / 20;
        valorLido = valorLido % 20;

        notas10 = valorLido / 10;
        valorLido = valorLido % 10;

        notas5 = valorLido / 5;
        valorLido = valorLido % 5;

        System.out.println("Notas de 200: " + notas200);
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);

    }
}
