package FichaPratica03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, salto;
        int numero = 0;

        System.out.print("Introduza um limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um salto: ");
        salto = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }

    }
}
