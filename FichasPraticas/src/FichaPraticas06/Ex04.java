package FichaPraticas06;

// vai buscar todos os métodos static do Ex03 (par, positivo, primo, perfeito, triangular)
import static FichaPraticas06.Ex03.*;
import java.util.Scanner;

public class Ex04 {

    // mostra o menu
       public static void menu(int numeroAtual) {
        System.out.println();
        System.out.println("+-+-+-+-+-+ Analise de um Número +-+-+-+-+-+");
        System.out.println("Número atual: " + numeroAtual);
        System.out.println();
         System.out.println("0. Sair");
        System.out.println("1. Par ou Ímpar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo ou Não Primo");
        System.out.println("4. Perfeito ou Não Perfeito");
        System.out.println("5. Triangular ou Não Triangular");
        System.out.println("6. Trocar de Número");
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int op, numeroEscolhido;

        // o primeiro número é pedido o
        System.out.print("Introduza um número: ");
        numeroEscolhido = input.nextInt();

        
        do {
            menu(numeroEscolhido);
            System.out.print("Qual das opções deseja escolher? ");
            op = input.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    
                    System.out.println("O número " + numeroEscolhido + (par(numeroEscolhido) ? " é par" : " é ímpar"));
                    break;
                case 2:
                    System.out.println("O número " + numeroEscolhido + (positivo(numeroEscolhido) ? " é positivo" : " é negativo"));
                    break;
                case 3:
                    System.out.println("O número " + numeroEscolhido + (primo(numeroEscolhido) ? " é primo" : " não é primo"));
                    break;
                case 4:
                    System.out.println("O número " + numeroEscolhido + (perfeito(numeroEscolhido) ? " é perfeito" : " não é perfeito"));
                    break;
                case 5:
                    System.out.println("O número " + numeroEscolhido + (triangular(numeroEscolhido) ? " é triangular" : " não é triangular"));
                    break;
                case 6:
                    
                    System.out.print("Introduza um novo número: ");
                    numeroEscolhido = input.nextInt();
                    System.out.println("Número alterado para " + numeroEscolhido + ". Escolha agora uma análise.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 0); 

        input.close();
    }
}
