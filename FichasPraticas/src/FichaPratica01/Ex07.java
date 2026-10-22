package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double produtoA, produtoB, produtoC, total;

        System.out.print("Introduza o valor do produto A: ");
        produtoA = input.nextDouble();
        System.out.print("Introduza o valor do produto B: ");
        produtoB = input.nextDouble();
        System.out.print("Introduza o valor do produto C: ");
        produtoC = input.nextDouble();

        total = (produtoA + produtoB + produtoC) * 0.9;

        System.out.println("O valor final é de: " + total);

    }
}
