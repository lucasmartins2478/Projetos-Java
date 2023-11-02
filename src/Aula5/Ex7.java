package Aula5;
import java.util.Scanner;
public class Ex7 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //declara as variaveis
        double aumento = 0.2;
        double valorAumento = 0;
        double valorCusto = 0;
        double mediaCusto = 0;
        double mediaAumento = 0;
        int codigoProduto = 0;
        int div = 1;
        double num1 = 0;
        double num2 = 0;
        
        // enquanto o numero digitado for positivo o while continua 
        while (codigoProduto >= 0){
            System.out.println("Digite o codigo do produto:");
            codigoProduto = scan.nextInt();
            
            // processa os dados para saida
            if ( codigoProduto >= 0){
                System.out.println("Digite o valor do custo:");
                valorCusto = scan.nextDouble();
                valorAumento = (valorCusto * aumento) + valorCusto;
                
                num1 += valorCusto;  
                mediaCusto =  num1 / div ;
                
                num2 += valorAumento;
                mediaAumento = num2 / div;
                
                div++;
                
                // saida visual dos dados
                System.out.println("/////////////////////");
                System.out.println("Produto:"+codigoProduto);
                System.out.println("Preco custo:"+valorCusto);
                System.out.println("Preco com aumento:"+valorAumento);
                System.out.println("Media de custo:"+mediaCusto);
                System.out.println("Media com aumento:"+mediaAumento);
            }
        }
        
        
    }

}
