package Aula8;
import java.util.Scanner;
public class Ex4 {

 
    public static void main(String[] args) {
        int num = 10;
        int numMaior = 0;
        int matriz[][] = new int [5][3];
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
              matriz[x][y] = num;
              num++;
              
              if ( matriz[x][y]>numMaior){
                  numMaior = matriz[x][y];
              }
            }
           
        }
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+matriz[x][y]+"|");
            }
            System.out.println(""); 
        }
        
        System.out.println("O numero maior e:"+numMaior);
    }

}
