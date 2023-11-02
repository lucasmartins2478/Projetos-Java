/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;

/**
 *
 * @author lucas
 */
public class FuncionarioMensalista extends Funcionario{
    
    
    private double salario;
    
    public FuncionarioMensalista(){
        super();
        
    }
    public FuncionarioMensalista(int numeroCracha , String nome , String setor , 
            String funcao , double salario){
        
        
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String imprimir(){
        return "\nCRACHA:"+super.getNumeroCracha()+"NOME:"+super.getNome()+"SETOR:"+super.getSetor()+
                "FUNCAO:"+super.getFuncao()+"SALARIO:"+salario+"\n";
    }
    @Override
    
    public String toString(){
        return "\nCRACHA:"+super.getNumeroCracha()+"\nNOME:"+super.getNome()+"\nSETOR:"+super.getSetor()+
                "\nFUNCAO:"+super.getFuncao()
                +"\nSALARIO:"+salario;
    }
    
    
}
