package FichaPratica03;

public class Ex02 {

    public static void main(String[] args) {

        int numero = 0;

        while (numero <= 400) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero = numero + 1;
        }
    }
}
