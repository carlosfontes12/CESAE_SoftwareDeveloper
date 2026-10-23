package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Introduza as horas: ");
        horas = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas <= 12) {
            if (minutos <= 59) {
                System.out.println(horas + ":" + minutos + "AM");
            } else{
                System.out.println("Minutos colocados errados");
            }
        }
        if (horas > 12){
            if (minutos <= 59){
                System.out.println((horas -12) + ":" + minutos + "PM");
            }else{
                System.out.println("Minutos colocados errados");
        }
    }
}
}

