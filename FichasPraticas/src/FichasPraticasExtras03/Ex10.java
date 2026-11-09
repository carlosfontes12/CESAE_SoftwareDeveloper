package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] numeros = new int[12];

        //ciclo de leitura
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira um numero ao array[" + i + "]: ");
            numeros[i] = input.nextInt();

        }
        //apresentar array sem elementos repetidos
        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                System.out.println(numeros[i]);
            }
        }

    
}
}