import java.util.Scanner;
public class Atividades {
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] count = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers[i] == numbers[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (count[i] > 0) {
                System.out.println("O numero " + numbers[i] + " aparece repetido " + (count[i] - 1) + " vez(es).");
            }
        }
    }
}