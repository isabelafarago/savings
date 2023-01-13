import java.util.Scanner;

public class Block003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String login;
        String senha;

        System.out.println("digite seu login");
        login = read.nextLine();
        if (login.equals("isabela")) {
            do {
                System.out.println("digite sua senha ");
                senha = read.nextLine();
                if (senha.equals("amanda")) {
                    System.out.println("senha correta, login realizado");
                } else {
                    System.out.println("senha errada");
                }
            }while (!senha.equals("amanda")) ;
        }else{
                System.out.println("login nao encontrado ");
            }
        }
    }






