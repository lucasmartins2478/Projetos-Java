package Aula6;
import java.util.Scanner;
public class Ex1 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int [] numeros = new int[5];
        
        for ( int i = 0; i<numeros.length; i++){
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
           
        }
        for (int x = 0; x<numeros.length; x++){
            System.out.println((x+1) + " numero e: "+numeros[x]);
        }
    }

}
