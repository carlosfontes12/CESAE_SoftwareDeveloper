package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

    /**
     * função para contar o numero de musicas
     *
     * @param caminho
     * @return numero de musicas
     * @throws FileNotFoundException
     */
    public static int numeroMusicas(String caminho) throws FileNotFoundException {
        int contadorMusicas = 0;

        //ler o ficheiro
        File ficheiro = new File("FicheirosFicha07/exercicio_09.csv");
        Scanner sc = new Scanner(ficheiro);
        sc.nextLine();

        //contar numero de musicas
        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            contadorMusicas++;
        }
        return contadorMusicas;
    }



        public static void main (String[]args) throws FileNotFoundException {

            Scanner input = new Scanner(System.in);

            //ler o ficheiro
            File ficheiro = new File("FicheirosFicha07/exercicio_09.csv");
            Scanner sc = new Scanner(ficheiro);

            //salta o cabeçalho
            sc.nextLine();


            //menu
            int opcao = 0;

            do {
                System.out.println("-+-+-+-+- MENU -+-+-+-+-");
                System.out.println("0. Sair");
                System.out.println("1.Pesquisar por músicas de um determinado género");
                System.out.println("2. Pesquisar músicas de um determinado artista");
                System.out.println("3. Pesquisar música com maior duração.");
                System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
                System.out.println("5. Número de músicas no ficheiro");
                System.out.println(" ");
                System.out.print("Qual a opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("A sair...");
                        break;
                    case 1:
                        System.out.println(" Pesquisar por músicas de um determinado género");
                        break;
                    case 2:
                        System.out.println("Pesquisar músicas de um determinado artista");
                        break;
                    case 3:
                        System.out.println("Pesquisar música com maior duração" );
                        break;
                    case 4:
                        System.out.println("Pesquisar músicas com duração acima de um valor especificado");
                        break;
                    case 5:
                        System.out.println("Número de músicas no ficheiro: " + numeroMusicas("FichasPraticas/FicheirosFicha07/exercicio_09.csv"));
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;

                }

            } while (opcao != 0);


        }
    }
