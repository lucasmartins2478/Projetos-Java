package Aula4;
import java.util.Scanner;
public class Ex2 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("////////////////////////////");
        System.out.println("100    cachorro quente   R$1,70");
        System.out.println("101    Bauru simples     R$ 2,30");
        System.out.println("102    Bauru com ovo     R$ 2,60");
        System.out.println("103    Hamburguer        R$ 2,40");
        System.out.println("104    Cheese burguer    R$ 2,50");
        System.out.println("105    Refrigerante      R$ 1,00");
        System.out.println("///////////////////////////");
        System.out.println("Qual o código do produto adquirido?");
        int codigo = sc.nextInt();
        System.out.println("Qual a quantidade de produtos?");
        int quantidade = sc.nextInt();
        
        switch (codigo){
            case 100:
                double valorcachorro = 1.70*quantidade;
                System.out.println("O valor da compra é:R$"+valorcachorro);
                break;
            case 101:
                double valorbauru = 2.30 *quantidade;
                System.out.println("O valor da compra séra"+valorbauru);
                break;
            case 102:
                
                break;
            case 103:
        }
    }
}
