package POO_Aula2;

import java.util.Scanner;

public class Calculadora {
    
    int num1;
    int num2;
    
    public int somar(int num1 , int num2){
        return num1+num2;
    }
    public double somar(double num1 , double num2){
        return num1+num2;
    }
    public int subtrair(int num1 , int num2){
        return num1-num2;
    } 
    public double subtrair(double num1 , double num2){
        return num1-num2;
    }
    public int multiplicar(int num1 , int num2){
        return num1 * num2;
    }
    public double multiplicar (double num1 , double num2){
        return num1* num2;
    }
    public int dividir ( int num1 , int num2){
        return num1/num2;
    }
    public double dividir(double num1 , double num2){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        int opt = 0;
        double num1;
        double num2;
        
        System.out.println("\n Bem vindo a calculadora!\n");
        
        while(opt !=5){
        
            System.out.println("\nDigite a operacao que deseja realizar:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair\n");
            opt = scan.nextInt();
            
            if (opt == 5){
                break;
            }
            
            System.out.println("Digite um numero:");
            num1 = scan.nextByte();
            System.out.println("Digite outro numero:");
            num2 = scan.nextByte();
            
            
            
            switch(opt){
                
                case 1:
                    System.out.println(calculadora.somar(num1, num2));
                    break;
                    
                case 2:
                    System.out.println(calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println(calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(calculadora.dividir(num1, num2));
                    break;
                    
                case 5:
                    break;
                default :
                    System.out.println("Opcao invalida!");
            }
            
            
        
        }
        
    }
    
}
