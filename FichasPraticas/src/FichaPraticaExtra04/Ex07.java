package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex07 {

    /**
     * Inverte o número inteiro fornecido.
     *
     * @param numero O número inteiro a ser invertido.
     * @return O número invertido.
     */
    public static int inverterInteiro(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um numero: ");
        int num = input.nextInt();
        int invertido = inverterInteiro(num);
        System.out.println("Numero invertido: " + invertido);
    }
}
