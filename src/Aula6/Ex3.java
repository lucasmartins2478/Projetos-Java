package Aula6;
import java.util.Scanner;
public class Ex3 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int[] notas = new int[4];
        int media = 0;
        
        for (int i =0; i<notas.length; i++){
            System.out.println("Digite sua nota:");
            notas[i] = scan.nextInt();
        }
        for ( int x = 0; x<notas.length; x++){
            System.out.println("A nota "+ (x+1)+ " foi:" +notas[x]);
        }
        media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("A media das notas foi:"+media);
    }

}
