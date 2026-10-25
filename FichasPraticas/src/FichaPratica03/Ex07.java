package FichaPratica03;

public class Ex07 {

    public static void main(String[] args) {

        int num = 0;
        int soma = -1;

        while (num <= 100) {
            System.out.println(num);
            num = num + 1;
            soma = num + soma;
        }
        System.out.println("Soma: " + soma);
    }
}
