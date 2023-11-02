/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class App_funcionario {
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Funcionario>funcionarios = 
             new ArrayList<>();
     
        boolean iniciar = true;
     
        while(iniciar = true){
            
            System.out.println("""
                               1 - Inserir Funcionario
                               2 - Exibir Funcionarios
                               3 - Sair
                               
                               """);
            int opt = scan.nextInt();
            
            switch(opt){
                case 1:
                    int codigoFuncionario =1;
                    System.out.println("Digite o tipo de contrato:");
                    System.out.println("1 - Mensalista");
                    System.out.println("2 - Horista");
                    opt = scan.nextInt();
                    if(opt == 1){
                        FuncionarioMensalista funcionario = new FuncionarioMensalista();
                        funcionario.setNumeroCracha(codigoFuncionario);
                        System.out.println("Digite o nome:");
                        funcionario.setNome(scan.next());
                        System.out.println("Digite setor:");
                        funcionario.setSetor(scan.next());
                        System.out.println("Digite a funcao:");
                        funcionario.setFuncao(scan.next());
                        System.out.println("Digite o salario:");
                        funcionario.setSalario(scan.nextFloat());
                        funcionarios.add(funcionario);
                        codigoFuncionario++;
                        break;
                        
                    }else if(opt == 2){
                        FuncionarioHorista funcionario = new FuncionarioHorista();
                        funcionario.setNumeroCracha(codigoFuncionario);
                        System.out.println("Digite o nome:");
                        funcionario.setNome(scan.next());
                        System.out.println("Digite setor:");
                        funcionario.setSetor(scan.next());
                        System.out.println("Digite a funcao:");
                        funcionario.setFuncao(scan.next());
                        System.out.println("Digite o valor da hora:");
                        funcionario.setValorHora(scan.nextByte());
                        System.out.println("Digite a quantidade de horas:");
                        funcionario.setQtdHoras(scan.nextInt());
                        System.out.println("Funcionario cadastrado!");
                        funcionarios.add(funcionario);
                        codigoFuncionario++;
                        break;
                    }else{
                        System.out.println("Opcao invalida");
                        break;
                    }
                case 2:
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println(funcionario.toString());
                        
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Sistema!");
                    iniciar = false;
                    break;
            }
            
        }
    }
    
}
