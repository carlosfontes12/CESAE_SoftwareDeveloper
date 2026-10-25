package FichaPratica02;

import java.util.Scanner;

public class Ex13V2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Introduza as horas: ");
        horas = input.nextInt();

        if (horas < 0 || horas > 23) {
            System.out.print("Hora inválida.");
            System.out.print(" Introduza uma hora válida: ");
            horas = input.nextInt();
        }

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (minutos < 0 || minutos > 59) {
            System.out.print("Minuto inválido.");
            System.out.print(" Introduza um minuto válido: ");
            minutos = input.nextInt();
        }

        if (horas <= 12 && minutos <= 59) {

            System.out.println(horas + ":" + minutos + " AM");
        }

        if (horas > 12 && minutos <= 59) {
            System.out.println((horas - 12) + ":" + minutos + " PM");
        }
    }
}
