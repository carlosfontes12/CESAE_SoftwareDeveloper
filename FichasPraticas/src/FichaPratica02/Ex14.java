package FichaPratica02;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insira o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextInt();
        System.out.print("Insira o terceiro número: ");
        num3 = input.nextInt();
        input.close();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.print(num3 + " " + num2 + " " + num1);
            } else {
                System.out.print(num2 + " " + num3 + " " + num1);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.print(num3 + " " + num1 + " " + num2);
            } else {
                System.out.print(num1 + " " + num3 + " " + num2);
            }
        } else {
            if (num1 >= num2) {
                System.out.print(num2 + " " + num1 + " " + num3);
            } else {
                System.out.print(num1 + " " + num2 + " " + num3);
            }
        }
}
    }