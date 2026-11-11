package FichasPraticas05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int i;
    


        //ciclo de leitura

        for (i = 0; i < numeros.length; i++) {
            System.out.print("Insira numeros [" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        int par = -1;

        //ciclo de escrita
        for (i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 ) {
                
                if (par == -1 || numeros[i] > par) {
                    par = numeros[i];
                }

            }

        }

        if (par != -1) {
            System.out.println("O maior número par é: " + par);
        } else {
            System.out.println("Não tem números pares");
        }


    }
}


