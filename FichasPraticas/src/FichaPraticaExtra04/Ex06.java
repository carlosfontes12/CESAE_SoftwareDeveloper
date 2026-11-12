package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex06 {


    /**
     * Calcula o somatório dos dígitos de um número.
     *
     * @param numero O número cujo somatório dos dígitos será calculado.
     * @return O somatório dos dígitos do número.
     */
    public static int somatorio(int numero) {
        int partirNumeros = 10;
        int soma = 0;
        int digito;
        for (int i = numero; i > 0; i /= 10) {

            digito = numero % partirNumeros;
            soma = soma + digito / (partirNumeros / 10);
            partirNumeros *= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somatorioNumeros = 0;

        System.out.print("Introduza um numero: ");
        int num = input.nextInt();
        somatorioNumeros = somatorio(num);
        System.out.println("Somatorio: " + somatorioNumeros);

    }
}
