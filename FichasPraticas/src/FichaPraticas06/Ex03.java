package FichaPraticas06;

public class Ex03 {

    public static boolean par(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positivo(int numero) {
        if (numero >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                //System.out.println(i);
                contador = contador + 1;
            }
        }
        if (contador == 2 || numero == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean triangular(int numero) {
        int soma = 0;
        boolean triangular = false;
        for (int i = 1; soma < numero; i++) {
            soma = soma + i;
        }
        if (soma == numero) {
            triangular = true;
        }
        return triangular;

    }

    public static boolean perfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }
        return soma == numero;
    }

}
