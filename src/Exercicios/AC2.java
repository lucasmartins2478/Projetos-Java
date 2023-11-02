package Exercicios;
import java.util.Scanner;

public class AC2 {

 
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nomeUsuario = scan.next();
        System.out.println("Qual o seu email?");
        String emailUsuario = scan.next();
        System.out.println("Qual a sua senha?");
        String senhaUsuario = scan.next();
        System.out.println("Confirme sua senha:");
        String senhaConfirm = scan.next();


        if ( senhaUsuario.equals(senhaConfirm)){
            System.out.println("Seja bem vindo!");
        }else{
            System.out.println("As senhas nao batem");
        }
    }

}
