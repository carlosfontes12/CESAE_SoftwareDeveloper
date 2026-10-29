package FichaPratica04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numero2;
        String caracter, resposta;
        int resultado=0;



        do {

            System.out.print("Introduza um valor:");
            numero=input.nextInt();

            System.out.print("Introduza outro valor:");
            numero2=input.nextInt();

            System.out.print("Introduza um caracter (+,-,*,/):");
            caracter=input.next();

        switch (caracter) {

            case "+":
                resultado = numero + numero2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = numero - numero2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = numero * numero2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = numero / numero2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operador invalido");

        }
            System.out.println("Deseja continuar? s/n");
            resposta = input.next();
      } while (!resposta.equals("n"));



    }
}

