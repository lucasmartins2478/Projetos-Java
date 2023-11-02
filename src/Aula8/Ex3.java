package Aula8;
import java.util.Scanner;
public class Ex3 {

 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
       
        
        int matriz[][] = new int [3][4];
        int soma = 0;
        
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
        
         for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                soma += matriz[x][y];
                
            }
        }
         System.out.println("A soma dos numeros da matriz e:"+ soma);
    }

}
