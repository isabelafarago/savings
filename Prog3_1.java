/*
 * Exemplo de construção de um programa similar ao cat do linux
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Prog3_1 {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        //File arq = new File(args[0]);
        //fr = new FileReader(arq); //abre o arquivo para leitura
        fr = new FileReader(args[0]);
        int x;
        while((x = fr.read()) != -1){ //lê um caracter do arquivo e coloca em x
            System.out.print((char)x); //imprime x
        }
        //arq.delete();

    }
}
