package Aula5;
import java.util.Scanner;
public class Exemplo8 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual a sua senha");
        String senha = sc.nextLine();
        
        boolean senhaCorreta = senha.equals("123") ? true : false;
        System.out.println(senhaCorreta);
        
    }

}
