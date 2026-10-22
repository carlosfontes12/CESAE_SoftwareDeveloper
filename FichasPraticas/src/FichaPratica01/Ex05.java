package FichaPratica01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int notaA, notaB, notaC;
        double media, mediaPonderada;

        System.out.print("Introduza a primeira nota: ");
        notaA = input.nextInt();
        System.out.print("Introduza o valor da segunda nota: ");
        notaB = input.nextInt();
        System.out.print("Introduza o valor da terceira nota: ");
        notaC = input.nextInt();

        media = (notaA + notaB + notaC)/3;
        mediaPonderada = (notaA * 0.2) + (notaB * 0.3) + (notaC*0.5);

        System.out.println("Media aritmetrica: " + media);
        System.out.println("Media ponderada: " + mediaPonderada);

    }
}
