package FichaPratica03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int numero2 = 0;

        System.out.print("Digite um número:");
        numero = input.nextInt();

        while (numero2 <= numero) {
            System.out.println(numero2);
            numero2 = numero2 + 1;
        }

    }
}
