package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex09 {

    /**
     * Retorna o nome do mês correspondente ao número fornecido.
     * @param numero O número do mês (1 a 12).
     * @return O nome do mês correspondente ou "Número inválido" se o número não estiver entre 1 e 12.
     */
    public static String mes(int numero) {
        switch (numero) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Número inválido";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numero;
        System.out.print("Introduza um número de 1 a 12: ");
        numero = input.nextInt();
        System.out.println("O mês correspondente é: " + mes(numero));
    }
}
