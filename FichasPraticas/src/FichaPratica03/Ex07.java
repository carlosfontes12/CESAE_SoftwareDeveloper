package FichaPratica03;

public class Ex07 {

    public static void main(String[] args) {

        int num = 1;
        int soma = 0;

        while (num <= 100) {
            System.out.println(num);
            soma = soma+num;
            num = num + 1;

        }

        System.out.println("Soma: " + soma);
    }
}
