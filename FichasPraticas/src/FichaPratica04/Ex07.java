package FichaPratica04;

import java.util.Scanner;

public class Ex07 {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, i;
        int contador=0;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();
    

        for (i = 1; i <= numero; i++) {

            if (numero % i == 0 ) {
                //System.out.println(i);
                contador= contador + 1;
            }
        }
if (contador == 2 || numero == 1) {
    System.out.println(numero + " é primo.");
} else {
    System.out.println(numero + " não é primo.");
}
}
}


