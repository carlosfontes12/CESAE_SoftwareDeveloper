package FichaPratica03;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    int numeroFinal;
    int inicial = 0;
    int numero;
    int anterior = 0;
    int crescente = 1;
  

    System.out.print("Quantos números deseja inserir: ");
    numeroFinal = input.nextInt();

    while (inicial < numeroFinal){
        System.out.print("Introduza um numero: ");
        numero = input.nextInt();
        
       if (inicial > 0 && numero < anterior) {
        crescente = 0;
                }
              
        anterior = numero;
        inicial = inicial + 1;
    }

    if(crescente ==1) {
           System.out.println("Crescente.");
       }else {
           System.out.println("Não crescente.");
       }
       
        
        }
        
    }

