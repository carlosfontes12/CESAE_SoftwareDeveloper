package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int numero;
        int numero2 = 1;
        int multiplicacao = 1;

        System.out.print("Digite um número:");
        numero = input.nextInt();

        while (numero2 <numero) {
            numero2 = numero2 + 1;
            multiplicacao=multiplicacao*numero2;

        }
         
         System.out.println(multiplicacao);
}
}
