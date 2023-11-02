package Aula5;
import java.util.Scanner;
public class Exemplo2 {

 
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int opt = 0;
        while (opt == 0){
            System.out.println("1 - cadastrar , 2 - sair.");
            opt = sc.nextInt();
            
            switch (opt){
                case 1:
                    System.out.println("Olá, seja bem vindo a pagina de cadastro");
                    System.out.println("Digite seu nome para continuar:");
                    String nome = sc.nextLine();
                    
            }
        }
    }

}
