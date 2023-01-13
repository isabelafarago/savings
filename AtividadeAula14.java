import java.io.*;
import java.util.Scanner;

public class AtividadeAula14 {
    public static void main(String[] args) throws IOException {
        int opcao;

        for (; ; ) {
            System.out.println("<------------------ Sistema de Cadastro de Pessoas ------------------>");
            System.out.print("""
                    1 - Para cadastrar pessoas
                    2 - Imprimir
                    3 - Para Sair

                    Digite a opção:\s""");
            opcao = new Scanner(System.in).nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de cadastros: ");
                    criarAquivoTexto(cadastrarPessoas(new Scanner(System.in).nextInt()));
                    break;
                case 2:
                    System.out.println("imprimir");
                    imprimirAquivoTexto();
                    break;
                case 3:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Opação Invalida!");
            }//switch
        }//menu

    }//main

    public static String cadastrarPessoas(int x) {
        StringBuilder linha = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            System.out.println("Cadastro numero " + i);
            System.out.print("Nome: ");
            linha.append(new Scanner(System.in).nextLine().replace(";", ""));
            linha.append(";");
            System.out.print("Enderenço: ");
            linha.append(new Scanner(System.in).nextLine().replace(";", ""));
            linha.append(";");
            System.out.print("Telefone: ");
            linha.append(new Scanner(System.in).nextLine().replace(";", ""));
            linha.append("\n");
        }
        return linha.toString();
    }//cadastrar pessoas

    public static void criarAquivoTexto(String pessoa) {

        try (FileWriter fr = new FileWriter("pessoa.txt", true);
             BufferedWriter bf = new BufferedWriter(fr)) {
            bf.append(pessoa);
        } catch (IOException e) {
            System.out.println("erro ao gravar o arquivo " + e);
        }
    }//gravar pessoas em arquivo

    public static void imprimirAquivoTexto() {
        // esse esta cortando a primeira letra da segunda linha
        try (FileReader fr = new FileReader("pessoa.txt");
             BufferedReader bfr = new BufferedReader(fr)) {
            String linha;
            while ((linha = bfr.readLine()) != null) {
                String[] nome = linha.split(";");
                System.out.println("----------------");
                System.out.println("Nome: " + nome[0]);
                System.out.println("Endereço: " + nome[1]);
                System.out.println("Telefone: " + nome[2]);
            }

        } catch (IOException e) {
            System.out.println("Erro ao localizar o arquivo" + e);
        }
    }

    public static void imprimirAquivoTexto1() {//usando Scanner
        try (FileReader fr = new FileReader("pessoa.txt");
             Scanner bfr = new Scanner(fr)) {
            // ai eu fiz esse.
            while (bfr.hasNextLine()) {
                String linha = bfr.nextLine();
                String[] nome = linha.split(";");
                System.out.println("----------------");
                System.out.println("Nome: " + nome[0]);
                System.out.println("Endereço: " + nome[1]);
                System.out.println("Telefone: " + nome[2]);
            }

        } catch (IOException e) {
            System.out.println("Erro ao localizar o arquivo" + e);
        }
    }
}//class
