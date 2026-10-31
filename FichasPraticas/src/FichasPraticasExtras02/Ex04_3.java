package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex04_3 {

      public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

    int i, j, k;


   

    for (i = 1; i <= 5; i++) {


    for(j=5-i; j>0; j--){
    System.out.print(" ");
        
    }
    for(k=1; k<=2*i-1; k++){
        System.out.print("*");
    }
    System.out.println();
}
}
}
