package FichaPratica02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int posicao;

        System.out.print("Em que posição ficou: ");
        posicao = input.nextInt();

        switch (posicao) {
            case 1:
                System.out.println("Ganhou 10 pontos");
                break;
            case 2:
                System.out.println("Ganhou 8 pontos");
                break;
            case 3:
                System.out.println("Ganhou 6 pontos");
                break;
            case 4:
                System.out.println("Ganhou 5 pontos");
                break;
            case 5:
                System.out.println("Ganhou 4 pontos");
                break;
            case 6:
                System.out.println("Ganhou 3 pontos");
                break;
            case 7:
                System.out.println("Ganhou 2 pontos");
                break;
            case 8:
                System.out.println("Ganhou 1 pontos");
                break;
            default:
                System.out.println("Escolha outro número");
        }

    }
}
