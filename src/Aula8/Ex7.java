package Aula8;
import java.util.Scanner;
public class Ex7 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int matriz[][] = new int [3][5];
        int newMatriz[][] = new int [3][5];
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                System.out.println("Digite um numero inteiro:");
                matriz[x][y] = scan.nextInt();
                
            }
        }
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                if ( matriz[x][y] < 0){
                    newMatriz[x][y] = 0;
                }else {
                    newMatriz[x][y] = matriz[x][y];
                }
                
            }
        }
        System.out.println("////////////////////");
        
        System.out.println("Primeira Matriz:");
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+ matriz[x][y]+"");
                
            }
            System.out.println("");
        }
        
        System.out.println("///////////////////");
        
        System.out.println("Matriz Modificada:");
         for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+ newMatriz[x][y]+"");
                
            }
            System.out.println("");
        }
        
        
    }

}
