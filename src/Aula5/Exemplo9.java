package Aula5;
import java.util.Scanner;
public class Exemplo9 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean isReady = true;
        
        do {
            System.out.println("Quer sair?");
            System.out.println("1 - sim");
            System.out.println("2 - não");
            int opt = scan.nextInt();
            
            switch (opt){
                case 1:
                    isReady = true;
                    break;
                case 2:
                    isReady = false;
                    break;
            }
            
        }while (isReady);
    }

}
