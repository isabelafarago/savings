import java.util.Scanner;
public class Ativ4 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro positivo");
        int input = scan.nextInt();
        int output = 0;
        int remainder;
        int i = 1;
        while (input != 0) {
            remainder = input % 2;
            input = input / 2;
            output = output + (remainder * i);
            i = i * 10;
        }
        System.out.println("Numero em binario: " + output);
    }
}