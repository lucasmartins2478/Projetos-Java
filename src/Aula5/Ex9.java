package Aula5;
import java.util.Scanner;
public class Ex9 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int somaIdade = 0;
        int idade = 0;
        int peso = 0;
        int mediaIdade = 0;
        int count = 6;
        int div = 1;
        int altoPeso = 0;
        
        while(count >= 0){
            System.out.println("/////////////////////");
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
            System.out.println("Digite seu peso em Kg:");
            peso = scan.nextInt();
            
            if (peso > 90){
                altoPeso ++;
            }
            somaIdade += idade;
            
            mediaIdade = somaIdade / div;
            
            div++;
            count--;
            
        }
        System.out.println("A quantidade de pessoas com mais de 90Kg e:"+altoPeso);
        System.out.println("A media das idades e:"+mediaIdade);
    }

}
