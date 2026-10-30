package FichasPraticasExtras02;

import java.util.Scanner;

public class Ex02 {

         public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;

        for (i = 1; i <= 255; i++) {

            if(i % 3 == 0)
            System.out.println(i);
        }
    }
}
