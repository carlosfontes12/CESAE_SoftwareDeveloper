package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis
        int valor1, valor2;

        // ler dados
        System.out.print("Introduza o valor1: ");
        valor1 = input.nextInt();
        System.out.print("Introduza o valor2: ");
        valor2 = input.nextInt();

        System.out.println("Antes da troca: valor1 = " + valor1 + ", valor2 = " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        //apresentação resultados
        System.out.println("depois da troca valor1: " + valor1);
        System.out.println("depois da troca valor2: " + valor2);


    }
}
