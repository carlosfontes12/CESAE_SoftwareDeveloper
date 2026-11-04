package FichasPraticas05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[12];
        int i;
        int totalMensal = 0;

        //ciclo de leitura

        for (i = 0; i < comissoes.length; i++) {
            System.out.print("Insira a comissão: ");
            comissoes[i] = input.nextInt();
        }

        //ciclo de escrita

        for (i = 0; i < comissoes.length; i++) {
            totalMensal += comissoes[i];
        }
        System.out.println(totalMensal);
    }
}