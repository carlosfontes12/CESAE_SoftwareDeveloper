package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2,soma, subtracao, multplicacao;
        double divisao;
        String opcao;

        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Qual a operação aritmétrica que pretende utilizar? ");
        opcao = input.next();


        switch (opcao){
            case "+":
                soma = num1+num2;
                System.out.print("Soma: " + soma);
                break;

            case "-":
                subtracao = num1 - num2;
                System.out.print("Subtração: " + subtracao);
                break;

            case "*":
                multplicacao = num1 * num2;
                System.out.print("Multiplicação: " + multplicacao);
                break;

            case "/":
                divisao = num1 / num2;
                System.out.print("Divisão " + divisao);
                break;

            default:
                System.out.println("Erro");

        }
    }
}
