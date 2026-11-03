package FichasPraticasExtras02;

public class Ex5_3 {

    public static void main(String[] args) {

    int i, j, k;

        for (i = 1; i <= 5; i++) {


            for(j=5-i; j>0; j--){
                System.out.print(" ");

            }
            for(k=1; k<=2*i-1; k++){
                System.out.print(i);
            }
            System.out.println();
        }
}
}
