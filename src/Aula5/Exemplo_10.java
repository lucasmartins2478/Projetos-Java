package Aula5;
import java.util.Scanner;
public class Exemplo_10 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int opt = 0;
        
        System.out.println("Olá, seja bem vindo a pagina");
        System.out.println("O que deseja fazer ?");
        System.out.println("1 - cadastrar");
        System.out.println("2 - entrar");
        System.out.println("3 - sair");
        System.out.println("4 - apagar");
        opt = scan.nextInt();
        
        switch (opt){
            case 1:
                System.out.println("Digite seu nome:");
                String nome = scan.nextLine();
                System.out.println("Digite seu nome de usuario:");
                String usuario = scan.nextLine();
                System.out.println("Digite sua senha:");
                String senha = scan.nextLine();
                System.out.println("Obrigado pelo cadastr");
                break;
            case 2:
                System.out.println("Digite seu usuario");
                String verificaUsuario = scan.nextLine();
                System.out.println("Digite sua senha");
                String verificaSenha = scan.nextLine();
                System.out.println("Seja bem vindo novamente");
        }
        
    }

}
