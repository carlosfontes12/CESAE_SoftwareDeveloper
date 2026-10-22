package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("introduza o primeiro numero: ");
        num1 = input.nextInt();

        System.out.print("introduza o segundo numero: ");
        num2 = input.nextInt();

        System.out.print("introduza o terceiro numero: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }
}
