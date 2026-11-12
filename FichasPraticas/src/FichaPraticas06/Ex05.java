package FichaPraticas06;

import java.util.Scanner;

public class Ex05 {

    /**
     * Função que lê um valor inteiro e positivo do utilizador
     * @return Número inteiro e positivo
     */
    public static int lerInteiroPositivo() {
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Insira um número inteiro positivo: ");
            numero = input.nextInt();
        } while (numero < 0);

        return numero;
    }

    /**
     * Função que lê um vetor de inteiros, de um determinado tamanho, com valores do utilizador
     * @param tamanhoVetor Tamanho do vetor a ser lido
     * @return Vetor preenchido c/ números inteiros
     */
    public static int[] lerVetorInteiros(int tamanhoVetor){
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanhoVetor];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        return vetor;
    }

    /**
     * Função que imprime um vetor de inteiros na consola
     * @param vetor Vetor a ser impresso
     */
    public static void imprimirVetorInteiros(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" | ");
        }
    }

    /**
     * Função que descobre o maior elemento de um vetor de inteiros
     * @param vetor Vetor a ser analisado
     * @return Maior elemento
     */
    public static int maiorElemento(int[] vetor) {
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    /**
     * Função que descobre o menor elemento de um vetor de inteiros
     * @param vetor Vetor a ser analisado
     * @return <b>Menor</b> elemento
     */
    public static int menorElemento(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    /**
     * Função que calcula se um vetor é ou não <b>Crescente</b>
     * @param vetor Vetor a ser analisado
     * @return true se crescente | false se não crescente
     */
    public static boolean vetorCrescente(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }

        return true;
    }


}