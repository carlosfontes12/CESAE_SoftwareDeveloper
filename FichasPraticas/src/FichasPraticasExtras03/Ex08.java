package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//pedir ao utilizador o tamanho do array
        System.out.print("Introduza o tamanho do array:");
        int x = input.nextInt();

        //declarar array de inteiros
        int[] numeros = new int[x + 1];

        //pedir ao utilizador os elementos do array
        for (int i = 0; i < x; i++) {
            System.out.print("Introduza o elemento " + (i + 1) + ":");
            numeros[i] = input.nextInt();
        }

        //pedir ao utilizador novo valor
        System.out.print("Introduza o novo valor:");
        int novoValor = input.nextInt();

        //pedir posição onde inserir o novo valor
        System.out.print("Introduza a posição onde inserir o novo valor:");
        int posicao = input.nextInt();

        //inserir o novo valor na posição indicada
        for (int i = x; i > posicao; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[posicao] = novoValor;
        x++;
        //apresentar o array após a inserção do novo valor
        System.out.print("Array após inserir o novo valor:");
        for (int i = 0; i < x; i++) {
            System.out.println(numeros[i]);
        }

    }
}
