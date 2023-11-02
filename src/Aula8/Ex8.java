package Aula8;
import java.util.Scanner;
public class Ex8 {

 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int matriz[][] = new int [5][5];
         int[] soma = new int [5];
         
         
         
         for ( int x = 0; x<matriz.length; x++){
             for ( int y = 0; x<matriz[x].length; y++){
                 System.out.println("Digite um numero:");
                 matriz[x][y] = scan.nextInt();
             }
         }
         
         
         
         for ( int x = 0; x<matriz.length; x++){
             for ( int y = 0; x<matriz[x].length; y++){
                 
                 soma[y] += matriz[x][y];
                 
             }
           
         }
           
             for ( int x = 0; x <soma.length; x++){
                 System.out.println(soma[x]);
             }
    }

}
