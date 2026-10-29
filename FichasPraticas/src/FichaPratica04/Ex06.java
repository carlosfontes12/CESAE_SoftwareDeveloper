package FichaPratica04;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroJogador1, numeroJogador2;
        int contador =0;

        System.out.print("Introduza o numero entre 0 a 100: ");
        numeroJogador1 = input.nextInt();


        do{
            System.out.print("introduza o numero: ");
            numeroJogador2 = input.nextInt();
            contador = contador + 1;

        } while (numeroJogador2 != numeroJogador1);
        System.out.println("precisou de: " + contador + " vezes");

        }

    }


