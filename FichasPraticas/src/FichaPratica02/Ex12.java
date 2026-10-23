package FichaPratica02;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int opcao;

        System.out.print("Qual a opção que pretende selecionar? ");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("1.Criar");
                break;
            case 2:
                System.out.print("2.Atualizar");
                break;
            case 3:
                System.out.print("3.Eliminar");
                break;
            case 4:
                System.out.print("4.Sair");
                break;
            default:
                System.out.println("Opção invalida");

        }
    }
}

