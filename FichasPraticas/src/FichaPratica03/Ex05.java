package FichaPratica03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, numero2 = 0;
        String frase;

        System.out.print("Introduza um número: ");
        numero = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Introduza uma mensagem: ");
        frase = input.nextLine();

        while (numero2 < numero) {
            System.out.println(frase);
            numero2 = numero2 + 1;
        }

    }
}
