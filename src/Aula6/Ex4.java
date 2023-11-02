package Aula6;
import java.util.Scanner;
public class Ex4 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int [5];
        int multiplicacao = 0;
        int soma = 0;
        
        for (int i = 0; i<numeros.length; i++){
            System.out.println("Digite um numero:");
            numeros[i] = scan.nextInt();
        }
        for(int x = 0; x<numeros.length; x++){
            System.out.println("O "+(x+1)+" numero foi"+ numeros[x]);
        }
        
        soma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];
        multiplicacao = numeros[0]*numeros[1]*numeros[2]*numeros[3]*numeros[4];
        
        System.out.println("A soma dos numeros e:"+soma);
        System.out.println("A multiplicacao dos numeros e:"+multiplicacao);
    }

}
