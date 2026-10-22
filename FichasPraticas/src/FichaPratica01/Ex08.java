package FichaPratica01;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int segundos1, segundos2, segundos3, segundos4, segundos5;
        int minutos1, minutos2, minutos3, minutos4, minutos5;
        int totalSegundos, horas;
        double minutos, segundos;


        // leitura de dados musica 1

        System.out.print("Introduza os segundos da musica 1: ");
        segundos1 = input.nextInt();20
        System.out.print("Introduza os minutos da musica 1: ");
        minutos1 = input.nextInt();

        // leitura de dados musica 2

        System.out.print("Introduza os segundos da musica 2: ");
        segundos2 = input.nextInt();
        System.out.print("Introduza os minutos da musica 2: ");
        minutos2 = input.nextInt();

        // leitura de dados musica 3

        System.out.print("Introduza os segundos da musica 3: ");
        segundos3 = input.nextInt();
        System.out.print("Introduza os minutos da musica 3: ");
        minutos3 = input.nextInt();

        // leitura de dados musica 4

        System.out.print("Introduza os segundos da musica 4: ");
        segundos4 = input.nextInt();
        System.out.print("Introduza os minutos da musica 4: ");
        minutos4 = input.nextInt();

        // leitura de dados musica 5

        System.out.print("Introduza os segundos da musica 5: ");
        segundos5 = input.nextInt();
        System.out.print("Introduza os minutos da musica 5: ");
        minutos5 = input.nextInt();

        totalSegundos = segundos1 + segundos2 + segundos3 + segundos4 + segundos5 + (minutos1 + minutos2 + minutos3 + minutos4 + minutos5) * 60;

        horas= totalSegundos/3600;
        minutos = (totalSegundos%3600)/60;
        segundos = totalSegundos%60;

        System.out.println("Horas: " + horas + "minutos: " + minutos + "segundos: " + segundos);
    }
}
