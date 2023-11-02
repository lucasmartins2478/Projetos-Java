package Exercicios;
import java.util.Scanner;
public class Calculadora {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a  calculadora!");
        int num1 = scan.nextInt();
        String sinal = scan.next();
        int num2 = scan.nextInt();
        
        if (sinal.equals("+")){
            int resultado = num1 + num2;
            System.out.println(resultado);
        }else if (sinal.equals("-")){
            int resultado = num1 - num2;
            System.out.println(resultado);
        }else if(sinal.equals("*")){
            int resultado = num1 * num2;
            System.out.println(resultado);
        }else if (sinal.equals("/")){
            float resultado = num1 / num2;
            System.out.println(resultado);
        }
    }

}
