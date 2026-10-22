package FichaPratica02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduza o numero: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é impar");
        }
    }
}
