package FichaPraticas06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho(String animal) {
        if (animal.equals("Cão") || animal.equals("cão")) {
            System.out.println("Au au au!");
        } else if (animal.equals("Gato") || animal.equals("gato")) {
            System.out.println("Miau!");
        } else if (animal.equals("Vaca") || animal.equals("vaca")) {
            System.out.println("Muuuuu!");
        } else if (animal.equals("Porco") || animal.equals("porco")) {
            System.out.println("Oinc oinc!");
        } else if (animal.equals("Peixe") || animal.equals("peixe")) {
            System.out.println("Glub glub!");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String op;

        System.out.print("Qual é o animal?");
        op = input.nextLine();
        fazerBarulho(op);
        input.close();
    }
}
