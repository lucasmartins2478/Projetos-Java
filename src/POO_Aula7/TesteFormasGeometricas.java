/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class TesteFormasGeometricas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<FormaGeometrica> formas = 
                new ArrayList<>();
        
        boolean iniciar = true;
        
        while(iniciar = true){
            System.out.println("1 - Inserir Formas Geometricas");
            System.out.println("2 - Mostrar Formas Inseridas");
            System.out.println("3 - Sair");
            
            int opt = scan.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.println("Qual a forma geometrica:");
                    System.out.println("1 - Circulo");
                    System.out.println("2 - Retangulo");
                    opt = scan.nextInt();
                    if(opt == 1){
                        System.out.println("Digite o valor do raio:");
                        double raio = scan.nextDouble();
                        Circulo c = new Circulo(raio);
                        c.setRaio(raio);
                        formas.add(c);
                    }else if(opt == 2){
                        System.out.println("Digite o valor da largura:");
                        double largura = scan.nextDouble();
                        System.out.println("Digite o valor da altura:");
                        double altura = scan.nextDouble();
                        Retangulo r = new Retangulo(largura, altura);
                        r.setAltura(altura);
                        r.setLargura(largura);
                        formas.add(r);   
                    }
                    else{
                        System.out.println("Opcao invalida!");
                    }
                    break;
                    
                case 2:
                    for (FormaGeometrica forma : formas) {
                        System.out.println(forma.toString());
                        
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Sistema!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
    
}
