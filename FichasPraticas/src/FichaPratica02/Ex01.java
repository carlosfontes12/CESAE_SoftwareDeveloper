package FichaPratica02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variaveis
        int num1, num2;

        System.out.print("Introduza o primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("Introduza o segundo valor: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("maior: " + num1);
        } else {
            if (num2 > num1)
                System.out.println("maior: " + num2);
        }
    }
}
