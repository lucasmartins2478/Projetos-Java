package Aula8;
import java.util.Scanner;
public class Pratica {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numerosPares = new int [11];
        int read = 0;
        int qtd = 1;
        int soma = 0;
        
        while (qtd < 11){
            System.out.println("Digite um numero:");
            read = scan.nextInt();
            if ( read %2 ==0){
                numerosPares[qtd] = read;
                qtd++;
            }
           
        }
        for ( int x = 1; x<qtd; x++){
            if( x % 2 != 0){
            soma += numerosPares[x];
            }
        }
        System.out.println(soma);
        
    }

}
