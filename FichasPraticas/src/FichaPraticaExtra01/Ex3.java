package FichaPraticaExtra01;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double precoProduto;

        System.out.print("Introduza o preço do produto: ");
        precoProduto = input.nextDouble();

        if (precoProduto >= 100.00) {
            precoProduto = precoProduto * 0.9;
            System.out.println("Preço Final: " + precoProduto + " (10% de desconto)");
        } else {
            System.out.println("Preço Final: " + precoProduto + " (Sem desconto)");

        }
    }
}
