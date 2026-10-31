package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex04_2 {

     public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

    int i;
    String contador;
    
    contador = "*";

    for (i=1; i<=5; i++) {
        System.out.println(contador);
        contador= contador + "*";
    }

    
}
}