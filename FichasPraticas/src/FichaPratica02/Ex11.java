package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variáveis
        int saldo, montanteMovimentar, saldoFinal;

        // ler valores do utilizador
        System.out.print("Introduza o saldo médio: ");
        saldo = input.nextInt();

        System.out.print("Introduza o valor a movimentar: ");
        montanteMovimentar = input.nextInt();

        saldoFinal = saldo + montanteMovimentar;

        if (saldoFinal >= 0) {
            System.out.println("Saldo atual: " + saldoFinal);
        } else {
            System.out.println("Operação invalidada");
            System.out.println("Saldo atual: " + saldo);
        }
    }
}