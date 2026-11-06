package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int[] numeros = new int[10];
        int pesquisa;
        boolean existeNoArray = false;


        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();
        }

        // perguntar o numero a pesquisar
        System.out.println();
        System.out.print("qual o numero a pesquisar: ");
        pesquisa = input.nextInt();

        //procurar numero e apresentar resultados
        for (int i = 0; i < numeros.length; i++) {
            if (pesquisa == numeros[i]) {
                existeNoArray = true;
                System.out.println();
                System.out.println(numeros[i] + " está no array");
            }

        }

        if (existeNoArray == false) {
            System.out.println();
            System.out.println(pesquisa + " Não está no array");
        }
    }


}
