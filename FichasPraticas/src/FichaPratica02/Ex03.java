package FichaPratica02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salario;
        double taxa;

        System.out.print("Introduza o salário anual: ");
        salario = input.nextInt();

        if (salario <= 15000)
        {
            taxa = salario * 0.2;
            System.out.println("Paga taxa de 20%: " + taxa);
            return;
        }
        if (salario > 15000 && salario <= 20000)
        {
            taxa = salario * 0.3;
            System.out.println("Paga taxa de 30%: " + taxa);
            return;
        }
        if (salario > 20000 && salario <= 25000)
        {
            taxa = salario * 0.35;
            System.out.print("Paga taxa de 35%: " + taxa);
            return;
        }
        if (salario >= 25000)
        {
            taxa = salario * 0.4;
            System.out.print("Paga taxa de 40%: " + taxa);
            return;
        }

    }
}
