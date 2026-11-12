package FichaPraticas06;

import java.util.Scanner;

import static FichaPraticas06.Ex05.*;

public class Ex06 {

    public static void menu() {

        Scanner input = new Scanner(System.in);
        int opcao, tamanho;

        System.out.println("Qual o tamanho do vetor?");
        tamanho = lerInteiroPositivo();

        int[] vetorUtilizador = lerVetorInteiros(tamanho);

        do {

            System.out.println("\n-+-+-+-+-+-+- PROGRAMA ANALISAR VETORES -+-+-+-+-+-+-");
            System.out.print("Vetor: ");
            imprimirVetorInteiros(vetorUtilizador);

            System.out.println("\n1. Maior elemento");
            System.out.println("2. Menor elemento");
            System.out.println("3. Crescente");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Maior elemento
                    System.out.println("Maior elemento: " + maiorElemento(vetorUtilizador));
                    break;

                case 2: // Menor elemento
                    System.out.println("Menor elemento: " + menorElemento(vetorUtilizador));
                    break;

                case 3: // Crescente ou não

                    if (vetorCrescente(vetorUtilizador)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Não crescente");
                    }

                    break;

                case 0: // Sair
                    System.out.println("A encerrar...");
                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}