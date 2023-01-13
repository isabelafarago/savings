import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Funcionarios {
    public static Scanner scanner = new Scanner(System.in);

    public static int contador(File arq) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(arq));
        String linha;
        int qtdLinhas = 0;
        while ((linha = leitor.readLine()) != null)
            qtdLinhas++;
        leitor.close();
        System.out.println("No arquivo existem " + qtdLinhas + " linhas.");
        return qtdLinhas;
    }
    public static void tamanho(int[] tM, int qtdLinhas) {
        for (int i = 2; i <= qtdLinhas / 2; i++) {
            if (qtdLinhas % i == 0) {
                if (i * i == qtdLinhas) {
                    tM[0] = i;
                    tM[1] = i;
                    return;
                }
                if (tM[0] == 0)
                    tM[0] = i;
                else
                    tM[1] = i;
            }
            if (tM[0] != 0 && tM[1] != 0)
                if (tM[0] * tM[1] != qtdLinhas)
                    tM[1] = 0;
                else
                    return;

        }
    }
        public static void ordenar(String[][] matriz, File arq) throws IOException {
        }

    public static void main(String[] args) throws IOException {
        File arq;
        System.out.println("Informe o nome do arquivo a ser manipulado (.TXT)");
        arq = new File(scanner.nextLine());

        if (arq.exists()) {
            int qtdLinhas = contador(arq);
            int[] tM = new int[2];

            while (true) {
                tamanho(tM, qtdLinhas);
                if (tM[0] == 0 || tM[1] == 0)
                    qtdLinhas++;
                else
                    break;
            }
            System.out.println("Matriz de " + tM[0] + " por " + tM[1]);
            String[][] matriz = new String[tM[0]][tM[1]];
            ordenar(matriz, arq);

        } else {
            System.out.println("O arquivo desejado nao existe");
            System.exit(0);
        }
    }
}




