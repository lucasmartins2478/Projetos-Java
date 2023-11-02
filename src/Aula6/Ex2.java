package Aula6;
import java.util.Scanner;
public class Ex2 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int[] numeros = new int [10];
        
        for ( int i = 0; i<numeros.length; i++){
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Os numeros na ordem inversa são:");
        for ( int x = 9; x>=0; x--){
            System.out.println(numeros[x]);
        }
    }

}
