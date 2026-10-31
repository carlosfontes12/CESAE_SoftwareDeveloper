package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        int tabuada, i, resultado;


    do {

       
        System.out.println("Introduza 0 para sair.");
         System.out.print("Qual a tabuada que pretende calcular?");
         
        tabuada = input.nextInt();

        if ( tabuada == 0)
            break;

        System.out.println("Tabuada do: " + tabuada);

        for (i=1; i<=10; i++) {

        resultado = tabuada *i;

        System.out.println(tabuada + " x " + i + " = " + resultado);


        }
        
    } while (tabuada!=0);
}
}