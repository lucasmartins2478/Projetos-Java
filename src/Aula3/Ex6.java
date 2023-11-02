package Aula3;
import java.util.Scanner;
public class Ex6 {
 
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite um número:");
        int num1 = sc.nextInt();
        
        for (int x = 1; x<= num1; x++){
            System.out.println("("+x+")"+nome);
        }
    }

}
