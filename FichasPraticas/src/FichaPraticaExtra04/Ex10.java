package FichaPraticaExtra04;

import java.util.Scanner;

public class Ex10 {

    /**
     * Exibe um menu de opções para calcular a área de diferentes formas
     * geométricas. Permite ao usuário escolher entre quadrado, retângulo,
     * triângulo e círculo. A opção 0 encerra o programa.
     */
    public static void menu() {
        Scanner input = new Scanner(System.in);

        int opcao;
        double area;
        do {

            System.out.println("Menu de opções:");
            System.out.println("Escolha a forma do terreno para calcular a área:");
            System.out.println("0. Sair");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Triângulo");
            System.out.println("4. Círculo");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("A sair...");
                    break;
                case 1:
                    System.out.println("Calculando área do quadrado...");
                    area = calcularAreaQuadrado();
                    analisarTerreno(area);
                    break;
                case 2:
                    System.out.println("Calculando área do retângulo...");
                    area = calcularAreaRetangulo();
                    analisarTerreno(area);
                    break;
                case 3:
                    System.out.println("Calculando área do triângulo...");
                    area = calcularAreaTriangulo();
                    analisarTerreno(area);
                    break;
                case 4:
                    System.out.println("Calculando área do círculo...");
                    area = calcularAreaCirculo();
                    analisarTerreno(area);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

    }

    /**
     * Calcula a área do quadrado.
     *
     * @return a área do quadrado em m2
     */
    public static double calcularAreaQuadrado() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        double lado = input.nextDouble();
        double area = lado * lado;
        System.out.println("Área do quadrado: " + area);
        return area;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return a área do retângulo em m2
     */
    public static double calcularAreaRetangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = input.nextDouble();
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = input.nextDouble();
        double area = largura * comprimento;
        System.out.println("Área do retângulo: " + area);
        return area;
    }

    /**
     * Calcula a área do triângulo.
     *
     * @return a área do triângulo em m2
     */
    public static double calcularAreaTriangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
        return area;
    }

    /**
     * Calcula a área do círculo.
     *
     * @return a área do círculo em m2
     */
    public static double calcularAreaCirculo() {
        Scanner input = new Scanner(System.in);
        double PI = 3.14;
        System.out.print("Digite o raio do círculo: ");
        double raio = input.nextDouble();
        double area = PI * raio * raio;
        System.out.println("Área do círculo: " + area);
        return area;
    }

    /**
     * Pede o preço e a tipologia do terreno, calcula o preço por m2
     * e mostra o enquadramento no mercado.
     *
     * @param area a área do terreno em m2
     */
    public static void analisarTerreno(double area) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o preço do terreno (€): ");
        double preco = input.nextDouble();
        System.out.print("Qual o tipo de terreno? (URBANO, URBANIZAVEL, RUSTICO): ");
        String tipo = input.next();

        double precoM2 = preco / area;
        System.out.println("Preço por m2: " + precoM2 + " €/m2");

        verificarMercado(precoM2, tipo);
    }

    /**
     * Verifica se o preço por m2 está dentro do intervalo de mercado
     * da tipologia indicada. Se estiver fora, indica se está acima ou
     * abaixo e qual a diferença.
     *
     * @param precoM2 o preço por m2 do terreno
     * @param tipo    a tipologia (URBANO, URBANIZAVEL ou RUSTICO)
     */
    public static void verificarMercado(double precoM2, String tipo) {
        double minimo;
        double maximo;

        if (tipo.equals("URBANO")) {
            minimo = 450;
            maximo = 750;
        } else if (tipo.equals("URBANIZAVEL")) {
            minimo = 150;
            maximo = 500;
        } else if (tipo.equals("RUSTICO")) {
            minimo = 30;
            maximo = 60;
        } else {
            System.out.println("Tipo de terreno inválido!");
            return;
        }

        if (precoM2 < minimo) {
            double diferenca = minimo - precoM2;
            System.out.println("Fora do valor de mercado: ABAIXO do intervalo em " + diferenca + " €/m2.");
        } else if (precoM2 > maximo) {
            double diferenca = precoM2 - maximo;
            System.out.println("Fora do valor de mercado: ACIMA do intervalo em " + diferenca + " €/m2.");
        } else {
            System.out.println("Dentro do valor de mercado.");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
