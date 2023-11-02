package Aula8;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int opt = 0;
        
        while(opt !=3){
        System.out.println("Digite o nome do Produto:");
        String nome = scan.next();
        System.out.println("Digite o custo:");
        double custo = scan.nextByte();
        System.out.println("Digite a quantidade:");
        double quantidade = scan.nextByte();
        
        
        double quantidadeTotal = 0;
        
        quantidadeTotal += quantidadeTotal;
        quantidadeTotal = quantidadeTotal + quantidade;
        
        
        double perca = quantidadeTotal * custo;
        
        
            System.out.println("A perca total é: R$"+perca);
            
            opt++;
            
            
        
        }
        
    }
}