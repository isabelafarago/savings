import java.util.Scanner;

public class App {
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        int num = 0;
        String palavra = "";
        do {
            System.out.println("----------------------MENU: DIGITE SUA OPCAO--------------------");
            System.out.println("1 -  informe um numero magico");
            System.out.println("2 - informe uma palavra magica");
            System.out.println("3 - Apague a frase a partir do numero magico");
            System.out.println("4 - Apague ate o numero magico");
            System.out.println("5 - sair. ");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    num = numeros(num);
                    break;
                case 2:
                    read.nextLine();
                    System.out.println("digite uma palavra");
                    palavra = read.nextLine();
                    break;
                case 3:
                    if (palavra.length() == 0) {
                        System.out.println("Insira uma palavra ou frase, por favor");

                    }
                    else{
                        System.out.println("numero magico: " + num);
                        System.out.println("Nova palavra magica: ");
                        palavraTotal(new StringBuilder(palavra), num);
                    }
                    break;
                case 4:
                    if (palavra.length() == 0) {
                        System.out.println("Insira uma palavra ou frase, por favor");
                    } else {
                        System.out.println("numero magico: " + num);
                        System.out.print("Retorno: ");
                        ateNumMag(new StringBuilder(palavra), num);
                    }
                    break;
                case 5:
                    sair();
                    break;
            }
            if (opc > 5) {
                System.out.println("Numero nao encontrado");
                System.exit(0);
            }
            if (opc < 1) {
                System.out.println("Numero nao encontrado");
                System.exit(0);
            }
        } while (true);
    }
    public static int numeros(int num){
        System.out.print("Por favor, informe o numero magico ");
        num = read.nextInt();
        return num;
    }
    public static void palavraTotal(StringBuilder palavra, int num) {
        for (int i = 1; i <= num; i++) {
            int apx = palavra.length();
            palavra = palavra.delete(num, apx);
        }
        System.out.println(palavra);
    }
    public static void ateNumMag (StringBuilder palavra, int num) {
        for (int i = num; i < palavra.length(); i++) {
            palavra = palavra.delete(0, num);
            String palavra2 = String.valueOf(palavra);
            System.out.println(palavra2);
        }
    }
    public static void sair() {
        System.out.println("Programa encerrado");
        System.exit(0);
    }
}







