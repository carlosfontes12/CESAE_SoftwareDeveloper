package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex05 {

    /**
     * Retorna a piada correspondente ao número fornecido.          
     * @param piada O número da piada desejada.
     * @return A piada correspondente ao número fornecido.
     */
    public static String contarPiada(int piada) {
        switch (piada) {
            case 1:
                return "Qual é a panela que está sempre triste? A panela depressão.";
            case 2:
                return "O  que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";
            case 3:
                return "Que nome se dá a uma ferramenta perdida? Foice.";
            case 4:
                return "Por que o livro de matemática se suicidou? Porque tinha muitos problemas.";
            case 5:
                return "Por que o computador foi ao médico? Porque estava com um vírus.";
            case 6:
                return "O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais \r\n"
                        + "um porque o filme é para mais de 18.";
            case 7:
                return "Qual é o cúmulo da paciência? Esperar que a água ferva no micro-ondas.";
            case 8:
                return "Qual é o cúmulo da distração? Esquecer onde colocou os óculos enquanto os está a usar.";
            case 9:
                return "Por que o tomate foi ao banco? Porque queria se tornar um extrato.";
            case 10:
                return "O que é um vegetariano que come carne? Um ex-vegetariano.";
            case 11:
                return "Qual é o animal mais antigo? A zebra, porque está em preto e branco.";
            case 12:
                return "Por que o livro de história se sentiu mal? Porque tinha muitas páginas tristes.";
            case 13:
                return "O que é um peixe que usa óculos? Um peixe-espelho.";
            default:
                return "A biblioteca de piadas só tem 13 piadas.";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o número da piada (1-13): ");
        int piada = input.nextInt();
        System.out.println(contarPiada(piada));
    }
}
