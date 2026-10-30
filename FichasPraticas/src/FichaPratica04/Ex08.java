package FichaPratica04;

import java.util.Scanner;

public class Ex08 {

       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

int numero, i, soma=0;
boolean triangular = false;





        System.out.print("Introduza um número: ");
        numero = input.nextInt();




        for (i=1; soma<numero;i++){
        //System.out.println(i);
        soma=soma+i;
    
        }
if (soma == numero){
           
            triangular = true;
        }
System.out.println(triangular);
}
}