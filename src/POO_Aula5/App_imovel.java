/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;

import java.util.Scanner;
import java.util.ArrayList;


public class App_imovel {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Imovel> imoveis = 
                new ArrayList<Imovel>();

            boolean iniciar = true;
            while(iniciar == true){
            
                System.out.println("""

                    1 - Insereir Imovel
                    2 - Exibir Imoveis
                    3 - Sair

                    """);

                int opt = 0;
                opt = scan.nextInt();

                switch(opt){

                    case 1:
                    
                    System.out.println("""
                            O Imovel e:
                            1 - Novo
                            2 - Velho
                            """);
                    
                    opt = scan.nextInt();
                    if (opt ==1){
                        ImovelNovo imovel = new ImovelNovo();
                        System.out.println("Digite o codigo do imovel:");
                        imovel.setCodigo(scan.nextInt());
                        System.out.println("Digite o endereco do imovel:");
                        imovel.setEndereco(scan.next());
                        System.out.println("Digite o valor do imovel:");
                        imovel.setValor(scan.nextDouble());
                        System.out.println("Digite o valor adicional:");
                        imovel.setValorAdicional(scan.nextDouble());
                        System.out.println("Imovel cadastrado com sucesso!");
                        imoveis.add(imovel);
                        break;
                    }else if(opt == 2){
                        ImovelVelho imovel = new ImovelVelho();
                        System.out.println("Digite o codigo do imovel:");
                        imovel.setCodigo(scan.nextInt());
                        System.out.println("Digite o endereco do imovel:");
                        imovel.setEndereco(scan.next());
                        System.out.println("Digite o valor do imovel:");
                        imovel.setValor(scan.nextDouble());
                        System.out.println("Digite o valor de desconto:");
                        imovel.setValorDesconto(scan.nextDouble());
                        System.out.println("Imovel cadastrado com sucesso!");
                        imoveis.add(imovel);
                    }else {
                        System.out.println("Opcão digitada inválida!");
                        
                    }
                    break;
                    
                    case 2:
                        
                        for (Imovel imovei : imoveis) {
                            
                            System.out.println(imovei.toString());
                        }
                        break;
                        
                    case 3:
                        System.out.println("Saindo do Sistema");
                        iniciar = false;
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;

                }


            
        }
    }
    
}
