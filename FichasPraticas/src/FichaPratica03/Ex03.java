package FichaPratica03;

public class Ex03 {

    public static void main(String[] args) {

        int numero = 531;

        while (numero >= 531 && numero <= 750) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero = numero + 1;
        }
    }
}
