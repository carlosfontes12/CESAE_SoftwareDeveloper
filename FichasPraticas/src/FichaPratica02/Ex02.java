package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, taxa;

        System.out.print("Introduza o salário anual: ");
        salario = input.nextInt();

        if ( salario <= 15000)
        {
            taxa = (salario * 0.2);
            System.out.print("Paga taxa de 20%: " + taxa);
        }
        else
        {
            taxa = (salario*0.3);
            System.out.print("Paga taxa de 30%: " + taxa);
        }

    }
}
