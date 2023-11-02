package Aula8;
import java.util.Scanner;
public class Ex2 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int matriz[][] = new int [4][3];
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                System.out.println("Digite um numero:");
                matriz[x][y] = scan.nextInt();
            }
        }
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+matriz[x][y]+"|");
            }
            System.out.println("");
        }
        
    }

}
