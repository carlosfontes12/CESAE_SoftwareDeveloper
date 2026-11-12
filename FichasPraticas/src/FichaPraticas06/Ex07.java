package FichaPraticas06;

import java.util.Scanner;

public class Ex07 {

    //função para ler o numero de linhas, como ainda nao sei o valor do user, a variavel linha fica dentro da funçao
    // e não dentro dos parentesis da funçao

    public static int numeroLinha() {
        int linha;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o numero de linhas: ");
        linha = input.nextInt();

        return linha;
    }
    //função para ler o numero de colunas,  como ainda nao sei o valor do user, a variavel coluna fica dentro da funçao
    // e não dentro dos parentesis da funçao

    public static int numeroColuna() {
        int coluna;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o numero de colunas: ");
        coluna = input.nextInt();

        return coluna;
    }

    //função para ler o caracter, como ainda nao sei o valor do user, a variavel caracter fica dentro da funçao
    // e não dentro dos parentesis da funçao
    public static String introduzirCaracter() {

        Scanner input = new Scanner(System.in);

        String caracter;

        System.out.print("Introduza um caracter: ");
        caracter = input.nextLine();

        return caracter;

    }

    public static void main(String[] args) {

        // dar uma variavel que vai receber o valor da função introduzirCaracter
        String caracterEscolhido = introduzirCaracter();

        // dar uma variavel que vai receber o valor da função numeroLinha
        int nLinhas = numeroLinha();

        // dar uma variavel que vai receber o valor da função numeroColuna
        int nColunas = numeroColuna();


        //ciclo de escrita
        for (int i = 0; i < nLinhas; i++) {
            for (int k = 0; k < nColunas; k++) {
                System.out.print(caracterEscolhido);

            }
                System.out.println(" ");


        }
    }
}
