import java.util.Scanner;

/*
 * Crie uma aplicação java no qual o usuário digita um número e a partir do método main
 * chama-se métodos para imprimir de 1 até o número informando, usando laço for, while e do-while. Cada
 * um desses laços deverá estar em métodos diferentes.
 * TODOS OS MÉTODOS TEM QUE SER: SEM RETORNO E SEM PASSAGEM DE PARÂMETROS
 */
public class Prog2 {
    static int x;
    public static void metodoFor(){
        for(int i=1; i <= x; i++)
            System.out.println("FOR: "+i);
    }
    public static void metodoWhile(){
        int i=1;
        while(i<=x){
            System.out.println("WHILE: "+i);
            i++;
        }
    }

    public static void metodoDoWhile(){
        int i=1;
        do{
            System.out.println("DO-WHILE: "+i);
            i++;
        }while(i<=x);
    }
    public static void main(String[] args) {
        
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = dd.nextInt();
        metodoFor();
        metodoWhile();
        metodoDoWhile();
 
    }


    
}
