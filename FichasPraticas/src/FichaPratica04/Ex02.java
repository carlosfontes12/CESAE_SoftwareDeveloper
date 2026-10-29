package FichaPratica04;

public class Ex02 {

    public static void main(String[] args) {

    int soma=0;
    int i;

    for (i=11; i<=51; i++){

        if (i%2!=0) {
            System.out.println(i);
        }
        soma = soma + i;
    }
     System.out.print(soma);

}
}
