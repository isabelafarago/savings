import java.util.Scanner;

/*
 * Crie uma aplicação java no qual o usuário digita um número e a partir do método main
 * chama-se métodos para imprimir de 1 até o número informando, usando laço for, while e do-while. Cada
 * um desses laços deverá estar em métodos diferentes. Os método devem ser de objeto.
 */
public class Prog3 {

    public void metodoFor(int x){
        for(int i=1; i <= x; i++)
            System.out.println("FOR: "+i);
    }
    public void metodoWhile(int x){
        int i=1;
        while(i<=x){
            System.out.println("WHILE: "+i);
            i++;
        }
    }

    public void metodoDoWhile(int y){
        int i=1;
        do{
            System.out.println("DO-WHILE: "+i);
            i++;
        }while(i<=y);
    }
    public static void main(String[] args) {
        int x;
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = dd.nextInt();
        Prog3 z = new Prog3(); //criando um objeto da classe Prog3
        z.metodoFor(x);
        z.metodoWhile(x);
        z.metodoDoWhile(x);
 
    }


    
}
