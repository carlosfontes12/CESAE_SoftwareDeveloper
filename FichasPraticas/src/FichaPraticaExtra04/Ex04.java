package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex04 {

    /** função que imprime a tabuada de um número
     * 
     * @param numero O número para o qual se deseja imprimir a tabuada.
     */
    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número para a tabuada: ");
        int num = input.nextInt();
        imprimirTabuada(num);
    }
}
