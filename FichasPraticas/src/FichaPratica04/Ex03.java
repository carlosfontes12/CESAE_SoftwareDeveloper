package FichaPratica04;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, i;

        System.out.print("introduza um número: ");
        numero = input.nextInt();

        for (i=1; i<=numero; i++) {

            if (numero % i ==0) {

                System.out.println(i);
            }


            }

        }

        }