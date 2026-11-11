package FichaPraticas06;

import java.util.Scanner;

public class Ex02 {

    // Função para imprimir uma linha de asteriscos
    public static void asterisco(int quantidade) {

        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //função para obter um número positivo do usuário
    public static int numero(int num) {
        do {
            System.out.print("Digite um número: ");
            num = new Scanner(System.in).nextInt();

        } while (num <= 0);

        return num;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // pedir o número até ser positivo
        int numero = numero(0);

        // chamar a funçao depois de obter um número positivo
        asterisco(numero);

        input.close();
    }
}
