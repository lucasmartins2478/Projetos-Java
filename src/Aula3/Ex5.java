package Aula3;
import java.util.Scanner;
public class Ex5 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        for (int x = 1;x<=10;x++){
            System.out.println("("+x+")"+nome);
        }
    }

}
