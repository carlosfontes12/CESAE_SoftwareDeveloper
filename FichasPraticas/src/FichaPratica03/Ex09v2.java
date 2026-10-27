package FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double media;
        int numero, contador=0,soma=1;

      

        while (numero != -1){
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            contador = contador +1;
            soma = soma + numero;
                   }
        soma = soma - numero;
        media = soma/contador;

        System.out.println("media: " + media);


    }
}


