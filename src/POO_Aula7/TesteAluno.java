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
public class TesteAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> alunos = 
                    new ArrayList<>();
        
        
        boolean iniciar = true;
        
        while(iniciar = true){
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Exibir alunos");
            System.out.println("3 - Sair");
            
            
            int opt = scan.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Digite o tipo de aluno");
                    System.out.println("1 - Aluno graduacao");
                    System.out.println("2 - Aluno pos");
                    
                    opt = scan.nextInt();
                    if(opt == 1){
                        AlunoGraduacao al = new AlunoGraduacao();
                        System.out.println("digite o ra:");
                        al.setRa(scan.next());
                        System.out.println("Digite o nome:");
                        al.setNome(scan.next());
                        System.out.println("Digite o curso:");
                        al.setCurso(scan.next());
                        System.out.println("Digite a nota da AC1:");
                        al.setAc1(scan.nextDouble());
                        System.out.println("Digite a nota da AC2:");
                        al.setAc2(scan.nextDouble());
                        System.out.println("Digite a nota da AG:");
                        al.setAg(scan.nextDouble());
                        System.out.println("Digite a nota da AF:");
                        al.setAf(scan.nextDouble());
                        System.out.println("Digite o ano de conclusao do ensino medio:");
                        al.setAnoConclusaoEnsinoMedio(scan.next());
                        alunos.add(al);
                        break;
                    }else  if(opt == 2){
                        AlunoPos al = new AlunoPos();
                        System.out.println("digite o ra:");
                        al.setRa(scan.next());
                        System.out.println("Digite o nome:");
                        al.setNome(scan.next());
                        System.out.println("Digite o curso:");
                        al.setCurso(scan.next());
                        System.out.println("Digite a nota da prova 1:");
                        al.setNota1(scan.nextDouble());
                        System.out.println("Digite a nota da prova 2:");
                        al.setNota2(scan.nextDouble());
                        System.out.println("Digite o ano de conclusao da graduacao:");
                        al.setAnoConclusaoGraduacao(scan.next());
                        alunos.add(al);
                        break;
                    }else{
                        
                        System.out.println("Opcao invalida!");
                        break;
                    }
                    
                case 2:
                    for (Aluno aluno : alunos) {
                        System.out.println(aluno.toString());
                        
                    }
                    break;
                case 3:
                    System.out.println("Fechando sistema!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
        }
        
    }
 
}
