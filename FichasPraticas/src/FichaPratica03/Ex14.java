package FichaPratica03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    int numeroFinal;
    int inicial = 0;
    int numero;
    int anterior;

    System.out.print("Quantos números deseja inserir: ");
    numeroFinal = input.nextInt();

    while (inicial < numeroFinal){
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        
        
        if(numero>anterior) {
            anterior = numero;
        }
        inicial = inicial + 1;
        
        }
        System.out.println("crescente");
    }
}

