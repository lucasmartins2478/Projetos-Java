package Aula5;
import java.util.Scanner;
public class Exemplo3 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, o que deseja fazer :");
        System.out.println("1 - cadastrar");
        System.out.println("2 - apagar");
        System.out.println("3 - editar");
        System.out.println("4 - sair");
        int opc = sc.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("Seja bem vindo a pagina de casdastro, vamos começar!");
                System.out.println("Digite seu nome");
                String nome = sc.nextLine();
                System.out.println("Digite seu nome de usuário");
                String usuario = sc.nextLine();
                System.out.println("Digite sua senha");
                String senha = sc.nextLine();
                System.out.println("Obrigado por se cadastrar na pagina");
                break;
                
            case 2:
                System.out.println("Qual o seu usuario");
                String usuario1 = sc.nextLine();
                
        }
        
    }

}
