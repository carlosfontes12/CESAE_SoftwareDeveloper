package FichasPraticasExtras03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[8];
        

        //ciclo de leitura do vetor 1
        System.out.println("Leitura do vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Insira um numero ao vetor1[" + i + "]: ");
            vetor1[i] = input.nextInt();

        }
        //ciclo de leitura do vetor 2
        System.out.println("Leitura do vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira um numero ao vetor2[" + i + "]: ");
            vetor2[i] = input.nextInt();
        }

        //impressao do ventor com elementos que estão nos dois vetores
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    System.out.println(vetor1[i]);
                    break;
                }
            }
        }
        
    }
}
