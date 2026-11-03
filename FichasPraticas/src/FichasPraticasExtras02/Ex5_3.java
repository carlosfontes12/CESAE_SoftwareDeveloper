package FichasPraticasExtras02;

public class Ex5_3 {

    public static void main(String[] args) {

        int i, j, k;

        for (i = 1; i <= 5; i++) {

            for (j = 5 - i; j > 0; j--) {
                System.out.print(" ");

            }

            for (j = i; j >= 1; j--) {
                System.out.print(j);

            }

            for (k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
